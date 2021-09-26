package com.macro.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by macro on 2019/8/29.
 * 可以看出使用Ribbon的负载均衡功能非常简单，和直接使用RestTemplate没什么两样，只需给RestTemplate添加一个@LoadBalanced即可。
 */
@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced// 主要是这个注解对RestTemplate进行了设置把
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
