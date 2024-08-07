package com.github.zhuangjiaju.easytools.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 *
 * @author Jiaju Zhuang
 */
@SpringBootApplication
@ComponentScan(value = {"com.github.zhuangjiaju.easytools"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
