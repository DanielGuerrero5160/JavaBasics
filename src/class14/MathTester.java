package class14;

import java.util.Scanner;

public class MathTester {
    public static void main(String[] args) {
        Math m=new Math();

        m.addition(5,5);
        m.subtract(2366,55);
        m.mul(50,2,6);
        Scanner input=new Scanner(System.in);
       // int num=input.nextInt();

        int result= m.sub(100,50);
        System.out.println(result);
    }
}
