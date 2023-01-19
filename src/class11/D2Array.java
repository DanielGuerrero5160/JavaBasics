package class11;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {

        int[][] numbers={{10,20,30},
                         {45,55,66,},
                         {30,40,20,10,25},
        };
        System.out.println(Arrays.toString(numbers[0]));
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[2][i]);
        }
        int[] arr=numbers[0];// getting complete first array from 2D array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
