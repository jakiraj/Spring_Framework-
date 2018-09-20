package annotation_bean_post_processor;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
    private Address address;

    public Address getAddress() {
        return address;
    }

    @Required
    public void setAddress(Address address) {
        this.address = address;
    }

    public void show(){
        System.out.println(address.toString()); 
    }
}
