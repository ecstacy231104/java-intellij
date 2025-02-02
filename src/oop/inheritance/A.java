package oop.inheritance;

//INHERITANCE:
//base class/ parent class/ super class
public class A {

    int x = 10;
    public A()
    {
        System.out.println("A constructor called");
    }


    void method1(){
        System.out.println("this is a method from class A");
    }
}
class C{

}
//child class/ derived class/ sub class
class B extends A{

    int y = 20;
    public B()
    {
        System.out.println("B constructor called");
    }




    public static void main(String[] args) {


        B objB = new B();

    }

}






//A objA = new A();
//
//        System.out.println("x : "+objA.x);
//        objA.method1();
//        B objB = new B();
//        System.out.println("y : "+objB.y);
//
//        System.out.println("x : "+objB.x);
//        objB.method1();