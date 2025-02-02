// God has to create a map For Human
// i.e, God has to create a class for Human
package OOP;
// God has to create a map of Human

// i.e, God has to create a class Human

// map
class Human {
    // 1, chararcteristics
    String name;
    int maxAge;

    // default constructor
    Human() {
        System.out.println("default constructor");
    }

    // constructor: ***it constructs the object****
    // you can assign a responsibility to initialize the variables.
    Human(String nameValue, int maxAgeValue) {
        System.out.println("this is a parameterized constructor");

        name = nameValue;
        maxAge = maxAgeValue;
    }

    // functionalities
    void speak() {
        System.out.println("speaking");
    }

    void walk() {
        System.out.println("walking");
    }
    // git add .
    // git commit -m "message"
    // git push

    public static void main(String[] args) {

        Human obj = new Human();

        Human obj1 = new Human("ritika", 45);
        System.out.println("my name is " + obj1.name);
        System.out.println("my max age is " + obj1.maxAge);

        System.out.println("my name is " + obj.name);
        System.out.println("my max age is " + obj.maxAge);
        obj.name = "akash kumar roy";
        obj.maxAge = 50;
        System.out.println("my name is " + obj.name);
        System.out.println("my max age is " + obj.maxAge);

    }
}
