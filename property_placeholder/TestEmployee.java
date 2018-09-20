package property_placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property_placeholder/applicationContext.xml");
        Employee emp = (Employee)context.getBean("e2");
        emp.show();
    }
    
}