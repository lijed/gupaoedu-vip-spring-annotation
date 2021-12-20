/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.aspects.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * @date 2021/1/11 22:16
 * Project Name: gupaoedu-vip-spring-annotation
 */
@Aspect
@Component
public class ExecuationTimeLogAroundAspect {

    @Pointcut("execution(* WorkerService+.*(..))")
    public void pointCut() {}

    @Around(value = "pointCut()")
    public Object logTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.nanoTime();

        Object[] args = proceedingJoinPoint.getArgs();
        Object result = proceedingJoinPoint.proceed(args);

        long end = System.nanoTime();
        System.out.println("Execution of " + proceedingJoinPoint.getTarget().getClass() + proceedingJoinPoint.getSignature().getName() + " took " +
                TimeUnit.NANOSECONDS.toMillis(end - start) + " ms");

        return result;
    }
}
