package exceptionhandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExcept {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value for x: ");
        try {
            int x = sc.nextInt();
            System.out.println("x: " + x);
        }
        catch(InputMismatchException e)
        {
            System.out.println("the error is:"+e);
        }

    }


}
