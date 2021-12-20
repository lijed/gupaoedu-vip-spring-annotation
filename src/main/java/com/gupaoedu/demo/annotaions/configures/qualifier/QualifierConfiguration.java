/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.configures.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/11/22
 **/
@Configuration
//@ComponentScan(basePackages = {"com.gupaoedu.demo.annotaions.configures.qualifier" })
public class QualifierConfiguration {

    @Qualifier
    @Bean
    public Person person() {
        return new Person("jed");
    }

    @Qualifier
    @Bean
    public Person person1() {
        return new Person("thomas");
    }
    @Qualifier
    @Bean
    public Person person2() {
        return new Person("may");
    }

    @Bean
    public Person person4() {
        return new Person("Lili");
    }


}
