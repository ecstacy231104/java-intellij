package oop;

import java.util.*;

public class Bank {
    private int account_number;
    private String account_name;
    private int balance;
    private int d;



    public void setBalance(int b) {
        balance = b;

    }

    public int getBalance() {  //ye function sirf aapko balance
        return balance;


    }

    public void deposit(int depositingmoney) {
//        d = depositingmoney;
         balance = balance + depositingmoney;

        System.out.println("deposited money"+depositingmoney);
    }

    public void withdraw_money(int amount) {
        System.out.println("withdrawal money: "+amount);
        balance = balance - amount;

    }

    public void display_info() {
        System.out.println("it is" + account_number);
        System.out.println("it is" + account_name);


    }

    public static void main(String[] args) {
        Bank ritikaPassbook = new Bank();
        ritikaPassbook.setBalance(50000);
        System.out.println(ritikaPassbook.getBalance());

        ritikaPassbook.deposit(100000);

        System.out.println(ritikaPassbook.getBalance());
        ritikaPassbook.deposit(1222222);
        System.out.println(ritikaPassbook.getBalance());
        ritikaPassbook.withdraw_money(100000);
        System.out.println(ritikaPassbook.getBalance());





//       \

    }


}


