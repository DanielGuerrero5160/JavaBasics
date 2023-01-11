package class5;

import java.util.Scanner;

public class ScannerDemo1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
/*
Scanner -> Name of class
scan is just a variable like we create primitive data types
= -> Is an assignment operator
System.in -> Tells the computer we want to read the data from keyboard
 */
/*
        System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("You are "+age+" years old");

        System.out.println("Please enter your weight");
        double weight=scan.nextDouble();
        System.out.println("Your weight is "+weight+" pounds");
        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean();
        System.out.println("hungry "+hungry);
        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);// taking char type of input
        System.out.println("Your gender is "+gender);
*/
        System.out.println("Please enter your name");
        String name=scan.next();// when we have to take only one word as input(no spaces)
        System.out.println("Your name is "+name);

        scan.nextLine();//Trick to make nextLine method work after we have used any other method
        //from scanner class
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);
        scan.close(); //Scanner takes a lot of space - This closes it to save space


    }

    }

