package com.gupaoedu.demo.annotaions.configures.configuration;

import com.gupaoedu.project.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Created by Tom.
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Object bean = app.getBean("person1");
        System.out.println(bean);

        String [] beanNames = app.getBeanNamesForType(Person.class);
        System.out.println(Arrays.toString(beanNames));
    }
}