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
        <div class="office-pic pointer-cursor">
        	<!-- <i></i> -->
        	<div class="office-pic-view"><img id="officePic" style="width:100%;height:100%" src="../../../../assets/images/twl-wx.jpg" /></div>
        	<div class="hidden-pic" id="hiddenPic"></div>
        	<div class="hidden-QRcode" id="hiddenQRcode"><img style="width:100%;height:100%" src="../../../../assets/images/erwei.png" />
        	</div>
        </div>
        <div class="clear"></div>
    </div>
</nav>
<el-carousel height="351px">
    <el-carousel-item v-for="item in bannerPic" :key="item">
    <img v-bind:src="item"  width="auto" height="351" alt="" />
    </el-carousel-item>
</el-carousel>

<div class="model_title">
	<h1 class="top">精品服务 QUALITY SERVICE</h1>
	<h1 class="top2">----------------  智能系统+人工服务，让志愿变得更轻松  ----------------</h1>
</div>
<section class="importBase">
	<div class="imports">
		<ul>
			<li class="frist">
			<div class="flip-container" ontouchstart="this.classList.toggle('hover');">
				<div class="flipper">
					<div class="front">
						<div><img src="../../../../assets/images/01.fw.png" style="width:100%;height:100%"></div>
					</div>
					<div class="back" style="background:#3FC4FD;">
						<div class="com-m">
							<p>1.你好</p>
							<p>2.好啊</p>
							<p>3.你好</p>
							<a>查看详情</a>
						</div>
					</div>
				</div>
			</div>
			</li>
			<li>
			<div class="flip-container" ontouchstart="this.classList.toggle('hover');">
				<div class="flipper">
					<div class="front">
						<div><img src="../../../../assets/images/02.fw.png" style="width:100%;height:100%"></div>
					</div>
					<div class="back" style="background:#FFB921;">
						<div class="com-m">
							<p>1.你好</p>
							<p>2.好啊</p>
							<p>3.你好</p>
							<a>查看详情</a>
						</div>
					</div>
				</div>
			</div>
			</li>
			<li>
			<div class="flip-container" ontouchstart="this.classList.toggle('hover');">
				<div class="flipper">
					<div class="front">
						<div><img src="../../../../assets/images/03.fw.png" style="width:100%;height:100%"></div>
					</div>
					<div class="back" style="background:#FE6B5A;">
						<div class="com-m">
							<p>1.你好</p>
							<p>2.好啊</p>
							<p>3.你好</p>
							<a>查看详情</a>
						</div>
					</div>
				</div>
			</div>
			</li>
			<li>
			<div class="flip-container" ontouchstart="this.classList.toggle('hover');">
				<div class="flipper">
					<div class="front">
						<div><img src="../../../../assets/images/04.fw.png" style="width:100%;height:100%"></div>
					</div>
					<div class="back" style="background:#09C899;">
						<div class="com-m">
							<p>1.你好</p>
							<p>2.好啊</p>
							<p>3.你好</p>
							<a>查看详情</a>
						</div>
					</div>
				</div>
			</div>
			</li>
			<li>
			<div class="flip-container" ontouchstart="this.classList.toggle('hover');">
				<div class="flipper">
					<div class="front">
						<div><img src="../../../../assets/images/05.fw.png" style="width:100%;height:100%"></div>
					</div>
					<div class="back" style="background:#5ED15F;">
						<div class="com-m">
							<p>1.你好</p>
							<p>2.好啊</p>
							<p>3.你好</p>
							<a>查看详情</a>
						</div>
					</div>
				</div>
			</div>
			</li>
		</ul>
	</div>
</section>
<div class="model_title">
	<h1 class="top">权威资讯  AUTHORITATIVE INFORMATION</h1>
	<h1 class="top2">----------------  七分高考，三分志愿，给您最权威的参考资讯  ---------------</h1>
