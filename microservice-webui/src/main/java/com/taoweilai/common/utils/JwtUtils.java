package com.taoweilai.common.utils;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.taoweilai.common.persistence.User;

public class JwtUtils {
	public static Logger logger = LoggerFactory.getLogger(JwtUtils.class);
	public static String createAndSignToken(String userName, String pwd) throws IllegalArgumentException, UnsupportedEncodingException{
	    Algorithm algorithm = Algorithm.HMAC256("secret");
	    Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,60 ); //特定时间的年后
        Date date = calendar.getTime();
	    String token = JWT.create()
	        .withIssuer("auth0")
	        .withExpiresAt(calendar.getTime())
	        .withClaim("userName", userName)
	        .withClaim("password", pwd)
	        .sign(algorithm);
	    return token;
	}
	
	public static String createAndSignToken(User user) throws IllegalArgumentException, UnsupportedEncodingException{
	    Algorithm algorithm = Algorithm.HMAC256("secret");
	    Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,60 ); //特定时间的年后
        Date date = calendar.getTime();
	    String token = JWT.create()
	        .withIssuer("auth0")
	        .withExpiresAt(calendar.getTime())
	        .withClaim("user", JSON.toJSONString(user))
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
	
	public static void main(String[] args){
		try {
			String token = createAndSignToken("ljh","1234560");
			logger.debug("tocken:"+token);
			DecodedJWT jwt = JWT.decode(token);
			logger.debug("username:"+jwt.getClaim("userName").asString()+";password:"+jwt.getClaim("password").asString());
			verifyToken(token);
		} catch (IllegalArgumentException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
