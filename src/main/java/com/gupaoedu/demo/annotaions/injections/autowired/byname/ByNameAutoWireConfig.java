/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.injections.autowired.byname;

import com.gupaoedu.demo.annotaions.injections.autowired.bytype.EmployeeAutowiredByTypeServiceName;
import com.gupaoedu.project.entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @date 2021/1/11 15:03
 * Project Name: gupaoedu-vip-spring-annotation
 */

@Configuration
@ComponentScan("com.gupaoedu.project.entity")
public class ByNameAutoWireConfig {
    @Bean("usEmployee")
    public Employee employee() {
        Employee employee = new Employee();
        employee.setName("us");
        return employee;
    }

    @Bean
    public EmployeeAutowiredByName employeeAutowiredByTypeService(@Qualifier("usEmployee") Employee employee) {
        return new EmployeeAutowiredByName(employee);
    }
}
