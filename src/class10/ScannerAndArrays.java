package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] numbers= new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= input.nextInt();

        }
        System.out.println(Arrays.toString(numbers));

        }

    }

