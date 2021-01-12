/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.xml.autowire;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2021/1/11 14:52
 * Project Name: gupaoedu-vip-spring-annotation
 */

public class Employee {
    private String name = "cn";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
