package class6;
import java.util.Scanner;
public class LogicalOrDemo {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Please enter a day");
        String day= input.next();
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("No class");
        }else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Java class");
        }else if(day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Tuesday")){
            System.out.println("Manual testing");
        }else if(day.equalsIgnoreCase("Thursday")){
            System.out.println("Review");
        }else{
            System.out.println("Wrong day entered");
        }
        input.close();

    }
}
