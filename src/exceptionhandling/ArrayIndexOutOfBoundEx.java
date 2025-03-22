
package exceptionhandling;

import java.util.Scanner;

public class ArrayIndexOutOfBoundEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        try {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//        }catch (Exception error){
//            System.out.println(error);
//        }
//        System.out.println("ritika");
//        index:      0  1  2  3
        int arr[] = {12,13,14,15};
        try{
            System.out.println(arr[4]);

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("errror is "+e);
        }
//array Index out of bound excep
//         try - catch: 1. AOB 2. Arithmetic except 3. IO exception 4. NullPointerException 5.ClassNotFound
//        multiple catch block
//        finally
//        tree

        System.out.println("ritika");

//        code 1
//        code 2   < handle well
//        code 3

//try{
//
//}catch(Exception e){
//    System.out.println(e);
//}
// wa  call
    }

    //Throwable (Interface)
    public static class ArithmeticExcep {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    //        arithmetic exce: /0
            System.out.println("enter a value for x: ");
            int x = sc.nextInt();

    try {
        int res = 10 / x;

        System.out.println("res: " + res);
    }
    catch(ArithmeticException e)
    {
        System.out.println("the error is:"+e);
    }








            System.out.println("helloo");


        }
    }
}
// counter man <------   s2 s3


////        try{
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//
//            double result = (double)x/y;
//            System.out.println(result);
////        }catch(Exception e){
////            System.out.println("error is : "+e);
////        }
//
//        System.out.println("ritika");
