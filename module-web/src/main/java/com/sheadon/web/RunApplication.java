package com.sheadon.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SpringBoot启动类
 */
@ServletComponentScan
@SpringBootApplication
@ComponentScan(basePackages = { "com.sheadon" })
public class RunApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }
}
