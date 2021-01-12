/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.aspects.aop;

import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * @date 2021/1/11 17:52
 * Project Name: gupaoedu-vip-spring-annotation
 */
public class WorkerService {
    public void doSomething() {
        System.out.println("working");
    }

    public void process(String material) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("cook " + material);
    }
}
