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
    $(function(){
        $("#open").hide();
        $("button").click(function(){
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
                        $("#open").hide();
                        $("#close").show();
                    }else{
                        $("#cardStatus").html("<font color='green'>正常使用</font>");
                        $("#close").hide();
                        $("#open").show();
                    }
                }
            })
            return false;
        });
    })
</script>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>银行卡业务处理</legend>
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
                <button class="layui-btn" lay-submit="" lay-filter="demo2">查询</button>
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
    <div class="layui-form-item" id="close">
        <label class="layui-form-label">更改状态</label>
        <div class="layui-input-block">
            <input type="checkbox" name="close" lay-skin="switch" lay-filter="switchTest" lay-text="正常|冻结">
        </div>
    </div>
    <div class="layui-form-item" id="open" type="hidden">
        <label class="layui-form-label">更改状态</label>
        <div class="layui-input-block">
            <input type="checkbox" checked="" name="open" lay-skin="switch" lay-filter="switchTest" lay-text="正常|冻结">
        </div>
    </div>

</div>
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date'
        });
        laydate.render({
            elem: '#date1'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
            title: function(value){
                if(value.length < 5){
                    return '标题至少得5个字符啊';
                }
            }
            ,pass: [
                /^[\S]{6,12}$/
                ,'密码必须6到12位，且不能出现空格'
            ]
            ,content: function(value){
                layedit.sync(editIndex);
            }
        });

        //监听指定开关
        form.on('switch(switchTest)', function(data){
            $.ajax({
                url:"/card/updateCardStatus",
                type:"get",
                data:{
                    cardIds:$("input[name='cardIds']").val(),
                    cardIdentitys:$("input[name='cardIdentitys']").val(),
                    cardStatus:this.checked?'true':'false'
                },
                success:function(data){
                    if(data.cardStatus==null||data.cardStatus.trim().length<1){
                        $("#cardStatus").html("<font color='red'>已冻结</font>");
                    }else{
                        $("#cardStatus").html("<font color='green'>正常使用</font>");
                    }
                }
            })
            return false;
        });

        //监听提交
        form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });


    });
</script>
</body>
</html>
