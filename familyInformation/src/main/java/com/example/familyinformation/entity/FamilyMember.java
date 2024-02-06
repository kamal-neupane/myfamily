package com.example.familyinformation.entity;

import jakarta.persistence.*;


import java.util.Date;

@Entity
public class FamilyMember {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstName")
    private String firstName;



    @Column(name = "lastName")
    private String lastName;
    @Column(name = "phoneNumber")
    private String phNo;
    @Column(name = "email")
    private String email;





    public FamilyMember() {
    }

    public FamilyMember(String firstName, String lastName, String phNo, String email) {
        this.firstName = firstName;

        this.lastName = lastName;
        this.phNo = phNo;
        this.email = email;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
