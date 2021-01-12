/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.xml.autowire;

import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2021/1/11 15:28
 * Project Name: gupaoedu-vip-spring-annotation
 */
public class EmployeeService {

    private Employee employee1;

    // constructor is used for autowire by constructor
    public EmployeeService(Employee emp) {
        System.out.println("Autowiring by constructor used");
        this.employee1 = emp;
    }

    // default constructor to avoid BeanInstantiationException for autowire
    // byName or byType
    public EmployeeService() {
        System.out.println("Default Constructor used");
    }

    // used for autowire byName and byType
    public void setEmployee1(Employee emp) {
        this.employee1 = emp;
    }

    public Employee getEmployee1() {
        return this.employee1;
    }
}
