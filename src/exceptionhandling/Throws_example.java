
package exceptionhandling;
import java.util.Scanner;

public class Throws_example {

    public void divide() throws Exception
    {
//        try {
            int x;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a num: ");
            x = sc.nextInt();
            int res = 10 / x;
//        }catch (Exception e)
//        {
//            System.out.println(e);
//        }

    }


    public static void main(String[] args) {
        Throws_example obj = new Throws_example();
        try {
            obj.divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }


}
