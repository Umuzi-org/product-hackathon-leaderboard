package com.Hackathon_LeaderBoard.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recruit {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int id;

    private String firstName;

    private String lastName;

    private String username;

    private String umuziEmail;

    private String password;

    //R for recruit and A for admin
    private Character role;

    public Recruit()
    {

    }

    public Recruit(String firstName,String lastName, String username, String umuziEmail, String password,Character role)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.umuziEmail = umuziEmail;
        this.password = password;
        this.role = role;
        this.username = username;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getUsername(){
        return this.username;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getUmuziEmail(){
        return this.umuziEmail;
    }

    public String getPassword(){
        return this.password;
    }

    public Character getRole()
    {
        return role;
    }
    public int getId() {
        return id;
    }
}
