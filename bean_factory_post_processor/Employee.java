package bean_factory_post_processor;

import java.util.List;
public class Employee {
    private List<Address> address1;

    public List<Address> getAddress1() {
        return address1;
    }

    public void setAddress1(List<Address> address1) {
        this.address1 = address1;
    }
    
    public void show(){
        System.out.println(address1);
    }
}
