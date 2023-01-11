package class4;

import java.util.Scanner;

public class FarenheightToCelcius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your city");
        String city=input.nextLine();
        System.out.println("Please enter the temperature");
        double temp=input.nextInt();
        System.out.print("The temperature in "+city+" is "+((temp-32)*5/9)+" Celcius");



    }
}
