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
    <li class="layui-nav-item  layui-this"><a href="">个人信息主页</a></li>
    <li class="layui-nav-item"><a href="">个人业务处理进度</a></li>
    <li class="layui-nav-item"><a href="">个人账户查询</a></li>
    <li class="layui-nav-item">
        <a href="javascript:;">信息修改</a>
        <dl class="layui-nav-child">
            <dd><a href="">密码修改</a></dd>
            <dd><a href="">个人信息修改</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item"><a href=""></a></li>
</ul>
</div>
<div>
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
</script>
</body>
</html>
