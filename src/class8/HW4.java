package class8;
import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the item you want to buy");
        String item= input.nextLine();
        System.out.println("enter the cost of the item");
        int cost= input.nextInt();
        int money=0;
        for(int i=0; i<=cost; i+=money){
            System.out.println("Please enter payment");
             money= input.nextInt();
             while(money<cost) {
                 System.out.println("You still need to pay " + (cost - money) + " Please enter another payment");
                 money = money + input.nextInt();
             }
              while(money>cost){
                     System.out.println("You paid too much. Your change is "+(money-cost)+"$ Thank you for shopping!");
                     break;
                 }
              if(money==cost){
                  System.out.println("payment complete. Thanks for shopping!");
                  break;
              }

        }
    }
}
