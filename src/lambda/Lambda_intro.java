package lambda;

//lambdas: a shorter way to write function
//pre-requisites
//1. interface: for lambdas we need an interface, but they are special kind of interface.
//They can have only one abstract methods. These are called functional interface

import exam.Bank2;
import java.util.Scanner;

@FunctionalInterface
public interface Lambda_intro {
    void m1();
}


class Ritika
{
    public static void main(String args[])
    {
        //Lambda_intro obj1 = new Lambda_intro();
        Lambda_intro obj = new Lambda_intro() {

                @Override
                public void m1() {
                    System.out.println("m1 overriden in anonymous class obj");
                }

        };
        obj.m1();
        Lambda_intro obj2 = ()-> System.out.println("m1 overriden in anonymous class obj2");

        obj2.m1();


//        lambda

        Lambda_intro obj3 = () -> System.out.println("hello");

        Lambda_intro obj4 = () -> System.out.println("m1 overridden using lambda");



        obj3.m1();
        obj4.m1();



    }
}


