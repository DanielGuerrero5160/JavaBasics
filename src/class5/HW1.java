package class5;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int height= input.nextInt();
        if(height<60){
            System.out.println("short");
        }
        if (height>=60&&height<=72){
            System.out.println("medium");
        }
        if(height>72){
            System.out.println("tall");
        }

    }
}
