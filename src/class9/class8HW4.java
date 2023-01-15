package class9;
import java.util.Scanner;
public class class8HW4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the item you want to buy");
        String item= input.nextLine();
        System.out.println("Please enter the cost of the item");
        int cost= input.nextInt();
        System.out.println("Please enter your payment amount");
        int payment=input.nextInt();
        while(payment<cost){
            System.out.println("You still owe "+(cost-payment)+" Please enter another payment");
            payment=payment+ input.nextInt();
        }
        if(payment>cost){
            System.out.println("You paid too much. Your change is $"+(payment-cost)+" Thank you for shopping!");
        }else if(payment==cost){
            System.out.println("Item is fully paid for. Thank you for shopping");
        }


    }
}
