<%--
  Created by IntelliJ IDEA.
  User: wanxugang
  Date: 2019/1/11
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <style type="text/css">
        a link{text-decoration: none;}
        .i{
            text-align: center;
        }
        #outer{
            width: 1200px;
            height: 1000px;
            margin: auto;
            overflow: hidden;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="row" style="background-color: #46B8DA; height: 50px;">
            <div class="col-md-1 i" style="line-height: 50px;"><a href="#">个人客户</a></div>
            <div class="col-md-1 i" style="line-height: 50px;"><a href="#">私人银行</a></div>
            <div class="col-md-1 i" style="line-height: 50px;"><a href="#">公司机构</a></div>
            <div class="col-md-1 i" style="line-height: 50px;"><a href="#">小微企业</a></div>
            <div class="col-md-3 i" style="line-height: 50px;"></div>
            <div class="col-md-1 i" style="line-height: 50px;"><a href="#">客户服务</a></div>
            <div class="col-md-1 i" style="line-height: 50px;"><a href="#">建行集团</a></div>
            <div class="col-md-1 i" style="line-height: 50px;"><a href="#">国内分行</a></div>
            <div class="col-md-1 i" style="line-height: 50px;"><a href="#">诚聘精英</a></div>
            <div class="col-md-1 i" style="line-height: 50px;"><a href="#">建行云</a></div>
        </div>
    </div>
    <div class="container">
        <div class="row" style="background-color: white; height: 70px;">
            <div class="col-md-2" style="line-height: 60px;" ><font size="5">中国建设银行</font></div>
            <div class="col-md-1" style="line-height: 60px;" ><a href="#">信用卡</a></div>
            <div class="col-md-1" style="line-height: 60px;" ><a href="#">投资理财</a></div>
            <div class="col-md-2" style="line-height: 60px;" ><a href="#">存贷及银行卡</a></div>
            <div class="col-md-1" style="line-height: 60px;" ><a href="#">电子银行</a></div>
            <div class="col-md-1" style="line-height: 60px;" ><a href="#">悦享生活</a></div>
            <div class="col-md-1" style="line-height: 60px;" ><a href="#">优智规划</a></div>
            <div class="col-md-1" style="line-height: 60px;" align="right">
                <a class="btn btn-primary btn-large theme-login" href="javascript:;">登录</a>
            </div>
            <div class="col-md-1"   style="line-height: 60px; width: 15px;">|</div>
            <div class="col-md-1" style="line-height: 60px;" align="left">
                <a class="btn btn-primary btn-large theme-regist" href="#">开通个人网上银行</a>
            </div>
        </div>
    </div>
    <div id="outer">
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
                <legend>业务申请</legend>
            </fieldset>

        <form class="layui-form" action="" lay-filter="example">
            <div class="layui-form-item">
                <label class="layui-form-label">类型</label>
                <div class="layui-input-block" style="width: 200px">
                    <input type="text" name="serviceType" lay-verify="title" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">申请人</label>
                <div class="layui-input-block"  style="width: 200px">
                    <input type="text" name="serviceCustomer"  autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">卡号</label>
                <div class="layui-input-block" style="width: 200px">
                    <input type="text" name="serviceCard"  autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">用途</label>
                <div class="layui-input-block"  style="width: 200px">
                    <input type="text" name="serviceUse" placeholder="请如实填写(如:购房意向)"  autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">电话</label>
                <div class="layui-input-block"  style="width: 200px">
                    <input type="text" name="servicePhone" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">日期</label>
                <div class="layui-input-block">
                    <input type="text" name="serviceDate" id="date" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">金额</label>
                <div class="layui-input-block"  style="width: 200px">
                    <input type="text" name="servicePrice" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">理由</label>
                <div class="layui-input-block" style="width: 400px">
                    <textarea placeholder="请输入内容" class="layui-textarea" name="serviceDesc"></textarea>
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit="" lay-filter="demo1">提交申请</button>
                </div>
            </div>
        </form>
        <!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
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
                    title: function(value){
                        if(value.length < 1){
                            return '标题至少得1个字符啊';
                        }
                    }
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
                        url:'/serviceCommit/addService',
                        type:"post",
                        data: data.field,
                        success:function(){
                            layer.alert("业务请求成功",{
                                title:'请求信息'
                            })
                        }
                    });
                    return false;
                });
            });
        </script>
    </div>
</nav>
</body>
</html>
