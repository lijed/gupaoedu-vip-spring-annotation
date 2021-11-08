/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.aspects.aop;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 * @date 2021/1/11 22:13
 * Project Name: gupaoedu-vip-spring-annotation
 */
public class AppTest {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        Iservice bean = applicationContext.getBean(Iservice.class);
        WorkerService bean = applicationContext.getBean(WorkerService.class);
        bean.doSomething();
        bean.process("butter oil");
    }
}
