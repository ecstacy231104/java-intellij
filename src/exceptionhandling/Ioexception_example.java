package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ioexception_example {
//    checked(IOEXCEPTION), unchecked(Runtime )
    public static void main(String[] args)
    {
//        unchecked(compiler doesn't check any possible exception)--> compiler doesn't care,
//        you will find the exception at runtime if you do
//        someting at run time that is not acceptable
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //possible Input Mismatch Exception 12r

        int div = 10/x; // possible Arithmetic Exception , 0
           System.out.println("div: "+div);


//checked(compiler checks possible exception) ---> compile time exception --->
// compiler will force you to use try catch

        try{
            FileReader fr = new FileReader("a.txt"); // possible FileNotFound exception

        } catch (FileNotFoundException e) {

        }
    }
}
