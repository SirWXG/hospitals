package com.bank.controller;

import com.bank.dubbo.streamlineService;
import com.bank.dubbo.taskService;
import com.bank.pojo.Tasks;
import com.bank.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private taskService task;


    @RequestMapping("select")
    @ResponseBody
    public Msg getAlltask(@RequestParam(name = "type", defaultValue = "wait") String type, @RequestParam(name = "taskId",defaultValue = "-1")int taskId){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        session.setAttribute("empId",1);
        Msg data=new Msg();
        Map<String,Object> map =new HashMap<>();
        if("wait".equals(type)){
            map.put("nextEmpid",session.getAttribute("empId"));
        }else if("done".equals(type)){
            map.put("checkEmpid",session.getAttribute("empId"));
        }else if ("create".equals(type))
            map.put("taskEmpid",session.getAttribute("empId"));
        if (taskId!=-1)
            map.put("taskId",taskId);
        List<Tasks> list1=task.getAll(map);
        data.setData(list1);
        data.setCount(list1.size());
        data.setCode(0);
        data.setMsg("");
        return data;
    }
    @RequestMapping("add")
    @ResponseBody
    public String addTask(Tasks tasks){
        int add = task.add(tasks);
        if (add>0){
            return "success";
        }
        return "failed";
    }
    @Autowired
    private streamlineService streamService;
    @RequestMapping("open/{taskid}")
    public String getTheOne(@PathVariable(name = "taskid")String taskId, Model model){

        model.addAttribute("streamline",streamService.getTheone(taskId));
        Map<String ,Object> map = new HashMap<>();
        map.put("taskId",taskId);
        model.addAttribute("task",task.getAll(map));
        return "/view/task/lookone";

    }
}
