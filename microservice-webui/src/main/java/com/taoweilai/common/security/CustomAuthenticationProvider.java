package com.taoweilai.common.security;

import java.util.ArrayList;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

import com.taoweilai.common.persistence.User;
import com.taoweilai.common.utils.ApplicationContextHolder;
import com.taoweilai.common.utils.MessageUtils;
import com.taoweilai.modules.user.UserService;

public class CustomAuthenticationProvider implements AuthenticationProvider {

	public static final UserService userservice = ApplicationContextHolder.getBean(UserService.class);
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// 获取认证的用户名 & 密码
        String loginName = authentication.getName();
        String password = authentication.getCredentials().toString();
        
        User user = userservice.findUserByLoginName(loginName);
        if(user != null){
        	if(userservice.validatePassword(password, user.getPassword())){
//        		Principal principal = new Principal(user);
        		ArrayList<GrantedAuthority> authorities = new ArrayList<>();
//              authorities.add( new GrantedAuthorityImpl("ROLE_ADMIN") );
//              authorities.add( new GrantedAuthorityImpl("AUTH_WRITE") );
//              // 生成令牌
                Authentication auth = new UsernamePasswordAuthenticationToken(loginName, password, authorities);
                return auth;
        	}else{
        		throw new BadCredentialsException(MessageUtils.getMessage("password_error"));
        	}
        }else{
        	throw new BadCredentialsException(MessageUtils.getMessage("user_not_found"));
        }
//        // 认证逻辑
//        //TODO 要用数据库查询
//        if (loginName.equals("admin") && password.equals("123456")) {
//
//            // 这里设置权限和角色
//            ArrayList<GrantedAuthority> authorities = new ArrayList<>();
//            authorities.add( new GrantedAuthorityImpl("ROLE_ADMIN") );
//            authorities.add( new GrantedAuthorityImpl("AUTH_WRITE") );
//            // 生成令牌
//            Authentication auth = new UsernamePasswordAuthenticationToken(loginName, password, authorities);
//            return auth;
//        }else {
//            
//        }
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
