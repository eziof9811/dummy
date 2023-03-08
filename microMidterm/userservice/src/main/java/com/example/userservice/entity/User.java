
package com.example.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {

    @Id
    private String email;
    private String fullName;
    private long contactNo;
    private String city;
    private String state;
    private String zipCode;
    private String password;

    public User(){

    }

    public User(String fullName, String email, long contactNo, String city, String state, String zipCode, String password) {
        this.fullName = fullName;
        this.email = email;
        this.contactNo = contactNo;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", contactNo=" + contactNo +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    //checks if the email of the current User object is equal to the email of the other User

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof User )) return false;
        return getEmail().equals(getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail());
    }
}
