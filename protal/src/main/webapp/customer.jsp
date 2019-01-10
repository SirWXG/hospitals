<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\1\8 0008
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>网上银行</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="http://sandbox.runjs.cn/uploads/rs/55/sjckzedf/lanrenzhijia.css">
    <script type="text/javascript" src="js/jquery.js" ></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <style type="text/css">
        a link{text-decoration: none;}
        .i{
            text-align: center;
        }
        #outer{
            width: 1920px;
            height: 350px;
            margin: auto;
            overflow: hidden;
            margin-top: 110px;
        }
        #inner{
            width: 10000px;
            height: 350px;
            float: left;
        }

        #inner img{
            width: 1920px;
            height: 350px;
        }
        .fontsize{
            width: 25%;
            height: 20%;
            float: left;
            font-size: large;
            margin-top: 20px;
        }
    </style>
</head>
<body>
<form>
    <script type="text/javascript">
        $(function(){
            $(".i").mouseover(function(){
                $(this).css({"background-color":"white"});
            });
            $(".i").mouseout(function(){
                $(this).css({"background-color":"#46B8DA"});
            });
        })

        jQuery(document).ready(function($) {
            $('.theme-login').click(function(){
                $('.theme-popover-mask').fadeIn(100);
                $('.theme-popover').slideDown(200);
            })
            $('.theme-poptit .close').click(function(){
                $('.theme-popover-mask').fadeOut(100);
                $('.theme-popover').slideUp(200);
            })
        })

    </script>
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
    </nav>
    <div id="outer">
        <div id="inner">
            <img src="http://image3.ccb.com/cn/img/mainMbs.jpg"/>
            <img src="http://image3.ccb.com/cn/img/mainEcp.jpg"/>
            <img src="http://imageadv.ccb.com/dolphinfile/2018/11/14214_1_1542618987.jpg"/>
            <img src="http://imageadv.ccb.com/dolphinfile/2018/10/13879_1_1540967651.jpg"/>
            <img src="http://imageadv.ccb.com/dolphinfile/2018/11/14159_1_1542266295.jpg"/>
        </div>
    </div>
    <script type="text/javascript">
        var outer = document.getElementById("outer");
        var res = 0;
        function showImg(){
            outer.scrollLeft=res;
            res+=1920;
            if(res==9600){
                res=0;
            }
        }
        setInterval("showImg()",2000);
    </script>

    <div style=" height: 300px;" align="center">
        <div style="height: 99%;width: 60%;" >
            <div class="fontsize"><img src="http://image3.ccb.com/cn/v3/upload/20151210_1449718015/20151210112849011770.png"/><a href="#">账户查询></a><br><font size="-2">快速查询各类账户信息</font> </div>
            <div class="fontsize"><img src="http://image4.ccb.com/cn/v3/upload/20151206_1449366128/20160327025818381290.png"/><a href="#">悦生活></a><br><font size="-2">生活缴费充值&nbsp;信用卡</font></div>
            <div class="fontsize"><img src="http://image3.ccb.com/cn/v3/upload/20151206_1449365272/20151210152046089269.png"/><a href="#">业务申请></a><br><font size="-2">信用卡,贷款快速申请</font></div>
            <div class="fontsize"><img src="http://image4.ccb.com/cn/v3/upload/20180423_1524446422/20180423092101281469.gif"/><a href="#">业务验证></a><br><font size="-2">在线验证个人资信证明书凭证</font></div>
            <div class="fontsize" align="left" style="margin-top: 70px;">
                <font size="6">丨&nbsp;&nbsp;&nbsp;&nbsp;快易金融</font>
            </div>
            <div class="fontsize" style="margin-top: 90px;background-color: deepskyblue;height: 25px;box-shadow: 3px 3px 3px deepskyblue;">
                <font size="-1">集成咨询 &nbsp;产品&nbsp;工具&nbsp;服务&nbsp;轻松选择 &nbsp; 便捷交易</font>
            </div>

            <div class="fontsize" align="right" style="width: 100%;margin-top: 60px;">
                <div style="width: 10%;float: right;"><a href="elem4.jsp" class="elem"><font size="4">电子银行</font></a></div>
                <div style="width: 10%;float: right;"><a href="elem3.jsp" class="elem"><font size="4">个人贷款</font></a></div>
                <div style="width: 10%;float: right;"><a href="elem2.jsp" class="elem"><font size="4">投资理财</font></a></div>
                <div style="width: 10%;float: right;"><a href="elem1.jsp" class="elem"><font size="4">信用卡</font></a></div>
            </div>

        </div>
        <div style="height: 1%; width: 100%;background-color: darkgray;"></div>
    </div>
    <div style="width: 100%;height: 600px;" align="center">
        <div id="mainbody" style="width: 60%;height: 100%;">
            <!-- 页面加载时自动将信用卡页面展示 -->
            <jsp:include page="elem1.jsp"></jsp:include>
