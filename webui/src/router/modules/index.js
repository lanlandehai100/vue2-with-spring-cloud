/**
 * Created by sailengsi on 2017/5/11.
 */

//import {Home,Content} from 'layout/';

import home from 'views/modules/home/taoweilai';
import {modules} from 'views/';

export default {
	path: '/thome',
	name: 'taoweilai',
	icon: 'inbox',
	component: home,
	redirect: '/modules/home/taoweilai',
	children:[modules]
};