<%--
  Created by IntelliJ IDEA.
  User: wanxugang
  Date: 2019/1/18
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>
<body>
<script type="text/javascript">
    $(function () {
        $.ajax({
            url:"/card/selectAllCard",
            type:"get",
            success:function(data){
                var item = data.data;
                $.each(item,function(index,items){

                })
            }
        });
    })
</script>

<div class="layui-form">
    <table class="layui-table">
        <colgroup>
            <col width="300">
            <col width="300">
            <col width="300">
            <col width="300">
            <col width="300">
            <col>
        </colgroup>
        <thead>
        <tr>
            <th>银行卡号</th>
            <th>身份证</th>
            <th>绑定电话</th>
            <th>办卡时间</th>
            <th>真实姓名</th>
            <th>状态</th>
        </tr>
        </thead>
        <tbody>
             <th></th>
        </tbody>
    </table>
</div>
</body>
</html>
