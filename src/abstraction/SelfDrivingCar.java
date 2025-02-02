package abstraction;

// 2002 Elon: 1. electric 2. autodriving

public abstract class SelfDrivingCar {

//
    void drivingUsingBetteries(){
        System.out.println("driving using battery");
    }

//    autodriving
    abstract void autoDriving();

}

//2014
class Model1 extends SelfDrivingCar{

    @Override
    void autoDriving() {
        System.out.println("autdriving ");
    }

    public static void main(String[] args) {
        Model1 obj = new Model1();
    }
}
