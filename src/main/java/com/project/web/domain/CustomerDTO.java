package com.project.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * CustomerDTO
 */
@Data @Component @Lazy
public class CustomerDTO {
    private String customerId, customerName,
    password, ssn, phone, city, address, postalcode, photo;

    public String getCustomerId(){
        return customerId;
    }
    
    public String setCustomerId(String customerId){
        return  customerId;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String setPassword(String password){
        return this.password;
    }
    
    public String getSsn(){
        return ssn;
    }
    
    public void setSsn(String ssn){
        this.ssn = ssn;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPostalcode(){
        return postalcode;
    }

    public void setPostalcode(String postalcode){
        this.postalcode = postalcode;
    }

    public String getPhoto(){
        return photo;
    }

    public void setPhoto(String photo){
        this.photo = photo;
    }

}