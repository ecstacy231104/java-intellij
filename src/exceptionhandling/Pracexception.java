package exceptionhandling;

import java.sql.SQLOutput;
import java.util.Scanner;
//
 class MyException extends  Exception
{
    MyException(String message)
    {

        super(message);

    }
}
public class Pracexception {

    public static void main(String[] args) {
        Scanner scanobj = new Scanner(System.in);
        try
        {
            int x = scanobj.nextInt();

            int res = 10 / x;
            System.out.println("res is"+res);
//           x>100
//            if (x < 0){
//                throw  new Duplicate("duplicate ");
//            }

        }
        catch(Exception e)
        {
            System.out.println("excep"+e);
        }


    }
}
