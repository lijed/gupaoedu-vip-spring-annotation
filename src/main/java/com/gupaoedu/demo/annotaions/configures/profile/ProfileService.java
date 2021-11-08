/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.configures.profile;

/**
 * Description:
 * Project Name: gupaoedu-vip-spring-annotation
 *
 * @Author: Administrator
 * Created: 2021/3/30
 **/
public class ProfileService {
    private String profile;

    public ProfileService(String profile) {
        this.profile = profile;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
