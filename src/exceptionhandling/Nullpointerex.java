package exceptionhandling;

public class Nullpointerex {
//    instance variable / object variable
    int x = 10;

    public void getMessage(){
        System.out.println("erro mesage");
    }

    public static void main(String[] args) {
        Nullpointerex obj1 = new Nullpointerex();
//        e.getMessage();

//        obj1 = null;

        int y = 340;
        y =34;
        System.out.println("the value of y is"+ y);

        System.out.println("the value of x is"+obj1.x);

        obj1 = null;
        try {
            System.out.println("the value of x is" + obj1.x);
        }
        catch(NullPointerException e)
        {
            System.out.println("the error is :"+e);


        }

    }
}
