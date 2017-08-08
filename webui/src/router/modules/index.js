// import Home from './home/';
// import User from './user/';

// export default {
// 	Home,
// 	User
// };

import home from 'views/modules/home/taoweilai';
import {Modules} from 'views/';
export default {
	Home:{
		path: '/',
		name: 'taoweilai',
		icon: 'inbox',
		component: home
	},
	User:{
		path: '/register',
		name: 'taoweilai',
		icon: 'inbox',
		component:Modules.User.Register,
		children:[]
	}
};