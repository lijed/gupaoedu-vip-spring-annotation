/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.aspects.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Administrator
 * @date 2021/1/11 17:53
 * Project Name: gupaoedu-vip-spring-annotation
 */
@Aspect
public class LogAspect {

    @Before("execution(* WorkerService+.*(..))")
    public void advice(JoinPoint joinPoint) {
        System.out.println(joinPoint.getTarget().getClass() + " - "  + joinPoint.getSignature() + " is being executed");
    }

}
