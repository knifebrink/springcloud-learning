package com.macro.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配合redis使用或jwt使用
 * 使用redis时，很明显，只要redis不清空，就正常
 */
@SpringBootApplication
public class Oauth2JwtServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2JwtServerApplication.class, args);
    }

}
