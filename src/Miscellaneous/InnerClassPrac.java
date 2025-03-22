package Miscellaneous;
public class InnerClassPrac {
    private int x = 5;

    
    InnerClassPrac() {
        System.out.println("outer class constructor");
    }

    public class Extra {
        Extra() {
            System.out.println("inner class constructor");

        }
        void m1()
        {
            System.out.println("heelloo"+x);
        }
    }
}
 class Test2
 {
     public static void main(String[] args) {
         InnerClassPrac obj = new InnerClassPrac();
         InnerClassPrac.Extra obj1 = obj.new Extra();
         obj1.m1();
     }
 }