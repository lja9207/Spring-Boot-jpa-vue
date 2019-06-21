//db랑 연결되는것

package com.project.web.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Customer
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@ToString
@Table(name = "CUSTOMERS")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(name="customer_id")
    private String customerId;

    @Column(name="customer_name")
    private String customerName;

    @Column(name="_password")
    private String password;

    @Column(name="_ssn")
    private String ssn;

    @Column(name="_phone")
    private String phone;

    @Column(name="_city")
    private String city;

    @Column(name="_address")
    private String address;

    @Column(name="_postalcode")
    private String postalcode;

    @Column(name="_photo")
    private String photo;

    
    @Override
    public String toString() {
        return String.format("고객정보 No: %d\n"
        +"ID: %s", id, customerId);
    }

    @Builder
    private Customer(String customerId, String customerName, String password, String ssn, String phone, String city, 
                    String address, String postalcode, String photo){
            this.customerId = customerId;
            this.customerName = customerName;
            this.password = password;
            this.ssn = ssn;
            this.phone = phone;
            this.city = city;
            this.address = address;
            this.postalcode = postalcode;
            this.photo = photo;
        }
    
}