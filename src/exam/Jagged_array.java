package exam;

import java.util.Arrays;

public class Jagged_array {
    public static void main(String[] args) {
//        1 D
        int []arr={1,2,3,4,5,90};
        int[] arr1={1,2,3,4,5,90};
        int arr2[]={1,2,3,4,5,90};
        int []arr3 = new int[5];
        arr3[0] = 10;
        arr3[1] = 10;
        arr3[2] = 10;
        arr3[3] = 10;

//        2 d --> array of 1 d array
        int [][]arr4 = {
//               0 1 2
                {1,2,3}, // 0
                {4,5,6}, // 1
        };
//        arr4[1][0]
//        System.out.println(arr4[1][2]);
        for(int i=0;i<2;i++)
        {
            System.out.println(Arrays.toString(arr4[i]));
        }

    }

}
