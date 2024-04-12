package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="details")
public class User {
    @Id
   private String emailId;
   @Column(name="Name")
    private String name;
    @Column(name="Email")
    private String Email;
   @Column(name="Password")
    private String password;
    @Column(name="PhoneNumber")
    private long phoneNo;
    @Column(name="Address")
    private String Address;
    @Column(name="City")
    private String city;
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public long getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public User(String emailId, String name, String email, String password, long phoneNo, String address, String city) {
        this.emailId = emailId;
        this.name = name;
        this.Email = email;
        this.password = password;
        this.phoneNo = phoneNo;
        this.Address = address;
        this.city = city;
    }
    public User() {
    }

    
}