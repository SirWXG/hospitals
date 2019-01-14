<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\1\11 0011
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <meta charset="utf-8">
    <title>任务流程详细</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css"  media="all">
    <script src="/js/jquery.js" ></script>
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
    <legend>任务流程详细</legend>
</fieldset>
<ul class="layui-timeline">
    <c:forEach items="${task}" var="tt">
    <div class="layui-col-md12">
        <div class="layui-card">
            <div class="layui-card-header">${tt.taskTitle}</div>
            <div class="layui-card-body">
                    ${tt.taskInfo}
            </div>
        </div>
    </div>
    </c:forEach>
    <c:forEach items="${streamline}" var="str">
    <li class="layui-timeline-item">
        <i class="layui-icon layui-timeline-axis"></i>
        <div class="layui-timeline-content layui-text">
            <h3 class="layui-timeline-title"> ${str.streamlineName}</h3>
            <p>
                审批意见： ${str.streamlineInfo}<br><br>
                审批结果：   ${str.streamlineResult}<br><br>
                    审批人：  ${str.emp.empName}
                   <span style="padding: 50px"> 审批时间： <fmt:formatDate value="${str.streamlineDate}" pattern="yyyy-MM-dd hh:mm:ss"></fmt:formatDate></span>
            </p>
        </div>
    </li>
    </c:forEach>

    <li class="layui-timeline-item">
        <i class="layui-icon layui-timeline-axis"></i>
        <div class="layui-timeline-content layui-text">
            <div class="layui-timeline-title">过去</div>
        </div>
    </li>
</ul>
<button class="layui-btn layui-btn-primary layui-btn-radius"><a href="javascript:history.go(-1);">返回上一页</a></button>

<div style="display: ${streamline[fn:length(streamline)-1].nextEmpid==sessionScope.empId?"block":"none"}">
        <form class="layui-form" action="/tasks/addline" lay-filter="example">
            <input name="streamlineOther" type="hidden" value="${task[0].taskId}">
            <input name="checkEmpid" type="hidden" value="${sessionScope.empId}">
            <input name="streamlineName" type="hidden" id="streamlineName">
            <input name="lastId" type="hidden" value="${streamline[fn:length(streamline)-1].checkEmpid}">
            <h3 class="layui-timeline-title" id="streamName"><span><c:set var="ac" value="${streamline[fn:length(streamline)-1].streamlineName}"> </c:set><c:choose>
                <c:when test="${ac=='初审'}">复核</c:when><c:when test="${ac=='复核'}">批准</c:when>
           </c:choose> </span></h3>
            <div class="layui-form-item">
                <label class="layui-form-label">审批意见</label>
                <div class="layui-input-block">
                  <input type="radio" name="streamlineResult" value="agree" title="同意" checked="" />
                    <input type="radio" name="streamlineResult" value="disagree" title="不同意" />
                </div>
            </div>

            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">审批意见内容补充</label>
                <div class="layui-input-block">
                    <textarea placeholder="请输入内容" class="layui-textarea" name="streamlineInfo"></textarea>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">请选择下一步处理人</label>
            <div class="layui-input-inline">
                <select name="nextEmpid" id="nextempid">
                   <option value="" >归档</option>
                </select>
            </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
                </div>
            </div>
        </form>
</div>


<script src="/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    $.ajax({
        url:"/emps/select",
        method:"get",
        success:function (data) {
            $.each(data,function (index,item) {
                $("#nextempid").append($("<option>").attr("value",item.empId).text(item.empName));
            })
        }
    });
    $("#streamlineName").val($("#streamName").text().replace(new RegExp("\n","g"),""));
    layui.use('form',function(){

        var form = layui.form;
        //刷新界面 所有元素
        form.render("");
        form.on('submit(demo1)', function(data){
            $("#streamlineName").val($("#streamName").text());
           $.ajax({
               url:"/tasks/addline",
               type:"post",
               data:data.field,
               success:function(res){
                   alert(res);
               }
           })
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });
    });
</script>

</body>
</html>
