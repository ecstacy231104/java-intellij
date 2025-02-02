package exceptionhandling;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArithmeticExcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        arithmetic exce: /0
        System.out.println("enter a value for x: ");
        int x = sc.nextInt();

        try
        {
            int res = 10/x;

            System.out.println("res: "+res);


        }
        catch(ArithmeticException e)
        {
            System.out.println("the error is"+e);
        }


        System.out.println("rsibhtsbhisbnkjsna");


    }
}
