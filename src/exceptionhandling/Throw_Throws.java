package exceptionhandling;
import java.util.*;
//zomato
//CouponNotFound

//AgeNotValid

class Age_not_valid extends Exception {

Age_not_valid(String message)
{
    super(message);

}
}
public class Throw_Throws {
    public static void main(String[] args) {
      try {
          Scanner scanobj = new Scanner(System.in);
          System.out.println("Enter age: ");
          int age = scanobj.nextInt();
          if(age<0)
          {
            throw new Age_not_valid("Age can not be negative");
          }
          System.out.println("age is:" + age);
      }
      catch(InputMismatchException e)
      {
          System.out.println("exception is:"+e);

      }
      catch(Age_not_valid e)
      {
          System.out.println("exception is:"+e);
      }

//      A{
//
//        }
//
//      new A();



    }
}
