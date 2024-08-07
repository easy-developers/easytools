package com.github.zhuangjiaju.easytools.start.test;

import com.github.zhuangjiaju.easytools.start.Application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 本地环境的启动。
 * 主要为了读取本地的一些配置 比如日志输出就和其他环境不一样
 *
 * @author JiaJu Zhuang
 */
@SpringBootTest(classes = {Application.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
