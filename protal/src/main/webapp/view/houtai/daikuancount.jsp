<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\1\20 0020
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>贷款记录表</title>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<div class="demoTable">
    搜索ID：
    <div class="layui-inline">
        <input class="layui-input" name="id" id="demoReload" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
</div>

<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>


<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use('table', function(){
        var table = layui.table;

        //方法级渲染
        table.render({
            elem: '#LAY_table_user'
            ,url: '/serviceCommit/getloan'
            ,cols: [[
                {checkbox: true, fixed: true}
                ,{field:'serviceDesc', title: '贷款标题', width:80, sort: true, fixed: true}
                ,{field:'serviceCustomer', title: '贷款人',align:'center'}
                ,{field:'serviceCard', title: '贷款卡号', align: 'center'}
                ,{field:'servicePhone', title: '联系方式', align: 'center'}
                ,{field:'serviceDate', title: '存款日期',align: 'center'}
                ,{field:'servicePrice', title: '贷款总额', align: 'center'}
            ]]
            ,id: 'testReload'
            ,page: true
            ,height: 315
        });

        var $ = layui.$, active = {
            reload: function(){
                var demoReload = $('#demoReload');

                //执行重载
                table.reload('testReload', {
                    page: {
                        curr: 1 //重新从第 1 页开始
                    }
                    ,where: {
                        key: {
                            id: demoReload.val()
                        }
                    }
                });
            }
        };

        $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
    //时间转换函数
    function showTime(tempDate)
    {
        var d = new Date(tempDate);
        var year = d.getFullYear();
        var month = d.getMonth();
        month++;
        var day = d.getDate();
        var hours = d.getHours();
        var minutes = d.getMinutes();
        var seconds = d.getSeconds();
        month = month<10 ? "0"+month:month;
        day = day<10 ? "0"+day:day;
        hours = hours<10 ? "0"+hours:hours;
        minutes = minutes<10 ? "0"+minutes:minutes;
        seconds = seconds<10 ? "0"+seconds:seconds;
        var time = year+"-"+month+"-"+day+":"+hours+":"+minutes+":"+seconds;
        return time;}
</script>

</body>
</html>