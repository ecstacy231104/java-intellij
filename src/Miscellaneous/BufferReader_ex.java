package Miscellaneous;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReader_ex {
    public static void main(String[] args) throws IOException {
        Scanner scanobj = new Scanner(System.in);
        String name = scanobj.nextLine();
        System.out.println("name is " + name);

//        Bufferreader
//        faster than scanner
//        with large data bufferreader is more efficient and versatile
//        it stores data in a buffer then our prog reads from it
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter name 2: ");
        String name2 = obj.readLine();
        System.out.println("name 2 is " + name2);


        BufferedReader obj1 = new BufferedReader(new InputStreamReader(System.in));

        String name3 = obj1.readLine();
        System.out.println(name3);

    }


}
