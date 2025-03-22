package exceptionhandling;

import java.io.FileWriter; // built-in
import java.util.InputMismatchException; //built in
import java.util.*;  // built-in package
import testpackage.*;//user-defined package
//import testpackage.B;


public class MultipleCatchFinally {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//        A objA = new A();
//        B objB = new B();

        System.out.println("enter a value for x");
        try {
            int x = sc.nextInt(); // 12r--->input mismatch
//            index:      0  1    2
            int arr[] = {22,344,56};
            int res = 10 / x; // 0----> AE
            System.out.println("value of res " + res);
            System.out.println("enter index: ");
            int index = sc.nextInt();//0,1,2,6
            System.out.println(arr[index]);//6--> ArrayIOOB
        }
        catch(ArithmeticException e){
            System.out.println("1 eror is: "+e);

        }catch(InputMismatchException e)//java.util package mei jayega
        {
            System.out.println("2 the error is:"+e);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("exception is"+e);

        }

        catch (Exception e){
            System.out.println("3 error : "+e);
        }finally{
//            it is used to clean unused resources, objects
            sc.close();
            System.out.println("I will execute always");
        }



        System.out.println("end of the prog");




    }
}
