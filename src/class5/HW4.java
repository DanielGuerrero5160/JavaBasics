package class5;
import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month= input.nextLine();

      switch(month){
          case "June":
          case "July":
          case "August":
              System.out.println("You were born in the Summer");
              break;
          case "November":
          case "September":
          case "October":
              System.out.println("You were born in the Fall");
              break;
          case "December":
          case "January":
          case "February":
              System.out.println("You were born in the winter");
              break;
          case "March":
          case "April":
          case "May":
              System.out.println("You were born in Spring");
              break;
          default:
              System.out.println("Invalid entry");

      }


    }
}
