<%--
  Created by IntelliJ IDEA.
  User: wanxugang
  Date: 2019/1/15
  Time: 20:09
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
    <legend>新增银行卡</legend>
</fieldset>
<script type="text/javascript">
    $(function () {
        $("input[name='customerId']").blur(function () {
            var customerIdentity = $("input[name='customerId']").val();
            if(customerIdentity==null||customerIdentity.trim().length<17){
                alert("格式错误,");
                return false;
            }else{
                $.ajax({
                    url:"/customer/checkCustomer?",
                    type:"get",
                    data:{
                        customerIdentity:customerIdentity
                    },
                    success:function(data){
                        if(data.code==1){
                            layer.open({
                                title: '信息提示'
                                ,area: ['500px','200px']
                                ,content:'<div>查无此用户,请<a href="/view/service/regist.jsp" target="option">注册</a></div>'
                            })
                        }
                    }
                })
            }

        })
    })
</script>
<form class="layui-form" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">身份证</label>
        <div class="layui-input-block">
            <input type="text" name="customerId" lay-verify="identity" placeholder="" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">绑定手机</label>
            <div class="layui-input-inline">
                <input type="tel" name="cardPhone" lay-verify="required|phone" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">开通日期</label>
            <div class="layui-input-inline">
                <input type="text" name="cardDate" id="date" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">银行卡密码</label>
        <div class="layui-input-inline">
            <input type="password" name="cardPassword" lay-verify="pass" placeholder="请输入密码" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-form-mid layui-word-aux">请填写6位密码</div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">存款金额</label>
            <div class="layui-input-inline" style="width: 100px;">
                <input type="text" name="cardBalance" placeholder="￥" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">账户状态</label>
        <div class="layui-input-block">
            <input type="checkbox" name="cardStatus" checked="" lay-skin="switch" lay-text="正常|冻结">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
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
            pass: [
                /^[0-9]{6}$/
                ,'密码必须为纯数字6位，且不能出现空格'
            ]
            ,content: function(value){
                layedit.sync(editIndex);
            }
        });

        //监听指定开关
        form.on('switch(switchTest)', function(data){
            layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });
            layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });

        //监听提交
        form.on('submit(demo1)', function(data){
            $.ajax({
                url:"/card/addCard",
                type:"post",
                data:data.field,
                success:function () {
                    layer.alert("新增银行卡成功",{
                        title:"提示信息"
                    })
                }
            })
            return false;
        });
    });
</script>
</body>
</html>
