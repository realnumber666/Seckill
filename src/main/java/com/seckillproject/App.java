package com.seckillproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
// 自动加载配置到项目中
@EnableAutoConfiguration
@RestController
public class App {
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
}
