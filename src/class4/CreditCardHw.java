package class4;

import java.util.Scanner;

public class CreditCardHw {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Do you have a credit card? Please enter true or false");
        boolean card=input.nextBoolean();
        if(card){
            System.out.println("What is the balance");
            int balance=input.nextInt();
            if(balance>1000){
                System.out.println("Pay off the balance");
            }else{
                System.out.println("you can spend more");
            }
        }else{
            System.out.println("Do you want our card?");
        }
    }
}
