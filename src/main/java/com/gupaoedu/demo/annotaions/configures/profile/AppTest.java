/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.configures.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 * Project Name: gupaoedu-vip-spring-annotation
 *
 * @Author: Administrator
 * Created: 2021/3/30
 **/
public class AppTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acp = new AnnotationConfigApplicationContext();
        acp.getEnvironment().setActiveProfiles("dev");
        acp.register(AppConfig.class);
        acp.refresh();
        ProfileService bean =  acp.getBean(ProfileService.class);
        System.out.println(bean.getProfile());
    }
}
