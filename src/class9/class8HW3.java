package class9;

import java.util.Scanner;

public class class8HW3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the starting number of the range");
        int startRange= input.nextInt();
        System.out.println("Please enter the end number of the range");
        int endRange= input.nextInt();

        int sumEven=0;
        int sumOdd=0;
        for(int i=startRange;i<=endRange;i++){
            if(i%2==0){
               sumEven+=i;
            }else {
                sumOdd+=i;
            }

        }
        System.out.println("The sum of the even numbers is "+sumEven);
        System.out.println("The sum of the odd numbers i "+sumOdd);

    }
}
