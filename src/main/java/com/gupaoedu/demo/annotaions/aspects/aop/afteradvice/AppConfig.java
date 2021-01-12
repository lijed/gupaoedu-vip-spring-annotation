/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.aspects.aop.afteradvice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Administrator
 * @date 2021/1/11 22:43
 * Project Name: gupaoedu-vip-spring-annotation
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.gupaoedu.demo.annotaions.aspects.aop.afteradvice")
public class AppConfig {
}
