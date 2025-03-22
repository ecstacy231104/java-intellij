package midterm;

public class MidTerm {
//    instance variable/ object variable
    int x;
    int y;
//    class variable
    static int z=10;

    MidTerm(int x1,int y1)
    {
        System.out.println("the parameterised constructor");
        x1 = x;
        y1 = y;

    }
//    instance method / object method
    public void m1()
    {
        System.out.println("helo");
    }
//    class method
    public static void m2()
    {
        System.out.println("m2 class method");
    }
    public static void main(String[] args)
    {
//
        System.out.println(MidTerm.z);
        MidTerm.m2();

    }
}
