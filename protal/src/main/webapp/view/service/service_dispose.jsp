<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: wanxugang
  Date: 2019/1/14
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>
<body>
<table class="layui-hide" id="demo" lay-filter="test"></table>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
    <button data-method="notice" class="layui-btn layui-btn-xs" lay-event="edit">分配</button>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script>
    layui.config({
        version: '1545041465443' //为了更新 js 缓存，可忽略
    });

    layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element', 'slider'], function(){
        var
             laypage = layui.laypage //分页
            ,layer = layui.layer //弹层
            ,table = layui.table //表格
            ,element = layui.element //元素操作


        //监听Tab切换
        element.on('tab(demo)', function(data){
            layer.tips('切换了 '+ data.index +'：'+ this.innerHTML, this, {
                tips: 1
            });
        });

        //执行一个 table 实例
        table.render({
            elem: '#demo'
            ,height: 800
            ,url: '/serviceCommit/selectAllService' //数据接口
            ,title: '业务表'
            ,page: true //开启分页
            ,toolbar: 'default' //开启工具栏，此处显示默认图标，可以自定义模板，详见文档
            ,cols: [[ //表头
                {type: 'checkbox', fixed: 'left'}
                ,{field: 'id', title: '业务编号', width:120, sort: true, fixed: 'left', totalRowText: '合计：'}
                ,{field: 'serviceType', title: '业务类型', width:200}
                ,{field: 'serviceCustomer', title: '业务申请人', width: 150, sort: true, totalRow: true}
                ,{field: 'serviceCard', title: '卡号', width:160, sort: true}
                ,{field: 'serviceUse', title: '用途', width: 160, sort: true, totalRow: true}
                ,{field: 'servicePhone', title: '联系电话', width:120}
                ,{field: 'serviceDate', title: '申请日期', width: 130}
                ,{field: 'serviceDesc', title: '业务描述', width:290}
                ,{field: 'servicePrice', title: '金额', width: 100, sort: true, totalRow: true}
                ,{fixed: 'right', width: 165, align:'center', toolbar: '#barDemo'}
            ]]
        });

        //监听头工具栏事件
        table.on('toolbar(test)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id)
                ,data = checkStatus.data; //获取选中的数据
            switch(obj.event){
                case 'add':
                    layer.msg('添加');
                    break;
                case 'update':
                    if(data.length === 0){
                        layer.msg('请选择一行');
                    } else if(data.length > 1){
                        layer.msg('只能同时编辑一个');
                    } else {
                        layer.alert('编辑 [id]：'+ checkStatus.data[0].id);
                    }
                    break;
                case 'delete':
                    if(data.length === 0){
                        layer.msg('请选择一行');
                    } else {
                        layer.msg('删除');
                    }
                    break;
            };
        });

        //监听行工具事件
        table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                ,layEvent = obj.event; //获得 lay-event 对应的值
            if(layEvent === 'detail'){
                layer.msg('查看操作');
            } else if(layEvent === 'del'){
                layer.open({
                    area:'500px',
                    maxHeight:'500px',
                    content:'<div class="layui-form-item">\n' +
                        '    <label class="layui-form-label">分配对象</label>\n' +
                        '    <div class="layui-input-block">\n' +
                        '      <select name="serviceEmp" lay-filter="aihao">\n' +
                        '        <option value="">请选择</option>\n' +
                        '        <option value="0">张三</option>\n' +
                        '        <option value="1">李四</option>\n' +
                        '        <option value="2">王五</option>\n' +
                        '        <option value="3">赵六</option>\n' +
                        '      </select>\n' +
                        '    </div>\n' +
                        '  </div>'
                    ,yes:function(){
                        $.ajax({
                            url:"/serviceCommit/disposeService",
                            type:"post",
                            data:{
                                id:obj.data.id,
                                serviceStatus:2,
                                serviceEmp:$("select[name='serviceEmp']").val()
                            },
                            success:function(){
                                layer.alert("分配成功");
                                obj.del(); //删除对应行（tr）的DOM结构
                            }
                        })
                    layer.closeAll();
                }

                });
            } else if(layEvent === 'edit'){
            }
        });


        //分页
        laypage.render({
            elem: 'pageDemo' //分页容器的id
            ,count: 100 //总页数
            ,skin: '#1E9FFF' //自定义选中色值
            //,skip: true //开启跳页
            ,jump: function(obj, first){
                if(!first){
                    layer.msg('第'+ obj.curr +'页', {offset: 'b'});
                }
            }
        });

    });
</script>
</body>
</html>
