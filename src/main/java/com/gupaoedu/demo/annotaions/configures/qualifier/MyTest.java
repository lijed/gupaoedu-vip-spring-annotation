/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.configures.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/11/22
 **/
public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(QualifierConfiguration.class);
        applicationContext.register(Class.class);
        Class class2 = applicationContext.getBean(Class.class);
        class2.print();
    }
}
