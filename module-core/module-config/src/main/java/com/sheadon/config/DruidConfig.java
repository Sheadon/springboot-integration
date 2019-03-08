package com.sheadon.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Auther: xudong.sun
 * @Date: 2019/3/7 17:34
 * @Description:
 */
@Configuration
@ServletComponentScan
public class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.druid")
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }
}
