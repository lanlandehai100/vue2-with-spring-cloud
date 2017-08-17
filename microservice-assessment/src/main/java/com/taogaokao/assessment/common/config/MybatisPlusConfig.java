package com.taogaokao.assessment.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;

@Configuration
@MapperScan("com.taoweilai.modules.shop.dao*")
public class MybatisPlusConfig {

	/**
     * mybatis-plus��ҳ���<br>
     * �ĵ���http://mp.baomidou.com<br>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
