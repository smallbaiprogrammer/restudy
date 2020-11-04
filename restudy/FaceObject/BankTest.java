package com.company.restudy.FaceObject;

import java.util.Scanner;
public class BankTest {
    public static Scanner scanner;
    private static User user;
    public static void main(String[] args) {
        Bank bank = new com.company.java.多线程.Bank();
        scanner = new Scanner(System.in);
        testPassword(bank);
        System.out.println("登录成功");
        choose(user);

    }
    public static void testPassword(Bank bank){
        while (true){
            System.out.println("请输入账户名和密码");
            String cardNo = scanner.nextLine();
            String password = scanner.nextLine();
            for (int i = 0 ; i < bank.getSize() ;i++){
                if (bank.getUsers()[i].getCardNo().equals(cardNo)&&bank.getUsers()[i].getPassword().equals(password)){
                    user = bank.getUsers()[i];
                    System.out.println("登录成功 ");
                    System.out.println("欢迎，账户为"+user.getCardNo()+"的"+user.getUser()+"先生,您的余额为"+user.getBalance());
                    return;
                }
            }
            System.out.println("密码输入错误，请重新输入");
        }
    }
    public static void choose(User user){
        System.out.println("=========== 1.存款 2.取款 3 转账 4修改密码 0 退出==========");
        int s = scanner.nextInt();
        do {
            switch (s) {
                case 1:
                    storeMoney(user);
                    break;
                case 2:
                    takeMoney(user);
                    break;
                case 3:
                    transfer(user);
                    break;
                case 4:
                    modifyPassword(user);
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }while (true);

    }
    public static void takeMoney(User user){
        System.out.println("请输入取款金额");
        double balance = scanner.nextDouble();
        if (balance>user.getBalance()){
            System.out.println("余额不足，请充值");
        }else {
            user.setBalance(user.getBalance()-balance);
            System.out.println("取款成功，您的余额还剩"+user.getBalance());
        }
    }
    public static void storeMoney(User user){
        System.out.println("请输入存款金额");
        double balance = scanner.nextDouble();
        user.setBalance(user.getBalance()+balance);
        System.out.println("存款成功，您的余额还有"+user.getBalance());
    }
    public static void transfer(User user){
        System.out.println("请输入转账账户");
        String s = scanner.nextLine();
        System.out.println("请输入转账金额");
        double balance = scanner.nextDouble();
        if (balance>user.getBalance()){
            System.out.println("转账失败，余额不足");
        }else {
            user.setBalance(user.getBalance()-balance);
            System.out.println("转账成功,您的余额还有"+user.getBalance());
        }
    }
    public static void modifyPassword(User user){
        do{
            System.out.println("请输入旧密码");
            String oldPassword = scanner.nextLine();
            if (oldPassword.equals(user.getPassword())){
                System.out.println("请输入新密码");
                String newPassword = scanner.nextLine();
                user.setPassword(newPassword);
                System.out.println("密码修改成功");
                return;
            }else {
                System.out.println("旧密码输入错误，请重试");
            }
        }while (true);
    }
}