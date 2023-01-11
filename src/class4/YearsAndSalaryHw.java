package class4;

import java.util.Scanner;

public class YearsAndSalaryHw {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("please enter # of worked years");
        int workedYears=input.nextInt();
        System.out.println("Please enter salary");
        int salary=input.nextInt();
        if (workedYears>=5){
            System.out.println("you are eligible for a bonus!");
            if(salary>=50000){
                System.out.println("Your bonus is 5000");
            }else{
                System.out.println("your bonus is 3000");
            }
        }else{
            System.out.println("not eligible for a bonus;(");
        }



    }
}
