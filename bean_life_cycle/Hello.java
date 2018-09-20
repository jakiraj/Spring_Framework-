package bean_life_cycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Hello implements InitializingBean, DisposableBean{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
//    Anotation Based
//    @PostConstruct
//    public void init(){
//        System.out.println("before initializing bean");
//    }
//    
//    @PreDestroy
//    public void destroy(){
//        System.out.println("before destroying bean");
//    }
//
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("before initializing bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("before destroying bean");
    }
}
