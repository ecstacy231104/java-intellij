package abstraction;


import org.w3c.dom.css.Rect;

public interface Shape {
    public void area();
    public void perimeter();
    String color= "blue";
    void resize();


}


class Circle implements Shape {

    double r;
    Circle(double radius)
    {
        this.r=radius;
    }
    public void area() {
        double a;
        a = 3.14 * r* r;
        System.out.println("the area is" + a);

    }
    public void perimeter()
    {
        double p=0;
        p=2*3.14*r;
        System.out.println("so, the perimeter is"+p);

    }

    @Override
    public void resize() {
        System.out.println("resizing circle");
    }

}
class Rectangle implements Shape
{
    int l;
    int b;
    Rectangle(int length,int breadth)
    {
        this.l=length;
        this.b=breadth;

    }
    public void area()
    {
        int area=0;
        area= l*b;
    }
    public void perimeter()
    {
        int p;
        p=2*(l+b);
    }
    @Override
    public void resize() {
        System.out.println("resizing Rect");
    }
}

class Hexa implements Shape
{
    int l;
    int b;
    Hexa(int length,int breadth)
    {
        this.l=length;
        this.b=breadth;

    }
    public void area()
    {
//        int area=0;
//        area= l*b;
        System.out.println("area of hexa");
    }
    public void perimeter()
    {
//        int p;
//        p=2*(l+b);
        System.out.println("peri of hexa");

    }
    @Override
    public void resize() {
        System.out.println("resizing Hexa");
    }

    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle(2,4);
        Circle obj1 = new Circle(2.0);
        Hexa obj2 = new Hexa(3,4);

        Shape shape = new Rectangle(4,5);
        shape.resize();
        shape = new Circle(4.0);
        shape.resize();
        shape = new Hexa(1,0);
        shape.resize();

    }
}