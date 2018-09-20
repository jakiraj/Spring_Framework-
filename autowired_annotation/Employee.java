package autowired_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private Address address;

    public Address getAddress() {
        return address;
    }

    @Autowired
    @Qualifier("addqualifier")
    public void setAddress(Address address) {
        this.address = address;
    }

    public void show(){
        System.out.println(address.toString()); 
    }
}
