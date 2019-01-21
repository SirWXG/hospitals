<%--
  Created by IntelliJ IDEA.
  User: wanxugang
  Date: 2019/1/20
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="css/default.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <script src="js/jquery.js"></script>
    <script src='js/prefixfree.min.js'></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<%--<script type="text/javascript">--%>
    <%--$(function () {--%>
        <%--$("button").click(function () {--%>
            <%--$.ajax({--%>
                <%--url:"/login/doLogin",--%>
                <%--type:"get",--%>
                <%--data:{--%>
                    <%--username:$("input[name='username']").val(),--%>
                    <%--password:$("input[name='password']").val()--%>
                <%--},--%>
                <%--success:function(data){--%>
                    <%--alert(data);--%>
                    <%--if(data.code==1){--%>
                        <%--alert(data.msg);--%>
                        <%--return false;--%>
                    <%--}else{--%>
                        <%--window.location.href="bank.jsp";--%>
                    <%--}--%>
                <%--}--%>
            <%--})--%>
        <%--});--%>
    <%--})--%>
<%--</script>--%>
<div id="logo">
    <h1 class="hogo"><i> 银行系统后台登录</i></h1>
</div>
<section class="stark-login">
    <form action="/doLogin" method="get">
        <div id="fade-box">
            <input type="text" name="username" id="用户名" placeholder="用户名" required>
            <input type="password" name="password" placeholder="密码" required>
            <button>登录</button>
        </div>
    </form>
    <div class="hexagons">
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <br>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <br>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>

        <br>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <br>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
    </div>
</section>

<div id="circle1">
    <div id="inner-cirlce1">
        <h2> </h2>
    </div>
</div>
<ul>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
</ul>
</body>
</html>
