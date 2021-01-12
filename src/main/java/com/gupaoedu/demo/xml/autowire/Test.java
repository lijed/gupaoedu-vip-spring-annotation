/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.xml.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Administrator
 * @date 2021/1/11 15:30
 * Project Name: gupaoedu-vip-spring-annotation
 */
public class Test {

    @org.junit.Test
    public void test() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:application.xml");
        EmployeeService serviceByName = applicationContext.getBean("employeeServiceByName", EmployeeService.class);

        System.out.println("Autowiring byName. Employee Name="+serviceByName.getEmployee1().getName());

        EmployeeService serviceByType = applicationContext.getBean("employeeServiceByType", EmployeeService.class);

        System.out.println("Autowiring byType. Employee Name="+serviceByType.getEmployee1().getName());
    }
}
