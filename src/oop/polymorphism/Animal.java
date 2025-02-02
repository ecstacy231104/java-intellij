package oop.polymorphism;

import org.w3c.dom.ls.LSOutput;

public class Animal {
    public void sound()
    {
        System.out.println("hello");
    }

}
class Dog extends Animal {
    void m1(){
        System.out.println("m1 in dog class");
    }
    public void sound() {
        super.sound();

        System.out.println("hiii");
    }

    public static void main(String[] args) {
     Dog obj1 = new Dog();
     obj1.sound();
     obj1.m1();

//        Animal obA = new Dog(); //upcasting

//        double 10.0  <-- 10
//        double x = 10;

//        obA.sound();
//        obA.m1();

    }

}