package com.gupaoedu.demo.annotaions.configures.lifecycle;


import com.gupaoedu.project.entity.Train;
import com.gupaoedu.project.entity.Car;
import org.springframework.context.annotation.*;

/**
 * @see  Car  ---方法注入
 * @see  Train ---@PostConstruct和@PreDestroy注解
 */
@ComponentScans({
        @ComponentScan("com.gupaoedu.project.entity"),
        @ComponentScan("com.gupaoedu.demo.annotaions.configures.lifecycle")
})
@Configuration
public class MyConfig {

    @Lazy
    @Bean(initMethod = "addOil",destroyMethod = "close")
    public Car car(){
        return new Car();
    }

    //3种方式
    // 1.添加initMethod 和 destroyMethod
    // 2.实现InitializingBean和DisposableBean接口
    // 3.使用@PostConstruct和@PreDestroy注解  /**  @Link Car */


}
