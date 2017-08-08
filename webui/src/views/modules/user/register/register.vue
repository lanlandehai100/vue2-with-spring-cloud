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
</div>
</template>