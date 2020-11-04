package com.company.restudy.FaceObject;

public class User {
    private String cardNo;
    private String user;
    private String identity;
    private String password;
    private String phone;
    private double balance;
    public User(){
    }
    public User(String cardNo,String user,String identity,String password,String phone,double balance){
        this.balance=balance;
        this.cardNo=cardNo;
        this.identity=identity;
        this.password=password;
        this.user = user;
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getIdentity() {
        return identity;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getUser() {
        return user;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "User{" +
                "cardNo='" + cardNo + '\'' +
                ", user='" + user + '\'' +
                ", identity='" + identity + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", balance=" + balance +
                '}';
    }
}
