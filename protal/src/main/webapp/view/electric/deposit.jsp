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
    <title>定期存款业务</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<div style="height: 10px"></div>
<form class="layui-form" action="">

    <div class="layui-form-item">

        <div class="layui-inline">
            <label class="layui-form-label">用户身份证号</label>
            <div class="layui-input-inline">
                <input type="text" name="customerId" value="" lay-verify="customerId" placeholder="请输入有限身份证号"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">无此用户？</label>
            <div class="layui-input-inline">
                <a href="#" target="option">注册一个新用户</a>
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" id="tijiao" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
    <div class="layui-form-item">

        <div class="layui-inline">
            <label class="layui-form-label">客户真实姓名</label>
            <div class="layui-input-inline">
                <input type="text" readonly="readonly" name="realname" value="" autocomplete="off" placeholder="请先查询"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">用户信用度</label>
            <div class="layui-input-inline">
                <input type="text" readonly="readonly" name="customerCredit" class="layui-input">
            </div>
        </div>
    </div>

</form>


<hr></hr>
<%--存款信息填写表--%>
<form class="layui-form" action="">
    <input name="customerIdentity" type="hidden">
    <input name="money" type="hidden">
    <div class="layui-form-item">
        <label class="layui-form-label">存款金额</label>
        <div class="layui-input-block">
            <input type="text" name="deposit" value="" lay-verify="deposit" placeholder="请输入存款金额" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">

        <div class="layui-inline">
            <label class="layui-form-label">银行卡号</label>
            <div class="layui-input-inline">
                <select name="depositRate" lay-verify="depositTerm" lay-search="">
                    <option value="">直接选择或搜索选择</option>
                </select>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">银行卡密码</label>
            <div class="layui-input-inline">
                <select name="depositTerm" lay-verify="depositTerm" lay-search="">
                    <option value="3">3个月</option>
                    <option value="6">6个月</option>
                    <option value="12">12个月</option>
                    <option value="24">24个月</option>
                    <option value="36">36个月</option>
                    <option value="48">48个月</option>
                    <option value="60">60个月</option>
                </select>
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="demo2">立即提交</button>
            <button type="reset" id="recash" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>

</form>


<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>

    //layui加载事件

    $.ajax({
        url: "/card/getcard",
        type: "get",
        success: function (mres) {
            $.each(mres, function (index, item) {
                // alert(JSON.stringify(item));
                $("select:eq(0)").append($("<option>").attr("value", item.cardId).text(item.cardId));
            })
        }
    });

    layui.use('form', function () {
        var form = layui.form;
        //刷新页面数据
        form.render();

        //监听提交查询用户是否存在
        form.on('submit(demo1)', function (data) {
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            $("input[name='customerIdentity']").attr("value", data.field.customerId);
            $.ajax({
                url: "/customer/checkCustomer",
                type: "get",
                data: {"customerIdentity": data.field.customerId},
                success: function (res) {
                    alert(JSON.stringify(res));
                    $.each(res.data, function (index, item) {
                        // alert(item.cardBalance);
                        $("input:read-only")[0].value = item.realName;
                        $("input:read-only")[1].value = item.customerCredit;
                        $("input[name='customerIdentity']").attr("value", item.customerIdentity);
                    })
                }
            })
            return false;
        });
        //自定义验证规则
        form.verify({
            deposit: function (value) {
                if (value <= 0) {
                    return '不能存款';
                }
            }, carpass: [
                /^[\S]{6}$/
                , '密码必须6位，且不能出现空格'
            ], customerId: [
                /^[\d]{18}$/
                , '身份证号必须18位，且不能出现空格'
            ]
        })
        //监听提交存款
        form.on('submit(demo2)', function (data) {
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            });
            // $.ajax({
            //     url:"/card/update",
            //     type:"post",
            //     data:{"cardId":data.field.outCard,"cardBalance":money
            //         ,"cardOther":data.field.cash,"cardStatus":"in"},
            //     success:function (res) {
            //       if(res==1){
            //           layer.alert("存款成功");
            //       }else
            //           layer.alert("存款失败");
            //         $("#tijiao").click();
            //         $("#recash").click();
            //     }
            // });
            return false;
        });

    });

</script>

</body>
</html>