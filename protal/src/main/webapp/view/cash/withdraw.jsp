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
    <script src="${pageContext.request.contextPath}/js/jquery.js" ></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css"  media="all">
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
                <input type="password" name="cardpass" lay-verify="carpass" autocomplete="off" class="layui-input">
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
        <label class="layui-form-label">银行卡余额</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" name="title" value="" lay-verify="title" autocomplete="off" placeholder="请先查询" class="layui-input">
        </div>
    </div>
</form>

<hr></hr>

<form class="layui-form" action="">
    <input name="outCard" type="hidden">
    <input name="money" type="hidden">
    <div class="layui-form-item">
        <label class="layui-form-label">取款金额</label>
        <div class="layui-input-block">
            <input type="text" name="cash" value="" lay-verify="money"  placeholder="0.00" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="demo2">立即提交</button>
            <button type="reset" id="reset2" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>

</form>


<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>

    //给卡号输入框赋值
$(document).ready(function () {
    $.ajax({
        url:"/card/getcard?ii="+Math.random(10),
        type:"get",
        success:function (mres) {
            $.each(mres,function(index,item){
                // alert(JSON.stringify(item));
                $("select:eq(0)").append($("<option>").attr("value",item.cardId).text(item.cardId));
            })
        }
    });
});



   // $("select:eq(0)").append($("<option>").attr("value",55555).text(55555));
  // $(document).ready(function(){
   window.onload=function(){

       setTimeout(function(){
    layui.use('form', function(){
        var totalmoney=0;//可用余额
        var currcardId="";//当前卡号
        var form = layui.form;
        // var layer = layui.layer;
        // var element=layui.element;
        //element.init();
        //setTimeout(function(){ alert(22);},2000);
//alert(55);
        //刷新页面数据
        form.render();


            //监听提交查询余额
            form.on('submit(demo1)', function(data){
                // layer.alert(JSON.stringify(data.field), {
                //     title: '最终的提交信息'
                // })
               // currcardId=data.field.cardId;
               $("input[name='outCard']").attr("value", data.field.cardId);
                $.ajax({
                    url:"/card/select",
                    type:"post",
                    data:data.field,
                    success:function (money) {
                        $.each(money,function (index,item) {
                            // alert(item.cardBalance);
                            $("input:read-only")[0].value=item.cardBalance;
                            totalmoney=item.cardBalance;
                        })
                    }
                })
                return false;
            });
        //自定义验证规则
        form.verify({
           money: function (value) {
               if(totalmoney==0){
                   return  '不能取款';
               }
                if (value > totalmoney) {
                    return '取款金额不能大于余额';
                }
            }, carpass: [
                /^[\S]{6}$/
                ,'密码必须6位，且不能出现空格'
            ]
        })
            //监听提交取款
            form.on('submit(demo2)', function(data){
                var money=(totalmoney-data.field.cash);
                // layer.alert(JSON.stringify(data.field), {
                //     title: '最终的提交信息'
                // });
                $.ajax({
                    url:"/card/update",
                    type:"post",
                    data:{"cardId":data.field.outCard,"cardBalance":money,
                        "cardOther":data.field.cash,"cardStatus":"out"},
                    success:function (res) {
                      if(res==1){
                          layer.alert("取款成功");
                          $("#reset2").click();
                      }else
                          layer.alert("取款失败");
                        $("#tijiao").click();
                    }
                });
                return false;
            });

        });
   // alert(22)
       },200);
    }

</script>

</body>
</html>