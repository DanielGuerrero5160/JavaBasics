package class5;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade=input.next().charAt(0);


        switch(grade){
            case 'A':
                System.out.println(grade+ " is Excellent");
                break;
            case 'B':
                System.out.println(grade+" is Good");
                break;
            case 'C':
                System.out.println(grade+" is Average");
                break;
            case 'D':
                System.out.println(grade+" is Bad");
                break;
            default:
                System.out.println(grade+" is not acceptable");
        }

    }
}
