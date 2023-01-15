package class9;

import java.util.Scanner;

public class class8HW2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Please apply for credit card");
            String answer=input.next();
            if(answer.equals("yes")){
                System.out.println("Thank you for your application");
                break;
            }else{
                continue;
            }
        }
    }
}
