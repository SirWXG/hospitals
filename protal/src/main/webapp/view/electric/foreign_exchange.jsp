<%--
  Created by IntelliJ IDEA.
  User: wanxugang
  Date: 2019/1/19
  Time: 17:21
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
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>外汇兑换</legend>
</fieldset>

<form class="layui-form" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">兑换金额</label>
        <div class="layui-input-block">
            <input type="text" name="number" lay-verify="title" autocomplete="off" placeholder="请输入金额" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">原始货币</label>
        <div class="layui-input-block">
            <input type="text" name="foreign" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">目标货币</label>
        <div class="layui-input-block">
            <input type="text" name="money" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
        </div>
    </div>
    <div style="width: 216px; margin: 0;" align="center">
        <!-- layui 2.2.5 新增 -->
        <button class="layui-btn layui-btn-fluid">货币转换</button>
    </div>
</form>
<script type="text/javascript">
    $(function () {
        $("button").click(function(){
            $.ajax({
                url:"/money/exchangeMoney",
                type:"get",
                data:{
                    foreign:$("input[name='foreign']").val(),
                    money:$("input[name='money']").val()
                },
                success:function(data){

                }
            })
        });
    })
</script>
</body>
</html>
