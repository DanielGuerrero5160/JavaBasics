package class8;
import java.util.Scanner;
public class LoopWithString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        while(input.next().equalsIgnoreCase("Sha")){
            System.out.println("Great Student who always wanted an example with String in loop");
        }

    }
}
