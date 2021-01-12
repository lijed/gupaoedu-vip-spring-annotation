/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.injections.autowired.byname;

import com.gupaoedu.project.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Administrator
 * @date 2021/1/11 14:54
 * Project Name: gupaoedu-vip-spring-annotation
 */
public class EmployeeAutowiredByName {

    //Autowired annotation on variable/setters is equivalent to autowire="byType"
    private Employee employee1;

    @Autowired
    public EmployeeAutowiredByName(Employee employee1) {
        this.employee1 = employee1;
    }

    public void setEmployee1(Employee emp){
        this.employee1 =emp;
    }

    public Employee getEmployee1(){
        return this.employee1;
    }
}
