package class5;
import java.util.Scanner;
public class HW7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country= input.next();
        System.out.println(country.toLowerCase());

        switch(country.toLowerCase()){
            case "mexico":
                System.out.println("Spanish");
                break;
            case "china":
                System.out.println("Mandarin");
                break;
            case "france":
                System.out.println("French");
                break;
            case "japan":
                System.out.println("Japanese");
                break;
            case "usa":
                System.out.println("english");
                break;
            default:
                System.out.println("Country unable to be found");
        }

    }
}
