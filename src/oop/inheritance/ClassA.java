package oop.inheritance;

//supper class for class B
public class ClassA {
    public ClassA()
    {
        System.out.println("ClassA constructor called");

    }
}

//sub class of class A
//superclass for class c
class ClassB extends ClassA{//single
    ClassB()
    {
//        super();
        System.out.println("ClassB constructor called");
    }

}

class ClassC extends ClassB{
    ClassC()
    {
//        super();
        System.out.println("ClassC constructor called");
    }

    public static void main(String[] args) {
        ClassC obj1 = new ClassC();

    }
}
