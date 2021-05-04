package com.company.Entities;

import java.util.Date;

public class Customer {

    private int id;
    private String FirstName;
    private String LastName;
    private  Date DateOfBirth;
    private  String NationalyIdentity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDataOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalyIdentity() {
        return NationalyIdentity;
    }

    public void setNationalyIdentity(String nationalyIdentity) {
        NationalyIdentity = nationalyIdentity;
    }


}
