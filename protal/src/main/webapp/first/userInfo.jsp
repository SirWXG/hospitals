<%--
  Created by IntelliJ IDEA.
  User: wanxugang
  Date: 2019/1/11
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script type="text/javascript" src="../js/jquery.js"></script>
    <script type="text/javascript" src="../layui/layui.js"></script>
</head>
<body>
<div>
<ul class="layui-nav layui-bg-blue" style="text-align: center">
    <li class="layui-nav-item" disabled >欢迎您,万旭刚</li>
    <li class="layui-nav-item  layui-this"><a href="/first/user.jsp">个人账户查询</a></li>
    <li class="layui-nav-item"><a href="/first/service.jsp">个人业务处理进度</a></li>
    <li class="layui-nav-item"><a href=""></a></li>
</ul>
</div>
<div id="mainbody">
    <jsp:include page="user.jsp" />
</div>
<script>
    layui.use('element', function(){
        var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
        //监听导航点击
        element.on('nav(demo)', function(elem){
            //console.log(elem)
            layer.msg(elem.text());
        });
    });

    $("a").click(function(){
        $("#mainbody").load($(this).attr("href"));
        return false;
    });
</script>
</body>
</html>
