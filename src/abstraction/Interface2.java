package abstraction;

public interface  Interface2 {
    void m1();
    void m2();

}
  interface Interface3
  {
      void m4();
      void m5();

  }
//  A ---> B ---->  C /multi-level
// A, B -----> C /multiple  X
// multiple classes can't be inherited in a single clawe
// multiple interfaces can be inherited in a single class



 class Ritika implements Interface2,Interface3
 {
     public void m1()
     {
         System.out.println("hmm");
     }
     public void m2()
     {
         System.out.println("hanhana");
     }
     void m3()
     {
         System.out.println("gnnnnn");
     }
     public static void main(String[] args)
     {
         Ritika obj1 = new Ritika();
         obj1.m1();
         obj1.m2();
         obj1.m3();

     }

     @Override
     public void m4() {

     }

     @Override
     public void m5() {

     }
 }
