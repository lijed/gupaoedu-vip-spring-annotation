package com.gupaoedu.demo.annotaions.injections.value;

import com.gupaoedu.project.entity.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Tom.
 */
@Configuration
@PropertySource(value = "classpath:values.properties")
public class MyConfig {

    @Bean
    public Bird bird(){
        return new Bird();
    }
}
