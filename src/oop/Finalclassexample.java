package oop;
//final
//1. class; final with class makes it non-inheritable
//2. variable: final variables are constant variable
//3. method: final methods  cant be overridden.
//4. ref variable: if final is used with a ref variable, then we can't do a dynamic method dispatch.
public  class Finalclassexample {
    final int x = 10;//constant
    Finalclassexample(){
//        x =111;
    }
    final void m1()
    {

    }
    void m2()
    {

    }

}
class Final1 extends Finalclassexample{

//    //   void m1()
// {
//
//  }
    void m2()
    {

    }

    public static void main(String[] args) {
//        obj1 is a reference variable
//        why? because it holds the reference/address of the obj that is created
//        in the heap area.
        int x = 10;
        Finalclassexample obj1 = new Finalclassexample();//
//        note: main, and the local variable x is created in stack,
//        even the ref variable obj1 is created in the stack
//        new Finalclassexample() creates an object in heap and returns the address
//        of the created object and that is stored in the ref var obj1
        System.out.println(obj1);
        System.out.println(new Finalclassexample());
//        System.out.println("obj1 "+obj1);
        obj1 = new Finalclassexample();
        System.out.println(obj1);
//        System.out.println("obj1 "+obj1);
        final int x1 = 10;
//        x1 = 20;
       final Finalclassexample obj2 = new Finalclassexample();
//       obj2 = new Finalclassexample();



    }
}