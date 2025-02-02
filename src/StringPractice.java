import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.*;
//String,Math

public class StringPractice {

    public static void main(String[] args) {
//        string methods
//        index:       0   1  2  3
        int[] array = {23,45,67,89};
//        string pool
//            index:   012345
        String name = "Ritika";
//        String stringObject = new String("ritika is an intelligent student");

        System.out.println(name.length());


//        int i=0;
        for(int i=0;i< name.length();i++)
        {

            System.out.println(" "+name.charAt(i));


        }
//        concatanation
        String str1 = "abc";
        String str2 = "def";
        String str3 = str1.concat(str2);
        String str5 = str1 + str2;
        String str4 = "bg".concat("fg");
        System.out.println(str4);

        String str6 = "Ritika is an Intelligent student.   ";
        System.out.println(str6.endsWith("."));
        System.out.println(str6.length());
        System.out.println(str6.toUpperCase());
        System.out.println(str6.toLowerCase());
        System.out.println(str6.trim());
        System.out.println(str6.indexOf("R"));
        System.out.println(str6.lastIndexOf("t"));
//                          65      -     97  = -32
        System.out.println("Aa".compareTo("a")); //dictionary lexicographically
//        a
//        aa
//        b


    }
}

//
//Explain the working of following methods of java.String  package by making suitable programs :
//A)	char charAt(int index)
//B)	int compareTo(Object o)
//C)	int compareTo(String anotherString)
//D)	int compareToIgnoreCase(String str)
//E)	String concat(String str)
//F)	boolean endsWith(String suffix)
//G)	boolean equals(Object anObject)
//H)	int indexOf(int ch)
//I)	int lastIndexOf(int ch)
//J)	int length()
//K)	String toLowerCase()
//L)	String toUpperCase()
//M)	String trim()