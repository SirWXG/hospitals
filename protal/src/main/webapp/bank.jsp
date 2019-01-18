<%--
  Created by dong.
  User: Administrator
  Date: 2019\1\9 0009
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>发展银行系统</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script type="text/javascript" src="js/jquery.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">发展银行业务系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">控制台</a></li>
            <li class="layui-nav-item"><a href="">商品管理</a></li>
            <li class="layui-nav-item"><a href="">用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item">
                    <a href="javascript:;">个人任务中心</a>
                    <dl class="layui-nav-child">
                        <dd><a href="/view/task/waittodo.jsp" target="option">待办任务</a></dd>
                        <dd><a href="/view/task/already.jsp" target="option">已办任务</a></dd>
                        <dd><a href="/view/task/createdtask.jsp" target="option">已发起任务</a></dd>
                        <dd><a href="javascript:;">分送任务</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">柜台现金业务办理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">客户取款</a></dd>
                        <dd><a href="javascript:;">客户存款</a></dd>
                        <dd><a href="javascript:;">现金转账</a></dd>
                        <dd><a href="javascript:;">现金更换</a></dd>
                        <dd><a href="javascript:;">其他</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">电子业务办理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="/view/service/service_dispose.jsp" target="option">客户业务处理</a></dd>
                        <dd><a href="javascript:;">客户贷款付息</a></dd>
                        <dd><a href="javascript:;">客户存款结息</a></dd>
                        <dd><a href="javascript:;">电汇业务</a></dd>
                        <dd><a href="javascript:;">兑换外币</a></dd>
                        <dd><a href="javascript:;">其他</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">客户账号业务</a>
                    <dl class="layui-nav-child">
                        <dd><a href="/view/service/addCard.jsp" target="option">开通银行账户</a></dd>
                        <dd><a href="/view/service/card_dis.jsp" target="option">冻结/挂失账户</a></dd>
                        <dd><a href="javascript:;">解封账户</a></dd>
                        <dd><a href="javascript:;">客户修改密码</a></dd>
                        <dd><a href="javascript:;">更换/补办银行卡</a></dd>
                        <dd><a href="javascript:;">注销银行卡</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">后台数据中心</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">数据字典</a></dd>
                        <dd><a href="javascript:;">黑名单表</a></dd>
                        <dd><a href="javascript:;">贷款记录表</a></dd>
                        <dd><a href="javascript:;">存款记录表</a></dd>
                    </dl>
                </li><li class="layui-nav-item">
                    <a href="javascript:;">银行存贷数据报表</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">数据字典</a></dd>
                        <dd><a href="javascript:;">黑名单表</a></dd>
                        <dd><a href="javascript:;">贷款记录表</a></dd>
                        <dd><a href="javascript:;">存款记录表</a></dd>
                    </dl>
                </li>

                <li class="layui-nav-item"><a href="">中国人民银行征信</a></li>
                <li class="layui-nav-item"><a href="">中央国债综合业务系统</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <iframe id="man" name="option" src="/view/task/waittodo.jsp" style="overflow: visible;" scrolling="yes" frameborder="no" width="100%" height=100%">

        </iframe>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="layui/layui.all.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
</script>
</body>
</html>