package abstraction;

//interface:
//Abstract class ka stricter version
//1. it is like a contract for classes
//2. all the methods in interfaces are abstract by default
//3. DIRECTLY you can't create an object of interfaces
public interface InterfaceIntro {

//    both m1 and m2 are same here.
//    by default all methods in interfaces are abstract even u don't declare it
//    by default all methods in Interfaces are public
    void m1();
    public abstract void m2();
}
//extends keyword : class ko inherit karne k liye
//implements : interface ko inherit karne k liye hota hai

class A implements InterfaceIntro{
     public void m1()
        {
            System.out.println("hello");
        }
       public  void m2()
        {
            System.out.println("hii");
        }
        void m3()
        {
            System.out.println("thikhw");
        }
        public static void main(String[] args)
        {
            A obj1 = new A();
            obj1.m1();
            obj1.m2();
            obj1.m3();


        }
}
//OOP: 1. class, obj 2. Encapsulation 3. Inheritance 4. Polymorphism 5. Abstraction(abstrac