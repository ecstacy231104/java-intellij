//package OOP;

// Create a `Student` class with the following attributes:

// - Name
// - Roll Number
// - Marks in 3 subjects

// Include methods to:

// 1. Calculate the total, average marks and percentage.
// 2. Display student details and their grade (A, B, C, etc.) based on the percentage.

// **Hint:** Use constructors
import java.util.*;
public class Student {
    private String name;
    private int rollnumber;
    public int bio, chem, phy;
     private int balance;

//    encapsulation: data hiding, data security
//    1. access modifier: default, public, private,protected
//    2. getter and setter

    public Student(String n, int rn, int m1, int m2, int m3) {
        name = n;
        rollnumber = rn;
        bio = m1;
        chem = m2;
        phy = m3;
        System.out.println(" constructor called"+name);

    }

//    getter method
    int getRollnumber(){
//   roll number , password
        return rollnumber;
    }

//    balance
//    gerBalance(){
//   logic : they will send one otp on your phone
//    if(otp == otpFromUser)
//    }(

    void setRollnumber(int rollNumber){

        if(rollNumber>0){
            rollnumber = rollNumber;
        }else {
            System.out.println("give a proper roll number");
        }
    }

    private int  calculateTotal() {
        int tot = bio + chem + phy;
//        System.out.println("total is" + tot);
        return tot;
    }

 public  double calculateAverage() {
        double avg = (double)calculateTotal() / 3;
//        System.out.println("average is" + avg);
         return  avg;
    }

    double calculatePercantage() {
        double percentage = (double)calculateTotal() / 300 * 100;
         return percentage;
    }

    void displayInfo() {
        System.out.println("Name : " + name + "\nroll num: " + rollnumber + "\nbio: " + bio + "\nchemistry: " + chem
                + "\nPhysics: " + phy);

        calculateAverage();
        calculateTotal();
        calculatePercantage();
        // if(tot>=90)
        // {
        // System.out.println("grade A");
        // }
        // if(tot>=80&&tot<90)
        // {
        // System.out.println("grade B");
        // }
        // if(tot<80)
        // {
        // System.out.println("garde C");
        // }
    }

    public static void main(String[] args)
    {
        Student ritika=new Student("Covey",51,90,91,93);

//bates motel
        int total = ritika.calculateTotal();
        double percentage = ritika.calculatePercantage();
        double avg = ritika.calculateAverage();
        System.out.println("total marks: "+total +"\naverage marks "+avg+"\npercentage "+percentage);

       ritika.displayInfo();

        System.out.println(ritika.name);


    }

}