</div>
<section class="indexNews">
    <div class="notice">
		<div class="tab-hd">
            <ul class="tab-nav">
                <li class="frist active"><a href="" target="_blank">高考咨询</a></li>
                <li><a href="" target="_blank">高考备战</a></li>
                <li><a href="" target="_blank">国内大学</a></li>
                <li><a href="" target="_blank">国外留学</a></li>
            </ul>
            <div class="clear"></div>
        </div>
        <div class="tab-bd active">
            <ul>
                <li><span><b>12</b><br/><em>2017.01</em></span>
                <a href="" title="志愿填报选专业还是选学校？别傻了，你应该选的是“抱大腿”！" target="_blank">志愿填报选专业还是选学校？别傻了，你应该选的是“抱大腿”！</a>
                <p>每年志愿填报，上好学校的好专业无疑是很多考生和家长最想要的结果，但是在分数优势不足的情况下，鱼与熊掌如何兼得，成为90%考生和家长最为纠结的问题。。。</p></li>
                <li><span><b>04</b><br/><em>2017.01</em></span>
                <a href="" title="淘高考 | 2017年福建省高考人数比去年增加近1.32万人！近三年录取情况一览！" target="_blank">淘高考 | 2017年福建省高考人数比去年增加近1.32万人！近三年录取情况一览！</a>
                <p>2017年福建省共有18.82万考生参加普通高考，共设87个考区，102个试卷保密室，199个考点，6566个考场。（数据来源：福建教育微言）。。。。。。</p></li>
                <li><span><b>24</b><br/><em>2016.12</em></span>
                <a href="" title="重磅！2017年全国招生计划公布，福建逾18万，确保录取率不降低！" target="_blank">重磅！2017年全国招生计划公布，福建逾18万，确保录取率不降低</a>
                <p>近日，教育部印发了《关于做好2017年普通高等教育招生计划编制和管理工作的通知》（点击文末左下角“阅读原文”查看）。据通知内容。。。。。。</p></li>
            </ul>
		</div>
        <div class="tab-bd">
			<ul>
			<li><span><b>11</b><br/><em>2017.01</em></span>
			<a href="" title="厦门大学2017年本科招生“校园开放日”！六月，我在厦园等你！" target="_blank">厦门大学2017年本科招生“校园开放日”！六月，我在厦园等你！</a>
			<p>中国有这样一批学校，他们的名字不分医学、语言、财经等类别，非常霸气地冠以当地省份的名称。对于这些大学，你了解吗？谁的实力最强呢？下面，...</p></li>
			<li><span><b>11</b><br/><em>2017.01</em></span>
			<a href="" title="盘点冠以省份头衔大学的实力！福建为何没有“福建大学”？" target="_blank">盘点冠以省份头衔大学的实力！福建为何没有“福建大学”？</a>
			<p>中国有这样一批学校，他们的名字不分医学、语言、财经等类别，非常霸气地冠以当地省份的名称。对于这些大学，你了解吗？谁的实力最强呢？下面，我们就来细数一下我国冠以省份头衔大学的实力吧。。。</p></li>
			<li><span><b>04</b><br/><em>2017.01</em></span>
			<a href="" title="这些学生上大学免学费，免住宿费，还发生活费！凭什么？" target="_blank">这些学生上大学免学费，免住宿费，还发生活费！凭什么？</a>
			<p>不用辛苦奔波找工作，免学费、免住宿费，还发生活费！哪有这么好的事？</p></li></ul>
		</div>
        <div class="tab-bd">
			<ul>
			<li><span><b>07</b><br/><em>2016.11</em></span>
			<a href="" title="淘高考| 中国刚成立的这所大学！和国科大一样超厉害！" target="_blank">淘高考| 中国刚成立的这所大学！和国科大一样超厉害！</a>
			<p>近日，教育部批准中国社会科学院、共青团中央关于申请创办中国社会科学院大学相关事项的请示和关于成立中国社会科学院大学的论证报告，同意创办中国社会科学院大学，并将于2017年秋季首次招生本科生！...</p></li>
			<li><span><b>06</b><br/><em>2016.09</em></span>
			<a href="" title="重磅 | 76所教育部直属管理高校分省解读！一文看懂！多少分能上？" target="_blank">重磅 | 76所教育部直属管理高校分省解读！一文看懂！多少分能上？</a>
			<p>教育部2016年全国2595所普通高校名单中，共有76所教育部直属管理的高校。分布在全国18个省市区，涵盖了综合、工科、农业、林业、师范、语言、医药、财经、政法、艺术等类型院校。。。</p></li>
			<li><span><b>06</b><br/><em>2016.09</em></span>
			<a href="" title="淘高考 | 2017中国大学排行榜最新出炉！和你想的一样吗？" target="_blank">淘高考 | 2017中国大学排行榜最新出炉！和你想的一样吗？</a>
			<p>艾瑞深中国校友会网《2017中国大学评价研究报告》公布最新2017中国大学排行榜700强，北京大学雄居榜首，连续10年蝉联冠军；清华大学第2，武汉大学第3，复旦大学第4，浙江大学第5。..</p></li></ul>
		</div>
        <div class="tab-bd">
			<ul>
			<li><span><b>11</b><br/><em>2017.01</em></span>
			<a href="" title="厦门软件职业技术学院中澳合作办学，双文凭！ 直升澳洲读本科！" target="_blank">厦门软件职业技术学院中澳合作办学，双文凭！ 直升澳洲读本科！</a>
			<p>近年来，国内学生选择出国留学的趋势越演愈烈，澳大利亚凭借其多方面优势吸引着越来越多的中国留学生。为了帮助学生实现赴澳留学深造的愿望，厦门软件职业技术学院携手澳大利亚时代教育集团及旗下澳大利亚华威学院在国内开展中澳合作。。。</p></li></ul>
		</div>
    </div>
    <div class="DepartNav">
        <img src="../../../../assets/images/pc-school02.png" />
    </div>
    <div class="clear"></div>
