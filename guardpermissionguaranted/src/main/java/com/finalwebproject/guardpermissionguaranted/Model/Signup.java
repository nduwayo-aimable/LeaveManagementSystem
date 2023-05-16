package com.finalwebproject.guardpermissionguaranted.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String username;
    private String email;
    private String gender;
    private String location;
    private String password;

    

    public Signup() {
    }



    public Signup(Long user_id, String username, String email, String gender, String location, String password) {
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.gender = gender;
        this.location = location;
        this.password = password;
    }



    public Long getUser_id() {
        return user_id;
    }



    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }



    public String getUsername() {
        return username;
    }



    public void setUsername(String username) {
        this.username = username;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getGender() {
        return gender;
    }



    public void setGender(String gender) {
        this.gender = gender;
    }



    public String getLocation() {
        return location;
    }



    public void setLocation(String location) {
        this.location = location;
    }



    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }



    
}
