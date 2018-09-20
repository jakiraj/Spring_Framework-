package bean_life_cycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    public static void main(String[] args) {
//        XML based
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean_life_cycle/applicationContext.xml");
        context.registerShutdownHook(); //no need for web application
        Hello hello = (Hello)context.getBean("hello");
        hello.setMessage("Hello Spring");
        System.out.println(hello.getMessage());
    }
    
}
