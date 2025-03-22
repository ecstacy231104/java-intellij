package exam;

import java.util.Scanner;

public class Practice
{
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum=0;
        int avg=0;

        Scanner sc = new Scanner(System.in);
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//        arr[0] = sc.nextInt();
//        arr[1] = sc.nextInt();
//        arr[2] = sc.nextInt();
//        arr[3] = sc.nextInt();
//        arr[4] = sc.nextInt();
        for(int i=0;i<arr.length;i++) {
            System.out.println("enter  a number");
            arr[i] = sc.nextInt();


        }
        for(int i=0;i<arr.length;i++)
        {
           sum = sum+arr[i];
        }

//        arr<---56,87,76,5,700
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("the array is" + arr[i]);
            }

        } catch (Exception e) {
            System.out.println("error is :" + e.getMessage());
        }
        System.out.println("the sum is"+sum);
        avg = (sum)/arr.length;
        System.out.println("the average is"+avg);


    }

}
// 1. sum
//2. average