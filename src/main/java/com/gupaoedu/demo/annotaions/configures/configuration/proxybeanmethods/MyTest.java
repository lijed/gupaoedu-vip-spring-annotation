/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.configures.configuration.proxybeanmethods;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/11/19
 **/
public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PerConfiguration.class);
        System.out.println(applicationContext.getBean(Person2.class));
        System.out.println("=========================================");
        System.out.println(applicationContext.getBean(Person2.class));
        System.out.println("=========================================");
        System.out.println(applicationContext.getBean(Person1.class));
        System.out.println("=========================================");
        System.out.println(applicationContext.getBean(Person1.class));
        System.out.println("=========================================");
        System.out.println(applicationContext.getBean(Person1.class));

    }
}
