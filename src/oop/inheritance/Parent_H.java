package oop.inheritance;

//
public class Parent_H {
    Parent_H()
   {
       System.out.println("Parent constructor called");
   }
}
  class ChildA extends Parent_H  {
      ChildA()
      {
          System.out.println("child a constructor called");
      }
  }
  class ChildB extends Parent_H
  {
      ChildB()
      {
          System.out.println("child b constructor called");
      }

      public static void main(String[] args) {
          ChildB obj1 = new ChildB();
          ChildA obj2 = new ChildA();

      }
  }

