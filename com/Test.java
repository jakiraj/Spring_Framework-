package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
//        XML based
        ApplicationContext context = new ClassPathXmlApplicationContext("com/applicationContext.xml");
        Hello hello = (Hello)context.getBean("hello");
        hello.setMessage("Hello Jakir");
        System.out.println(hello.getMessage());
        
//        Annotation based
        ApplicationContext context2 = new AnnotationConfigApplicationContext(HelloConfig.class);
        Hello hello2 = (Hello)context2.getBean("hello");
        hello2.setMessage("Hello Jakir Hossain");
        System.out.println(hello2.getMessage());
    }
    
}
