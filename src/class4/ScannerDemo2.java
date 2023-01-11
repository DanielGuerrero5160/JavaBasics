package class4;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("you are "+age+" years old");
        System.out.println("Are you hungry?");
        boolean hungry=input.nextBoolean();
        System.out.println("I am hungry "+hungry);
    }
}
