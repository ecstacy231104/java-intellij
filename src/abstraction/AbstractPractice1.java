package abstraction;

// 1. abstract class half-class
//2. we can;t create an obje of absrtact class
//3. child class must implement all the abstract methods

public abstract class AbstractPractice1 {
//    1. concrete method
    public void m1()
    {
        System.out.println("concrete method");
    }

//    2. abstrct methods
    public abstract void m2();
    public abstract void m3();
}

class B1 extends AbstractPractice1
{
    public void m2()
    {
        System.out.println("m2 overridden ");
    }
    public void m3() {
        System.out.println("m3 overridden");
    }
    public void m4()
    {
        System.out.println("m4 function");
    }
    public static void main(String[] args)
    {
        B1 obj1 = new B1();
        obj1.m2();
        obj1.m3();
        obj1.m1();
        obj1.m4();

    }
}
