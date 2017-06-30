package com.ps;
 public class User {
    private int userID;
    private String Lastname;
    private String Firstname;
    private String Address;
    private String City;
    
    public int getuserID() {
        return userID;
    }
 
    public void setuserID(int userID) {
        this.userID = userID;
    }
 
    public String getLastname() {
        return Lastname;
    }
 
    public void setLastname(String Lastname) {
        this.Lastname= Lastname;
    }
 
    public String getFirstname() {
        return Firstname;
    }
 
    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }
 
    public String getAddress() {
        return Address;
    }
 
    public void setAddress(String Address) {
        this.Address = Address;
    }
 
    public String getCity() {
        return City;
    }
 
    public void setCity(String City) {
        this.City = City;
    }
 
}