/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.aspects.aop;

import javax.jnlp.IntegrationService;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * @date 2021/1/11 17:52
 * Project Name: gupaoedu-vip-spring-annotation
 */
public class WorkerService implements Iservice {

    @Override
    public void doSomething() {
        System.out.println("working");
    }

    @Override
    public String getSomething() {
        System.out.println("getting something");
        return "get something";
    }

    @Override
    public String process(String material, String material1) {
       return material + " " + material1;
    }

    @Override
    public void process(String material) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("cook " + material);
    }
}
