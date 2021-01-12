package com.gupaoedu.demo.annotaions.injections.autowired;

import com.gupaoedu.project.controller.MyController;
import com.gupaoedu.project.dao.MyDao;
import com.gupaoedu.project.service.MyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Arrays;

/**
 * Created by Tom.
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Object controller = app.getBean("myController");
        System.out.println(controller);

        System.out.println(Arrays.toString(app.getBeanDefinitionNames()).
                replaceAll("\\[|\\]", "")
                .replaceAll("\\,", "\r\n"));

        MyService service = app.getBean(MyService.class);
        service.print();

        //通过classType可以获得bean,前提：只有一个这个类型的实例在容器中只存在一个
        MyDao dao = app.getBean(MyDao.class);
        System.out.println(dao);

        MyDao dao1 = (MyDao) app.getBean("myDao");
        System.out.println(dao1);
    }
}
