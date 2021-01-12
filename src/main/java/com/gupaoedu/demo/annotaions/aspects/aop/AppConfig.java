/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.aspects.aop;

import com.sun.corba.se.spi.orbutil.threadpool.Work;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Administrator
 * @date 2021/1/11 21:58
 * Project Name: gupaoedu-vip-spring-annotation
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.gupaoedu.demo.annotaions.aspects.aop")
public class AppConfig {
    @Bean
    public WorkerService workerService() {
        return new WorkerService();
    }

    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }
}
