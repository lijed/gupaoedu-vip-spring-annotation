/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.configures.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Description:
 * Project Name: gupaoedu-vip-spring-annotation
 *
 * @Author: Administrator
 * Created: 2021/3/30
 **/
@Configuration
public class AppConfig {

    @Profile("dev")
    @Bean
    public ProfileService devProfileService() {
        return new ProfileService("dev");
    }
    @Profile("prod")
    @Bean
    public ProfileService proProfileService() {
        return new ProfileService("prod");
    }
}
