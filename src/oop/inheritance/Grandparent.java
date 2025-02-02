package oop.inheritance;
//multilevel inheritance


public class Grandparent {
    int x = 10;
    public Grandparent()
    {
        System.out.println("Grandparent constructor called");
    }
}
class Parentn extends Grandparent
{
    int y = 20;
    Parentn()
    {
        super();
        System.out.println("Parent constructor called");
    }
}
// when u tend to create an object of child class and u call constructor
//of child class first it creates obj of parent class calling constructor
//of parent class. this happens because of super(). this calls the
//constructor of parent class/super class
class Childn extends Parentn
{
    int z = 30;
    Childn()
    {
        super();
        System.out.println("Child constructor called");
    }

    public static void main(String[] args) {
        Childn obj1 = new Childn();
//        Parentn objP = new Parentn();
//        System.out.println(obj1.x + " " + obj1.y + " "+ obj1.z);
//        System.out.println(objP.x + " " + objP.y + " ");

    }
}