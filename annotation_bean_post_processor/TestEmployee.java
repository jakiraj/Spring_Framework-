package annotation_bean_post_processor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation_bean_post_processor/applicationContext.xml");
        Employee emp = (Employee)context.getBean("e");
        emp.show();
    }
    
}