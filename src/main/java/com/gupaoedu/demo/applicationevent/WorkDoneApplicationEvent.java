/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.demo.applicationevent;

import org.springframework.context.ApplicationEvent;

/**
 * @author Administrator
 * @date 2021/1/23 23:30
 * Project Name: gupaoedu-vip-spring-annotation
 */
public class WorkDoneApplicationEvent extends ApplicationEvent {

    private String job;
    private Integer workHours;

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public WorkDoneApplicationEvent(Object source, String job, Integer workHours) {
        super(source);
        this.job = job;
        this.workHours = workHours;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
