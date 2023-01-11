package class6;

public class HW1 {
    public static void main(String[] args) {
        boolean workday=true;
        int day=1;
        while(workday) {
            if (day<6) {
                System.out.println("I need a day off");
            } else {
                workday=false;
                System.out.println("I do not need a day off anymore");

            }
            day++;
        }
    }
}
