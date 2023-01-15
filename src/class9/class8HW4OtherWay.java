package class9;

import java.util.Scanner;

public class class8HW4OtherWay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total=0;
         for(int i=0;i<5;i++){

            System.out.println("Please enter the item and its price");
            String itemName = input.next();
            double price = input.nextDouble();
            total=total+price;
             System.out.println("This is the total amount that you have to pay "+total);
        }
        System.out.println("Please pay for the items");
         double amountPaid=input.nextDouble();
         if(amountPaid>total){
             double change=amountPaid-total;
             System.out.println("Hey, here is your change "+change);
             System.out.println("Thank you for shopping");
         }else if(amountPaid<total){
             System.out.println("You can't buy all the items");
             System.out.println("You still need to pay $"+(total-amountPaid));
         }else{
             System.out.println("Thank you for shopping");
         }

    }



}
