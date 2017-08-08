/**
 * Created by sailengsi on 2017/5/11.
 */
import Vue from 'vue';
import Router from 'vue-router';
Vue.use(Router);

import {Home, Content} from 'layout/';
import {Login} from 'views/';
import tHome from 'views/modules/home/taoweilai/';

import Adv from './adv/';
import Function from './function/';
import Demo from './demo/';
import components from './components/';

export default new Router({
	routes: [
		// {
		// 	path  : '/',
		// 	name  : 'Hello',
		// 	hidden: true,
		// 	redirect(to){
		// 		return 'login';
		// 	}
		// }, {
		// 	path     : '/login',
		// 	name     : '登录',
		// 	hidden   : true,
		// 	component: Login
		// },
		{
			path : '/',
			name :	'微服务',
			hidden : true,
			component:tHome,
		}, 
		// {
		// 	path : '/taoweilai',
		// 	name : '淘未来',
		// 	hidden: true,
		// 	component:tHome
		// },
		Function,
		Demo,
		components,
		Adv,
	]
})