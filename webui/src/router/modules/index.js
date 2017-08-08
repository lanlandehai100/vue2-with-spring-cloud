/**
 * Created by sailengsi on 2017/5/11.
 */

//import {Home,Content} from 'layout/';

import home from 'views/modules/home/taoweilai';
import user from './user';


export default {
	path: '/home',
	name: 'taoweilai',
	icon: 'inbox',
	component: home,
	redirect: '/modules/home/taoweilai',
	children:[user]
};