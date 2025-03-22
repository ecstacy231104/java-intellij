package midterm;

public abstract class  Midterm3 {
    public void m1()
    {
        System.out.println("ok");
    }
    abstract void m2();
    abstract void m3();

}
 class Midterm4 extends Midterm3
 {
     void m2()
     {
         System.out.println("ugh");
     }
     void m3()
     {
         System.out.println("h,,");
     }
 }
