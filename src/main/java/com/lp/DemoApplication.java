package com.lp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Springboot启动类
 * EnableTransactionManagement 通过该注解配合Transactional进行事务控制
 * 2.x相比1.x配置简化了不少
 */
@ComponentScan("com.lp")
@SpringBootApplication
@EnableTransactionManagement
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }

}