package class4;

import java.util.Scanner;

public class DmvHw {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("Drivers license issued");
        }else{
            System.out.println("Learners permit issued");
        }
    }
}
