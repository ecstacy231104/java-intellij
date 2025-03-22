package Miscellaneous;

import java.util.Scanner;

public class WrapperEx {
    public static void main(String args[])
    {
//        what is wrapper?
//        in java we have primitive data types like int, float, double, short, byte, long....
//        we can store them as object. For this purpose we have some wrapper classes.
        int x = 10;

//        primitive: int --> Integer wrapper class, float --> Float wrapper class,
//        double --> Double Wrapper class, Byte, short, long
//        2 keywords you need to keep in mind: 1. autoboxing
//        ex: Integer intObj1 = 10 --> java will automatically create an object of Integer class and
//        will store 10 in that

//        x is an int
//        wrapper concept in java gives us privilege to turn that x and 10
//        into an object

//        A obj = new A("ritika");
//        Integer intObj = new Integer(10);
          Integer intObj = Integer.valueOf(10);  // here an object of Integer class is being created
//        that holds an int value 10
          Integer intObj1 = 10 //auto-boxing:
                ; // here an object of Integer class is being created
//        auto-boxing
        int y =20;  //20 is stored in int (primitive) form
//        Integer intobj2 = new Integer(y);
//        new Integer(10);
        Integer intobj2 =20; //here 20 is stored in object(of Integer class) form. java has
//        created that obj and has stored 20 in it. this is called autoboxing
        int z = 20;
//        Integer intobj2 = new Integer(z);//deprecated\

         Integer intobj3 = Integer.valueOf(20);
         Integer intobj4 = 20; //we are storing an int 20 as object of Integer clas
//        System.out.println(intobj4);
//
//        System.out.println(intobj2);

//
        int y1= intobj4;  //java is extracting the int 20 from the object intobj4 and storing in y1
//        this is called unboxing
        System.out.println(""+y1);

        double d1 = 3.2; //primitive data type
//        Double doubleobj = new Double(3.2);
        Double doubleobj1 = Double.valueOf(d1);
        Double doubleobj2 = d1;  //auto-boxing

            double d2 = doubleobj2;  //unboxing
        System.out.println(d2);

        double d3 = 5.0;
//        Double doubleobj = new Double(5.0);
        Double doubleobj = Double.valueOf(5.0);
        Double doubleobj6 = 5.0;//autoboxing
        double d4 = doubleobj6;  //unboxing
//
        Scanner ob = new Scanner(System.in);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        


    }
}
