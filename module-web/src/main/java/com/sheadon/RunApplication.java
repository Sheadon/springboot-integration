package com.sheadon;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * SpringBoot启动
 */
@ServletComponentScan
@SpringBootApplication
public class RunApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }
}
