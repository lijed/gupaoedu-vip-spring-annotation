/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.injections.autowired.bytype;

import com.gupaoedu.project.entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @date 2021/1/11 14:55
 * Project Name: gupaoedu-vip-spring-annotation
 */
@Configuration
@ComponentScan(basePackages = "com.gupaoedu.project.entity")
public class AutowireByTypeConfig {

    @Bean
    public EmployeeAutowiredByTypeServiceName employeeAutowiredByTypeService() {
        return new EmployeeAutowiredByTypeServiceName();
    }
}
