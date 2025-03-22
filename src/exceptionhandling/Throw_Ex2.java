package exceptionhandling;

import java.util.Scanner;

public class Throw_Ex2 {
//    instance var
    int x = 10;
//    clas var
   static int y = 20;
    public static void array_access() throws ArrayIndexOutOfBoundsException
    {

            int[] arr = {1, 2, 3, 4, 5};
            int index;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter index: ");
            index = sc.nextInt();

            System.out.println(arr[index]);
    }


    public static void main(String[] args){

//        Throw_Ex2 ovb = new Throw_Ex2();
//        System.out.println(ovb.x);
//        System.out.println(Throw_Ex2.y);
        try {
            Throw_Ex2.array_access();
        }
        catch(Exception e)
        {
            System.out.println("the exception is:"+e);
        }

    }
}