</section>
<div class="model_title">
	<h1 class="top">专家团队 EXPERT TEAM</h1>
	<h1 class="top2">---------------  专家把脉，不浪费孩子一分  ---------------</h1>
	<div><a href="">更多专家 >></a></div>
</div>

<section class="BaseMark expertBase">
	<!-- <div class="title"><span>知名专家</span></div>
  	<div class="prevNext"><a class="prevBtn" href="javascript:;"></a><a class="nextBtn" href="javascript:;"></a></div>
   <div class="prevNext"><p style="font-size:16px;">更多</p></div>
    <div class="SearchBase" style="display:none">
    	<div class="expertSearch"><a href="zhuanjia.html">按科室查看</a></div>
    </div> -->
    <div class="experts">
		<ul data-num="0">
		<li>
			<div class="border-1">
				<a href="" title="苏显敏" ><img src="../../../../assets/images/expert01.jpg" alt="苏显敏" width="238" height="218"></a>
				<div class="txt">
					<em>苏显敏</em>
					<p>高考志愿资深规划师</p>
				</div>
			</div>
		</li>
		<li>
			<div class="border-1">
				<a href="" title="范强" ><img src="../../../../assets/images/expert02.jpg" alt="范强" width="238" height="218">
				</a>
				<div class="txt">
					<em>范强</em>
					<p>淘高考微信公众号主编</p>
				</div>
			</div>
		</li>
		<li>
			<div class="border-1">
				<a href="" title="刘漳辉" ><img src="../../../../assets/images/expert03.jpg" alt="刘漳辉" width="238" height="218"></a>
				<div class="txt">
					<em>刘漳辉</em>
					<p>资深高考志愿填报专家</p>
				</div>
			</div>
		</li>
		<li>
			<div class="border-1">
				<a href="" title="陈桐荔" ><img src="../../../../assets/images/expert04.jpg" alt="陈桐荔" width="238" height="218"></a>
				<div class="txt">
					<em>陈桐荔</em>
					<p>资深高考志愿填报专家</p>
				</div>
			</div>
		</li>
		</ul>
    </div>

</section>
<footer style="margin-top: 0px;">
	<div class="footBase">
		<!-- <h3>咨询电话：13600917747,13906006490,0592-2128000（上午8：00至12:00）（下午13:00至17:30）</h3> -->
        <p>主办单位：淘高考  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;地址：厦门火炬高新区软件园科讯楼6F-A3单元<br/>版权所有：厦门小蜜蜂大数据科技有限公司</p>
        <div class="QRcode"><img src="../../../../assets/images/erwei.png" width="104" height="104"><br/>手机扫一扫关注淘高考官方微信</div>
    </div>
</footer>

</div>
</template>
<script>
    import HomeJs from './Home.js';
    
    export default HomeJs;
</script>

<style scoped>
    @import './normalize.css';
    @import './index.css';
</style>
