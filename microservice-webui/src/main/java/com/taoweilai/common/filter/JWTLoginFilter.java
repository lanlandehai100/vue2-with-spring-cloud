package com.taoweilai.common.filter;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.alibaba.fastjson.JSON;
import com.taoweilai.common.persistence.User;
import com.taoweilai.common.utils.CookieUtils;
import com.taoweilai.common.utils.JwtUtils;
import com.taoweilai.common.utils.MessageUtils;

public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {
	
	@Autowired
    private MessageSource messageSource;

	public JWTLoginFilter(String url, AuthenticationManager authManager) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
    }

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException, IOException, ServletException {
		// JSON反序列化成 AccountCredentials
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setPassword(request.getParameter("password"));

        // 返回一个验证令牌
        return getAuthenticationManager().authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getName(),
                        user.getPassword()
                )
        );
	}
	
	@Override
    protected void successfulAuthentication(
            HttpServletRequest req,
            HttpServletResponse res, FilterChain chain,
            Authentication auth) throws IOException, ServletException {

        String token = JwtUtils.createAndSignToken(auth.getName());
        
     // 将 JWT 写入 body
        try {
        	res.setContentType("application/json");
        	res.setStatus(HttpServletResponse.SC_OK);
        	CookieUtils.setCookie(res, "token", token);
        	res.getOutputStream().write(new JSONObject(){{
			    put("status", 200);
			    put("message", MessageUtils.getMessage("login_success"));
			    put("result", JSON.toJSONString(token));
			}}.toString().getBytes());
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {

        response.setContentType("application/json;charset=UTF-8");
        response.setStatus(HttpServletResponse.SC_OK);
        try {
			response.getOutputStream().write(new JSONObject(){{
			    put("status", 201);
			    put("message", failed.getLocalizedMessage());
			    put("result", JSONObject.NULL);
			}}.toString().getBytes());
		} catch (JSONException e) {
			e.printStackTrace();
		}
    }

}
