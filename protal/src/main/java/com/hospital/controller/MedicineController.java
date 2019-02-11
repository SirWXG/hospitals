package com.hospital.controller;

import com.hospital.dubbo.MedicineService;
import com.hospital.dubbo.SolrService;
import com.hospital.pojo.Medicine;
import com.hospital.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/medicine")
public class MedicineController {
    @Autowired
    private MedicineService medicinePro;
    @Autowired
    private SolrService solrServicePro;
    //查询所有的药品
    @RequestMapping("/all")
    @ResponseBody
    public List<Medicine> getAll(){
        Map<String,Object> map = new HashMap<>();
       List<Medicine> list= medicinePro.getAllMedicine(map);
        System.out.println(list);
return list;
    }
    @RequestMapping("/allsolr")
    @ResponseBody
    public Msg getFromSolr(@RequestParam(name = "key",defaultValue = "")String key,
                           @RequestParam(name="page",defaultValue="1")int page,
                           @RequestParam(name="limit",defaultValue="10")int size, Model model) throws UnsupportedEncodingException {
        if(!com.mysql.jdbc.StringUtils.isNullOrEmpty(key)){
            key=new String(key.getBytes("iso-8859-1"), "utf-8");
        }
        Map<String,Object> map = solrServicePro.Solr2Medicine(key,page,size);
        Msg msg=new Msg();
        msg.setCode(0);
        msg.setCount((int)((long)map.get("count")));
        msg.setData((List<Medicine>) map.get("result"));
        System.out.println(map);
        return msg;
    }

    @RequestMapping("/add2solr")
    @ResponseBody
    public Msg addData2Solr(){
        solrServicePro.Medicine2Solr();
        Msg msg =new Msg();
        msg.setCode(0);
        msg.setMsg("success");
        return msg;
    }
}
