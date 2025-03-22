package midterm;

public class Midterm2 {

   int x;
   Midterm2(int x)
   {
       this.x = x;
   }
   public void m1(){
       System.out.println("m1");
   }
//   overloading----> static polymorphism/compile time polymorphism
   public void m2()
   {
       System.out.println("m2");
   }
   public void m2(int x,int y)
   {
       System.out.println("m2 overloaded");
   }
    public void m2(int x)
    {
        System.out.println("m2 overloaded");
    }
    public void m2(double x)
    {
        System.out.println("m2 overloaded");
    }
}
 class MidtermA extends Midterm2{
    int y;
    MidtermA(int y1,int x1)
    {
        super(x1);
        this.y = y1;
    }
//    overriding ---> dynamic polymorphism/ runtime polymorphism
   public  void m1()
    {
        super.m1();

        System.out.println("overridden");
    }

    public static void main(String[] args)
    {
        MidtermA obj1 = new MidtermA(3,2);
        System.out.println(obj1.y);
        System.out.println(obj1.x);
        obj1.m1();

    }


 }
