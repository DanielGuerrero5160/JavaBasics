package class8;
import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number for start of range");
        int numStart = input.nextInt();

        System.out.println("Please enter a number for end of range");
        int numEnd = input.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        for (int i = numStart; i <= numEnd; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            } else if (i % 2 != 0) {
                oddSum = oddSum + i;
            }
        }
            System.out.println("Sum of even numbers in range is " + evenSum);
            System.out.println("Sum of odd numbers in rage is " + oddSum);



    }
    }

