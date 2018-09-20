package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/applicationContext.xml");
        Employee emp = (Employee)context.getBean("e");
        emp.show();
    }
    
}