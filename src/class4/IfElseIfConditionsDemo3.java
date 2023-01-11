package class4;

public class IfElseIfConditionsDemo3 {
    public static void main(String[] args) {
        int day=4;

        if(day==1){
            System.out.println("Monday");//if block of code
        }else if(day==2){
            System.out.println("Tuesday");//else block of code
        }else if (day==3){
            System.out.println("Wednesday");
        }else if (day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6) {
            System.out.println("Saturday");
        }else if(day==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Please enter a day 1-7");
        }
    }
}
