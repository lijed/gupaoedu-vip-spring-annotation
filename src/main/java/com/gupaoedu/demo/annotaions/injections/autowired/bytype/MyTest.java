/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.injections.autowired.bytype;

import com.gupaoedu.project.entity.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 * @date 2021/1/11 14:56
 * Project Name: gupaoedu-vip-spring-annotation
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext applicationContext  = new AnnotationConfigApplicationContext(AutowireByTypeConfig.class);
        System.out.println(applicationContext.getBean(EmployeeAutowiredByTypeServiceName.class));
        System.out.println(applicationContext.getBean(EmployeeAutowiredByTypeServiceName.class).getEmployee1().toString());
        System.out.println(applicationContext.getBean(EmployeeAutowiredByTypeServiceName.class).getDepartment().toString());
        System.out.println(applicationContext.getBean("employee"));
        System.out.println(applicationContext.getBean(Employee.class));
        System.out.println(applicationContext.getBean(EmployeeAutowiredByTypeServiceName.class));
    }
}
