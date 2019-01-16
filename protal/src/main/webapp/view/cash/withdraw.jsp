<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\1\16 0016
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <meta charset="utf-8">
    <title>银行卡现金业务</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css"  media="all">
    <script src="/js/jquery.js" ></script>
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<div style="height: 10px"></div>
<form class="layui-form" action="">

    <div class="layui-form-item">

        <div class="layui-inline">
            <label class="layui-form-label">银行卡号</label>
            <div class="layui-input-inline">
                <select name="cardId" lay-verify="required" lay-search="">
                    <option value="">直接选择或搜索选择</option>
                </select>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">银行卡密码</label>
            <div class="layui-input-inline">
                <input type="password" name="cardpass" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<div class="layui-form-item">
    <label class="layui-form-label">银行卡余额</label>
    <div class="layui-input-block">
        <input type="text" disabled="disabled" name="title" lay-verify="title" autocomplete="off" placeholder="请先查询" class="layui-input">
    </div>
</div>






<script src="/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    //给卡号输入框赋值
    $.ajax({
        url:"/card/getcard",
        type:"get",
        success:function (mres) {
            $.each(mres,function(index,item){
                $("select:eq(0)").append($("<option>").attr("value",item.cardId).text(item.cardId));
            })
        }
    })
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;




        //监听提交
        form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            $.ajax({
                url:"/card/select",
                type:"post",
                data:data.field,
                success:function (money) {
                    $.each(money,function (index,item) {
                        alert(JSON.stringify(item));
                        $("input:disabled")[0].val(item.cardBalance);
                    })
                }
            })
            return false;
        });
        form.render("");
        // //表单初始赋值
        // form.val('example', {
        //     "username": "贤心" // "name": "value"
        //     ,"password": "123456"
        //     ,"interest": 1
        //     ,"like[write]": true //复选框选中状态
        //     ,"close": true //开关状态
        //     ,"sex": "女"
        //     ,"desc": "我爱 layui"
        // })

    });
</script>

</body>
</html>