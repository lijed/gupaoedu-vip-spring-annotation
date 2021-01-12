/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.annotaions.aspects.aop.afteradvice;

import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @date 2021/1/11 22:42
 * Project Name: gupaoedu-vip-spring-annotation
 */
@Repository
public class UserDao {
    public User createUser(Long userId, String name) {
        System.out.println("UserId: " + userId + ", name" + name);
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return user;
    }
}
