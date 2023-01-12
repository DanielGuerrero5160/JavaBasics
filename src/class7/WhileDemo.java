package class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

        boolean condition=true;
        Scanner input=new Scanner(System.in);
        int number=10;
        while(condition){
            System.out.println("Please enter a number between 10 and 20");
            int userInput= input.nextInt();
            if(userInput>number){
                System.out.println("Your entered number is greater");
            }else if(userInput<number){
                System.out.println("Your number is smaller");
            }else{
                System.out.println("You won!");
                condition=false;

               int num=0;

               do{
                   System.out.println("Please enter a number");
                   num=input.nextInt();
               }while(num!=10);


            }
        }
    }
}
