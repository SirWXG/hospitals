<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\1\9 0009
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<table class="layui-hide" id="test" lay-filter="test"></table>

<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
        <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
        <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
    </div>
</script>
<script src="/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#test'
            ,url:'/tasks/select'
            ,cols: [[
                {field:'taskId', title:'ID', align: 'center',width:100}
                ,{field:'taskTitle', title:'任务标题', align: 'center'}
                ,{field:'emp.empName', title:'发起人', align: 'center',templet:function(e){
                        return e.emp.empName;
                    }}
                ,{field:'taskDate', title:'发起时间',align: 'center',templet:function (d) {
                        return showTime(d.taskDate);
                    }}
                ,{field:'taskResult', title:'任务状态',align: 'center'}
            ]]
            ,page: true
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
        //监听行单击事件（单击事件为：rowDouble）
        table.on('row(test)', function(obj){
            var data = obj.data;
            //配置一个透明的询问框
            layer.msg('是否查看任务审批详情', {
                time: 20000, //20s后自动关闭
                btn: ['查看', '不看了'],
                success:function(layero){
                    var btn = layero.find('.layui-layer-btn');
                    btn.find('.layui-layer-btn0').attr({
                        href: '/tasks/open/'+data.taskId
                        ,target: 'option'
                    });
                }
            });
            //标注选中样式
            obj.tr.addClass('layui-table-click').siblings().removeClass('layui-table-click');
        });

    });
</script>
</body>
</html>
