<%--
  Created by IntelliJ IDEA.
  User: wanxugang
  Date: 2019/1/20
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>
<body>
<table class="layui-hide" id="test" lay-filter="test"></table>


<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#test'
            ,url:'/serviceCommit/selectServiceCommit'
            ,toolbar: true
            ,title: '用户数据表'
            ,totalRow: true
            ,cols: [[
                {field:'id', width:80, title: 'ID', sort: true}
                ,{field:'serviceType', width:80, title: '用户名'}
                ,{field:'serviceCustomer', width:80, title: '性别', sort: true}
                ,{field:'serviceCard', width:80, title: '城市'}
                ,{field:'serviceUse', title: '签名', width: '30%', minWidth: 100} //minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
                ,{field:'servicePhone', title: '积分', sort: true}
                ,{field:'serviceDate', title: '评分', sort: true}
                ,{field:'serviceDesc', title: '职业'}
                ,{field:'servicePrice', width:137, title: '财富', sort: true}
                ,{field:'serviceStatus',width:130,title:'状态'}
            ]]
            ,page: true
            ,response: {
                statusCode: 200 //重新规定成功的状态码为 200，table 组件默认为 0
            }
            ,parseData: function(res){ //将原始数据解析成 table 组件所规定的数据
                return {
                    "code": res.status, //解析接口状态
                    "msg": res.message, //解析提示文本
                    "count": res.total, //解析数据长度
                    "data": res.rows.item //解析数据列表
                };
            }
        });
    });
</script>
</body>
</html>
