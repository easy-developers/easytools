package com.github.zhuangjiaju.easytools.test.common;

import com.github.zhuangjiaju.easytools.start.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 基础测试类
 * 依赖于spring
 *
 * @author Jiaju Zhuang
 **/
@SpringBootTest(classes = {Application.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public abstract class BaseTest {

}
