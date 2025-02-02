package oop.polymorphism;

//base class, super class, parent class
public class A {

//    poly

//    akash
    void m1(){
        System.out.println("in class A m1");
    }
}

class B extends  A{

    void m2(){
        System.out.println("m2 in B");
    }

    @Override
    void m1(){
        super.m1();
        System.out.println("in class B m1");
        System.out.println("in class B m1");
        System.out.println("in class B m1");

    }
    public static void main(String[] args) {
        B objB = new B();
        objB.m1();
    }
}

//obj of B --> m2(), m1()