</div><div style="width: 60%;height: 100%;" >        </div>
    </div>

    <div style="height: 2px;width: 100%;background-color: darkgray; margin-bottom: 100px;"></div>

    <div style="width: 100%;height: 700px;" align="center">
        <div style="width: 60%;height: 100%;">
            <div style="width: 100%;height: 10%;" align="left"><font size="+6">丨悦享生活<span style="background-color: deepskyblue;height: 50px;box-shadow: 3px 3px 3px deepskyblue;font-size: medium;">衣食住行 物有所值，在这里实现您的生活品质</span></font></div>
            <div style="width: 100%;height: 10%;"></div>
            <div style="width: 100%;height: 60%;">
                <div style="width: 50%;height: 100%;float: left;">
                    <img src="http://image3.ccb.com/cn/home/life/upload/20151206_1449373236/20160325100618720146.jpg" />

                </div>
                <div style="width: 50%;height: 100%;float: left;">
                    <div style="width: 100%;height: 30%;" align="left">
                        <div style="width: 10%;height: 100%;float: left;">
                            <img src="http://image3.ccb.com/cn/v3/upload/20170527_1495850756/20170527100912534864.png"/>
                        </div>
                        <div style="width: 80%;height: 100%;float: left;">
                            <div style="width: 100%;height: 30%;"><a href="#"><font size="5">善融商务<</font></a></div>
                            <div style="width: 100%;height: 50%;" align="top"><span>网购新方式  正品保障  灵活支付   引领品质生活</span></div>
                        </div>
                    </div>
                    <div style="width: 100%;height: 30%;" align="left">
                        <div style="width: 10%;height: 100%;float: left;">
                            <img src="http://image4.ccb.com/cn/v3/upload/20151206_1449366128/20160327025818381290.png"/>
                        </div>
                        <div style="width: 80%;height: 100%;float: left;">
                            <div style="width: 100%;height: 30%;"><a href="#"><font size="5">悦生活<</font></a></div>
                            <div style="width: 100%;height: 50%;" align="top"><span>缴费服务全覆盖 吃喝玩乐优惠多 生活好帮手</span></div>
                        </div>

                    </div>
                    <div style="width: 100%;height: 30%;" align="left">
                        <div style="width: 10%;height: 100%;float: left;">
                            <img src="http://image3.ccb.com/cn/v3/upload/20151206_1449366376/20160311111946099975.gif"/>
                        </div>
                        <div style="width: 80%;height: 100%;float: left;">
                            <div style="width: 100%;height: 30%;"><a href="#"><font size="5">建融家园<</font></a></div>
                            <div style="width: 100%;height: 50%;" align="top"><span>要租房  找建行  建融家园  为您提供温馨的家</span></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
    <div style="width: 100%;height: 150px;background-color: lightgray;margin-top: -100px;">
        <div style="width: 60%;height: 100%;margin-left: 370px;">
            <div style="width: 10%;height: 98%;float: left;">
                <div style="margin-top: 50px;">
                    <font size="5">真划算&nbsp;/</font>
                </div>
            </div>
            <div style="width: 30%;height: 98%;float: left;" align="left">
                <div style="float: left; margin-top: 25px;">
                    <img src="http://imageadv.ccb.com/dolphinfile/2018/11/14215_1_1542619174.png"/>
                </div>
                <div style="float: left; margin-top: 35px;">
                    <span><a href="#"><font size="2"><strong>黑五来袭<br>嗨购到底</strong></font></a><br>购物享返券</span>
                </div>
            </div>
            <div style="width: 30%;height: 98%;float: left;" align="left">
                <div style="float:  left; margin-top: 25px;">
                    <img src="http://imageadv.ccb.com/dolphinfile/2016/09/6101_1_1473304768.png" />
                </div>
                <div style="float:  left; margin-top: 35px;">
                    <span><a href="#"><font size="2"><strong>分期优选<br>来分期</strong></font></a><br>享免息</span>
                </div>
            </div>
            <div style="width: 30%;height: 98%;float: left;" align="left">
                <div style="float: left; margin-top: 25px;">
                    <img src="http://imageadv.ccb.com/dolphinfile/2016/09/5809_2_1473227861.png"/>
                </div>
                <div style="float: left; margin-top: 35px;">
                    <span><a href="#"><font size="2"><strong>话费打折<br>急速到账</strong></font></a><br>多方报价   给你最优</span>
                </div>
            </div>
        </div>
    </div>

    <script type="text/javascript">
        $(function(){
            $(".elem").mouseover(function(){
                $("#mainbody").load($(this).attr("href"));
                return false;
            });
        })
    </script>
</form>
</body>
</html>