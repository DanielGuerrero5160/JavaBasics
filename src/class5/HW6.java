package class5;
import java.util.Scanner;
public class HW6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
       int num= input.nextInt();
       int num1= input.nextInt();
       int num2= input.nextInt();

       if(num>num1){
           if(num>num2){
               System.out.println(num+" is the largest");
           }
       }
       if(num1>num){
           if(num1>num2){
               System.out.println(num1+" is the largest");
           }
       }
        if (num2 > num) {
            if(num2>num1){
                System.out.println(num2+" is the largest");
            }
        }
    }
}
