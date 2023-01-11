package class5;
import java.util.Scanner;
public class HW9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first number");
        double num1=input.nextDouble();
        System.out.println("Please enter your operator(*,-,+,/)");
        char operator=input.next().charAt(0);
        System.out.println("Please enter your second number");
        double num2= input.nextDouble();

        if(operator=='+'){
            System.out.println(num1+num2);
        }else if(operator=='-'){
            System.out.println(num1-num2);
        }else if(operator=='*'){
            System.out.println(num1*num2);
        }else if(operator=='/'){
            System.out.println(num1/num2);
        }else{
            System.out.println("Invalid entry");
        }

    }
}
