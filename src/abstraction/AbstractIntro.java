package abstraction;

//1. abstract classes are half-classes
//2. u can not create an object of abstract classes DIRECTLY(upcasting & downcasting)
//3. if a class extends abstract class it must override all the abstract methods from it
//4. Abstract clases can have instance variables, constructors, static variable

//to make an abstract class u need to use abstract keyword with the class
public abstract class AbstractIntro {
//
//    int x = 10;
//    int y;
//    final int y1 = 100;//constant
//    static int z = 20;
//     AbstractIntro(int y){
//         this.y = y;
//     }
////   abstract classes have two kinds of methods: 1. concrete method 2. abstract method

//    1. concrete method
    void m1(){
        System.out.println("this is a m1 method in abstract class");
    }
//  2.   abstract method
    abstract void m2();
    abstract void m3();

}
 class  B extends AbstractIntro
 {
     @Override
     void m2()
     {
         System.out.println("m2 overrrided in the class B");
     }
     void m3()
     {
         System.out.println("m3 overrided in the class B");
     }
     void m4()
     {
         System.out.println("m4 in B");
     }

     public static void main(String[] args) {
       B obj1 = new B();
       obj1.m2();
       obj1.m3();
       obj1.m4();
       obj1.m1();

     }

 }