package com.taoweilai.common.utils;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JwtUtils {
	public static Logger logger = LoggerFactory.getLogger(JwtUtils.class);
	static final long EXPIRATIONTIME = 432_000_000;     // 5天
	static final String SECRET = "P@secret01m";            // JWT密码
	static final String TOKEN_PREFIX = "Bearer";        // Token前缀
    static final String HEADER_STRING = "Authorization";// 存放Token的Header Key
	
	public static String createAndSignToken(String userName) throws IllegalArgumentException, UnsupportedEncodingException{
	    Algorithm algorithm = Algorithm.HMAC256(SECRET);
	    String token = JWT.create()
	    	.withClaim("authorities", "ROLE_ADMIN,AUTH_WRITE")
	    	.withSubject(userName)
	        .withIssuer("auth0")
	        .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
	        .withClaim("userName", userName)
	        .sign(algorithm);
	    
	    return token;
	}
	
	public static DecodedJWT verifyToken(String token) throws IllegalArgumentException, UnsupportedEncodingException{
		Algorithm algorithm = Algorithm.HMAC256("secret");
	    JWTVerifier verifier = JWT.require(algorithm)
	        .withIssuer("auth0")
	        .build(); //Reusable verifier instance
	    DecodedJWT jwt = verifier.verify(token);
	    return jwt;
	}
	
	public static DecodedJWT decode (String token){
		DecodedJWT jwt = JWT.decode(token);
	    return jwt;
	}
	
	// JWT验证方法
	public static Authentication getAuthentication(HttpServletRequest request) {
        // 从Header中拿到token
        String token = CookieUtils.getCookie(request, "token");
        
        if (token != null) {
            // 解析 Token
        	DecodedJWT jwt = decode(token);
        	// 拿用户名
            String user = jwt.getSubject();
            // 得到 权限（角色）
            List<GrantedAuthority> authorities =  AuthorityUtils.commaSeparatedStringToAuthorityList(jwt.getClaim("authorities").toString());
            // 返回验证令牌
            return user != null ?
                    new UsernamePasswordAuthenticationToken(user, null, authorities) :
                    null;
        }
        return null;
    }
}
