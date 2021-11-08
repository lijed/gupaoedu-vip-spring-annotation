/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.enables.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/11/8
 **/
@Component
public class Task {

    @Scheduled(fixedRate = 5000)
    public void work() throws InterruptedException {
        System.out.println("processing will take 3 seconds");
        TimeUnit.SECONDS.sleep(3);
    }
}
