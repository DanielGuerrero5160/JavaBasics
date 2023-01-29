package class13;

import java.util.Scanner;

public class HwTask3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter moms name");
        String moms= input.next();
        System.out.println("Please enter dads name");
        String dads= input.next();
        System.out.println("Are you expecting a boy or a girl? Please enter B or G");
        String gender= input.next();

        if(gender.equals("B")){
            System.out.println("The suggested baby name is "+dads.substring(0,dads.length()/2)+moms.substring(moms.length()/2));
        }else if (gender.equals("G")){
            System.out.println("The suggested baby name is " +moms.substring(0,moms.length()/2)+dads.substring(dads.length()/2));
        }
    }
}
