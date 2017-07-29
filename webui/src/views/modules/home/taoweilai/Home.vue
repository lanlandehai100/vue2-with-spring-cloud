<template>
<div>
<header>
    <div class="phone">
	    <span>咨询电话：13600917747,13906006490,0592-2128000</span>
	</div>
    <ul>
        <li><a href="#" ><div class="registered">注册</div></a></li>
    	<li><a><div id="userLogin" class="load" data-toggle="modal" data-target="#myModal" data-backdrop="static">登录</div></a></li>
    </ul>
    <div class="searchBase">
    <form method="get" action="Search.html" onSubmit="return Kunyi.CheckSearchForm()">
		<input type="submit" value="" class="search" />
		<input type="text" name="SearchWords" placeholder="输入你想要搜索的内容..."  value="" autocomplete="off" onFocus="Kunyi.cls(event)" onBlur="Kunyi.res(event)"  maxlength="28" id="SearchWords"  class="searchword"/>
	</form></div>
</header>
<nav>
    <div class="nav">
    	<div class="logo"><a href=""><img src="../../../../assets/images/taoweilai.fw.png"  /></a></div>
    	<div class="ul">
        <ul>
        <li class="PMenu"><a href="#" class="PAMenu">网站首页</a></li>
            <li class="PMenu"><a href="#" id="Nav_AMenu0" class="PAMenu" title="生涯规划" >生涯规划</a>
            	<div class="navboxBase">
            		<div class="navbox">
                        <div class="navMenus">
                            <ul>
	                            <li><a class="testTitle" href="#" title="DISC测评" >DISC测评</a></li>
	                            <li><a class="testTitle" href="#" title="4P测评" >4P测评</a></li>
	                            <li><a class="testTitle" href="#" title="直观选择测评" >直观选择测评</a></li>
	                            <li><a class="testTitle" href="#" title="能力选择测评" >能力选择测评</a></li>
	                            <li><a class="testTitle" href="#" title="兴趣选择测评" >兴趣选择测评</a></li>
	                            <li><a class="testTitle" href="#" title="能力倾向测评" >能力倾向测评</a></li>
	                            <li><a class="testTitle" href="#" title="霍兰德职业测评" >霍兰德职业测评</a></li>
                            </ul>
                        </div>
                         <div class="nav_Menu01">
                              <dl>
                                <dt>DISC测评</dt>
                                <dd>
                                	<img src="../../../../assets/images/test-pic01.jpg" width="260" height="130">
                                	<p>DISC性格测试从Dominance－支配性，Influence－影响性，Steady－稳健性，以及Compliance－服从性四个方面对性格特质进行了描述，进而了解测试者的个性特点，自我管理与情绪稳定等各方面情况。DISC性格测试的理论基础源于发明测谎仪的威廉马斯顿博士，他在1928年创立了DISC行为与语言的研究成果。包括24组描述个性特质的形容词，测试者要根据自己的第一感觉，从每组四个形容词中选出最适合自己形容词。</p>
                                	<a class="more testTitle" href="#" >进入测评</a>
                                </dd>
                              </dl>
                              <dl class="second">
                                <dt>4P测评</dt>
                                <dd>
                                	<img src="../../../../assets/images/test-pic02.jpg" width="260" height="130">
                                    <p>性格测试你是Power力量型、Popular活泼型、Peace和平型还是Perfect完美型、Synergy综合统效型？只要在黄色区块上写上分数就会出来结果哦！</p>
                                	<a class="more testTitle" href="#" >进入测评</a>
                                </dd>
                              </dl>
                              <dl>
                                <dt>霍兰德职业测评</dt>
                                <dd>
                                	<img src="../../../../assets/images/test-pic03.jpg" width="260" height="130">
                                	<p>霍兰德职业兴趣自测(Self-Directed Search)是由美国职业指导专家霍兰德(John Holland)根据他本人大量的职业咨询经验及其职业类型理论编制的测评工具。霍兰德认为，个人职业兴趣特性与职业之间应有一种内在的对应关系。根据兴趣的不同，人格可分为研究型（I）、艺术型（A）、社会型（S）、企业型（E）、传统型（C）、现实型（R）六个维度，每个人的性格都是这六个维度的不同程度组合。</p>
                                	<a class="more testTitle" href="#" >进入测评</a>
                                </dd>
                              </dl>
                        </div>
            			<div class="clear"></div>
                    </div>
                </div>
            </li>
            <li class="PMenu"><a href="" id="Nav_AMenu1" class="PAMenu" title="填报志愿">填报志愿</a>
            	<div class="navboxBase">
            		<div class="navbox">
                        <div class="navMenus">
                            <ul><li><a href="" title="智能志愿设计">智能志愿设计</a></li>
                            <li><a href="" title="我能上的学校">我能上的学校</a></li>
                            <li><a href="" title="志愿防撞车">志愿防撞车</a></li>
                            <li><a href="" title="同分去向">同分去向</a></li>
                            <li><a href="" title="360°评估">360°评估</a></li>
                            </ul>
                        </div>
                         <div class="nav_Menu01">
                              <dl>
                                <dt>智能志愿设计</dt>
                                <dd>
                                	<img src="../../../../assets/images/twl-znz.jpg" width="260" height="130">
                                	<p>智能志愿设计，量身定制高考志愿</p>
                                	<a class="more testTitle" href="">详情</a>
                                </dd>
                              </dl>
                              <dl class="second">
                                <dt>我能上的学校</dt>
                                <dd>
                                	<img src="../../../../assets/images/twl-sxx.jpg" width="260" height="130">
                                    <p>我能上的学校，根据分数搜索出可以上的学校</p>
                                	<a class="more testTitle" href="">详情</a>
                                </dd>
                              </dl>
                              <dl>
                                <dt>志愿防撞车</dt>
                                <dd>
                                	<img src="../../../../assets/images/twl-fzc.jpg" width="260" height="130">
                                	<p>志愿防撞车。。。</p>
                                	<a class="more testTitle" href="">详情</a>
                                </dd>
                              </dl>
                        </div>
            			<div class="clear"></div>
                    </div>
                </div>
            </li>
            <li class="PMenu"><a href="" id="Nav_AMenu2" class="PAMenu" title="查数据">查数据</a>
             	<div class="navboxBase">
            		<div class="navbox">
                        <div class="navMenus">
                            <ul><li><a href="" title="普通类分数">普通类分数</a></li>
                            <li><a href="" title="查录取数">查录取数</a></li>
                            <li><a href="" title="查院校数据">查院校数据</a></li>
                            <li><a href="" title="查艺术分数">查艺术分数</a></li>
                            <li><a href="" title="查专业数据">查专业数据</a></li>
                            </ul>
                        </div>
                         <div class="nav_Menu01">
                              <dl>
                                <dt>查院校数据</dt>
                                <dd>
                                	<img src="../../../../assets/images/twl-cyx.jpg" width="260" height="130">
                                	<p>查院校数据。。。</p>
                                	<a class="more" href="">详情</a>
                                </dd>
                              </dl>
                              <dl class="second">
                                <dt>查艺术分数</dt>
                                <dd>
                                	<img src="../../../../assets/images/twl-cys.jpg" width="260" height="130">
                                    <p>查艺术分数。。。</p>
                                	<a class="more" href="">详情</a>
                                </dd>
                              </dl>
                              <dl>
                                <dt>查专业数据</dt>
                                <dd>
                                	<img src="../../../../assets/images/twl-czy.jpg" width="260" height="130">
                                	<p>查专业数据。。。</p>
                                	<a class="more" href="">详情</a>
                                </dd>
                              </dl>
                        </div>
            			<div class="clear"></div>
                    </div>
                </div>
            </li>
            
            <li class="PMenu"><a href="#" id="Nav_AMenu3" class="PAMenu" title="资讯">资讯</a>
            </li>
            <li class="PMenu"><a href="#" id="Nav_AMenu4" class="PAMenu" title="帮助中心">帮助中心</a>
            </li>
            <li class="PMenu"><a href="#" id="Nav_AMenu5" class="PAMenu" title="未来学院">未来学院</a>
            </li>
        </ul>
        </div>
        <div class="office-pic pointer-cursor" onMouseOver="hiddenQRcodeView()" onMouseOut="hiddenQRcodeHidden()">
        	<!-- <i></i> -->
        	<div class="office-pic-view"><img id="officePic" style="width:100%;height:100%" src="../../../../assets/images/twl-wx.jpg" /></div>
        	<div class="hidden-pic" id="hiddenPic"></div>
        	<div class="hidden-QRcode" id="hiddenQRcode"><img style="width:100%;height:100%" src="../../../../assets/images/erwei.png" />
        	</div>
        </div>
        <div class="clear"></div>
    </div>
</nav>
</div>
</template>
<script>
    import HomeJs from './Home.js';
    import HTML5js from '../../../../assets/js/menuHTML5.min.js';
    import LibraryJs from '../../../../assets/js/menulibrary.js';
    import CommonJs from '../../../../assets/js/menu.common.js';
    import IndexJs from '../../../../assets/js/menu.index.js';
    export default HomeJs;
</script>
<style scoped>
    @import './normalize.css';
    @import './index.css';
</style>
