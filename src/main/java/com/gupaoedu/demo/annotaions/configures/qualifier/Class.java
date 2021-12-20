/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.configures.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/11/22
 **/
@Component
public class Class {

    @Qualifier
    @Autowired
    List<Person> students = Collections.emptyList();

    public void print() {
        for (Person student : students) {
            System.out.println(student.toString());
        }
    }
}
