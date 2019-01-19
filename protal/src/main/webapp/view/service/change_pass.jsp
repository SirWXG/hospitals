<%--
  Created by IntelliJ IDEA.
  User: wanxugang
  Date: 2019/1/19
  Time: 15:31
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
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>用户密码修改</legend>
</fieldset>
<form class="layui-form layui-form-pane" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">银行卡号</label>
        <div class="layui-input-block">
            <input type="text" name="cardId" autocomplete="off" placeholder="请输入标题" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">身份证号</label>
        <div class="layui-input-inline">
            <input type="text" name="cardIdentity" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">旧密码</label>
        <div class="layui-input-inline">
            <input type="password" name="cardPassword" placeholder="请输入密码" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-form-mid layui-word-aux">请务必输入身份证号</div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">新密码</label>
            <div class="layui-input-block">
                <input type="password" name="newPassword"  autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">重复新密码</label>
            <div class="layui-input-inline">
                <input type="password" name="replacePass" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <button class="layui-btn" lay-submit="" lay-filter="demo2">跳转式提交</button>
    </div>
</form>
<script type="text/javascript">
    $(function () {
        $("button").click(function(){
            var np = $("input[name='newPassword']").val();
            var rp = $("input[name='replacePass']").val();
            if(np!=rp){
                alert("两次密码输入不一致")
                return false;
            }
            $.ajax({
                url:"/card/updateCardPass?",
                type:"get",
                data:{
                    cardId:$("input[name='cardId']").val(),
                    cardIdentity:$("input[name='cardIdentity']").val(),
                    cardPassword:$("input[name='cardPassword']").val(),
                    newPassword:$("input[name='newPassword']").val(),
                    replacePass:$("input[name='replacePass']").val()
                },
                success:function(data){
                    if(data.code==1){
                        alert(data.msg);
                    }else if(data.code==2){
                        alert(data.msg);
                    }else{
                        alert("信息修改成功");
                    }
                }
            })
            return false;
        });
    })
</script>
</body>
</html>
