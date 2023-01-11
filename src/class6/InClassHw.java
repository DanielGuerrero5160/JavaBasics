package class6;
import java.util.Scanner;
public class InClassHw {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        int num= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();

        if(num>num2&&num>num3){
            System.out.println(num+" is the largest number");
        }else if(num2>num&&num2>num3){
            System.out.println(num2+" is the largest number");
        }else if(num3>num&&num3>num2){
            System.out.println(num3+" is the largest number");
        }
    }
}
