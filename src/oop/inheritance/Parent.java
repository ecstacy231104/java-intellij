package oop.inheritance;
//gp ===> parent  -====> child
public class Parent {

    public Parent()
    {
        System.out.println("parent class constructor called");
    }
//    polymorphism : 1. method overloading(compile time polymorphism)

//    2. method overriding ( runtime polymorphism)
    void add()
    {
        System.out.println(" 2+3 = 5");

    }
    void add(int x, int y){
        System.out.println(" sum "+(x+y));

    }
    void add(int a, int b,int c){
        System.out.println(" sum "+(a+b+c));

    }
    void add(double a, double b,double c){
        System.out.println(" sum "+(a+b+c));

    }
    void add(int x , double y){
        System.out.println(" sum "+(x+y));

    }


}
//oop
//1. encap : pri, pub,
//2. inheri
//3. poly: 1. overloading 2. overriding
//4.abstr
class Child extends Parent

{
    public Child()
    {
        System.out.println("child class constructor called");
    }

    public static void main(String[] args) {
        Child obj1 = new Child();
        Parent objp = new Parent();
        objp.add();
        objp.add(10,12);

    }
}

//1. single inheritance  3. multilevel 4. hierarchical 5. hybrid


// A --> B single inheritence
// A  --->  B ----> C  multi level
