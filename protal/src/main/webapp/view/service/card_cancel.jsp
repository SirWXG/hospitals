<%--
  Created by IntelliJ IDEA.
  User: wanxugang
  Date: 2019/1/19
  Time: 14:30
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
    $(function(){
        $("#checkCard").click(function(){
            var cardsId = $("input[name='cardIds']").val();
            var cardIdentitys = $("input[name='cardIdentitys']").val();
            if(cardsId==null||cardsId.trim().length<1||cardIdentitys==null||cardIdentitys.trim().length<1){
                layer.alert("信息不能为空",{
                    title:"提示信息"
                })
                return false;
            }
            $.ajax({
                url:"/card/selectCardToId",
                type:"get",
                data:{
                    cardIds:$("input[name='cardIds']").val(),
                    cardIdentitys:$("input[name='cardIdentitys']").val()
                },
                success:function (data) {
                    if(data.cardId==null){
                        layer.alert("查无此信息",{
                            title:"提示信息"
                        });
                    }
                    $("#card").val(data.cardId);
                    $("#identity").val(data.cardIdentity);
                    $("#phone").val(data.cardPhone);
                    $("#name").val(data.realName);
                    $("#birth").val(data.cardDate);
                    if(data.cardStatus==null||data.cardStatus.trim().length<1){
                        $("#cardStatus").html("<font color='red'>已冻结</font>");
                    }else if(data.cardStatus=="break"){
                        $("#cardStatus").html("<font color='#ff8c00'>已注销</font>");
                    }else{
                        $("#cardStatus").html("<font color='green'>正常使用</font>");
                    }
                }
            })
            return false;
        });
    })
</script>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>查询条件</legend>
</fieldset>
<form class="layui-form" action="" lay-filter="example">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">银行卡号</label>
            <div class="layui-input-inline">
                <input type="text" name="cardIds" lay-verify="required" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">身份证</label>
            <div class="layui-input-inline">
                <input type="text" name="cardIdentitys" lay-verify="required" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <div class="layui-form-item layui-input-inline">
                <button id="checkCard" class="layui-btn" lay-submit="" lay-filter="demo2">查询</button>
            </div>
        </div>
    </div>
</form>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>银行卡信息</legend>
</fieldset>
<div class="layui-form layui-form-pane">
    <div class="layui-form-item">
        <label class="layui-form-label">银行卡号</label>
        <div class="layui-input-inline">
            <input type="text" id="card" autocomplete="off" placeholder="请输入标题" class="layui-input" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">身份证号</label>
        <div class="layui-input-inline">
            <input type="text" id="identity" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input" disabled>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">绑定手机</label>
            <div class="layui-input-block">
                <input type="text" id="phone"  autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">真实姓名</label>
            <div class="layui-input-inline">
                <input type="text" id="name" autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">办卡日期</label>
            <div class="layui-input-inline" style="width: 100px;">
                <input type="text" id="birth"  autocomplete="off" class="layui-input" disabled>
            </div>
        </div>
    </div>
    <div class="layui-form-item" pane="">
        <label class="layui-form-label">状态</label>
        <div class="layui-input-block">
            <span id="cardStatus" autocomplete="off" class="layui-input" disabled></span>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
         <button id="" class="layui-btn layui-btn-danger">注销</button>
    </div>
</div>
</div>
<script type="text/javascript">
    $(function () {
        $("button").click(function(){
            $.ajax({
                url:"/card/cancelCard",
                type:"get",
                data:{
                    cardIds:$("#card").val(),
                    cardIdentitys:$("#identity").val(),
                    cardStatus:"break"
                },
                success:function(data){
                    if(data.cardStatus==null||data.cardStatus.trim().length<1){
                        $("#cardStatus").html("<font color='red'>已冻结</font>");
                    }else if(data.cardStatus=="break"){
                        $("#cardStatus").html("<font color='#ff8c00'>已注销</font>");
                    }else{
                        $("#cardStatus").html("<font color='green'>正常使用</font>");
                    }
                }
            })
            return false;
        });
    })
</script>
</body>
</html>
