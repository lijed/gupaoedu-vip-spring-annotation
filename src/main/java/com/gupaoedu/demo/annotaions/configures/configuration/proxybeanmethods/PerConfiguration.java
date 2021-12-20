/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.configures.configuration.proxybeanmethods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/11/19
 **/
@Configuration(proxyBeanMethods = true)
public class PerConfiguration {

    @Bean
    public Person2 person2() {
        System.out.println("调用person1");
//        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
//            System.out.println(stackTraceElement);
//        }
        System.out.println(person1().toString());
        return new Person2();
    }

    @Bean
    public Person1 person1() {
        return new Person1();
    }
}
