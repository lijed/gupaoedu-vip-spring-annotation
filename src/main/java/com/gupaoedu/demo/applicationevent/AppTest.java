/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.applicationevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 * @date 2021/1/23 23:43
 * Project Name: gupaoedu-vip-spring-annotation
 */
public class AppTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        configApplicationContext.publishEvent(new WorkDoneApplicationEvent("client", "study springmvc", 5));
    }
}
