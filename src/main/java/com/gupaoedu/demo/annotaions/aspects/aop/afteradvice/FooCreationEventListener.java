/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.aspects.aop.afteradvice;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @author Administrator
 * @date 2021/1/11 22:39
 * Project Name: gupaoedu-vip-spring-annotation
 */
@Component
public class FooCreationEventListener implements ApplicationListener<FooCreationEvent> {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void onApplicationEvent(FooCreationEvent event) {
        logger.info("Created foo instance: " + event.getSource().toString());
    }
}