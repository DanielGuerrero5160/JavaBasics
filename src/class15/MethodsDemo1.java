package class15;

import java.util.Scanner;

public class MethodsDemo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a whole number");
       int numberEntered= input.nextInt();
        System.out.println("you entered "+numberEntered);//The reason we are able
        //print the entered number is because the .nextInt method in the scanner class has a return keyword which
        //defines the output of the method.

    }
}
