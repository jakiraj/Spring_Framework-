package bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
//        XML based
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_scope/applicationContext.xml");
        Hello hello = (Hello)context.getBean("hello");
        hello.setMessage("Hello Spring");
        System.out.println(hello.getMessage());
        
        Hello hello2 = (Hello)context.getBean("hello");
//        hello2.setMessage("Hello Spring 2");
        System.out.println(hello2.getMessage());
    }
}
