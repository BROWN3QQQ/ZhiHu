package com.springboot.springboot.model;

public class User {
    private int id;
    private String name;
    private String password;
    private String salt;
    private String head_url;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getHead_url() {
        return head_url;
    }

    public void setHead_url(String head_url) {
        this.head_url = head_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public  User(){
//
//    }
//    public  User(String name){
//        this.name = name;
//    }
   public String userDescription(){
        return "This is "+ name;
   }
}
