package components;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Customer implements Serializable {
    private String zipCode;
    private String phoneNumber;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    private String name;

    public String getZipCode () {
        return zipCode;
    }

    public void setZipCode (String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
