package com.taogaokao.assessment.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;

@Configuration
@MapperScan("com.taoweilai.modules.shop.dao*")
public class MybatisPlusConfig {

	/**
     * mybatis-plus·ÖÒ³²å¼þ<br>
     * ÎÄµµ£ºhttp://mp.baomidou.com<br>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
