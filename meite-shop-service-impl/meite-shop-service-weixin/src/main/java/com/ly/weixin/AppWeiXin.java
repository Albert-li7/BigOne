package com.ly.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Date:2020/6/13
 * @Author:Ly
 */
@SpringBootApplication
@EnableEurekaClient
public class AppWeiXin {

    public static void main(String[] args) {
        SpringApplication.run(AppWeiXin.class,args);
    }

}
