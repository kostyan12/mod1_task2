package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

//
       AutoFactory autoFactory = context.getBean("autoFactory", AutoFactory.class);
        autoFactory.setProdSize(4);
        autoFactory.runProduction();
//       System.out.println(autoFactory.getProdSize());
//
 //      System.out.println(context.getBeanDefinitionCount());
 //       System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }
}
