package Miscellaneous;

public class OuterClass {
    private int x = 10;
    OuterClass(){
        System.out.println("outer class constructor");
    }

//    inner class
    class InnerClass{
        InnerClass(){
            System.out.println("inner class constructor");
        }
        void method1()
        {
            System.out.println(" x : "+x);

        }

}
}

class Test1{
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        OuterClass.InnerClass objInner = obj.new InnerClass();
        objInner.method1();

//        System.out.println(obj.x);

    }
}
