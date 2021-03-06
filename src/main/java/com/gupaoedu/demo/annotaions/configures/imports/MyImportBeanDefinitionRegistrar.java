package com.gupaoedu.demo.annotaions.configures.imports;

import com.gupaoedu.project.entity.User;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by Tom.
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     * @param importingClassMetadata  当前类的注解信息
     * @param registry 完成BeanDefinition的注册
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean company = registry.containsBeanDefinition("com.gupaoedu.project.entity.Company");
        boolean member = registry.containsBeanDefinition("com.gupaoedu.project.entity.Member");

        if(company && member){
            //通过BeanClass就能生成beanDefinition
            BeanDefinition beanDefinition = new RootBeanDefinition(User.class);
            registry.registerBeanDefinition("user",beanDefinition);
        }
    }
}
