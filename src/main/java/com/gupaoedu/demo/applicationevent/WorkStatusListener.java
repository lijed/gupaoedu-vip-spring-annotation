/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationListenerMethodAdapter;

/**
 * @author Administrator
 * @date 2021/1/23 23:35
 * Project Name: gupaoedu-vip-spring-annotation
 */

public class WorkStatusListener implements ApplicationListener<WorkDoneApplicationEvent> {
    @Override
    public void onApplicationEvent(WorkDoneApplicationEvent event) {
        System.out.println("job name = " + event.getJob() + ", take hours: " + event.getWorkHours());

    }
}
