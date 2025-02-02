//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Student ritika = new Student("abc",0,89,87,99);
        System.out.println(ritika.getRollnumber());
//        ritika.setRollnumber(-13);
//        ritika.displayInfo();


        ritika.setRollnumber(1220);
        ritika.displayInfo();
        int rollNumber = ritika.getRollnumber();
        System.out.println(rollNumber);
    }
}