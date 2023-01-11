package class5;
import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        int quizScore= input.nextInt();
        System.out.println("Please enter your mid-term score");
        int midTerm= input.nextInt();
        System.out.println("Please enter your final score");
        int finalScore= input.nextInt();

        int averageScore=(quizScore+midTerm+finalScore)/3;

        if(averageScore>=90){
            System.out.println("Your grade is an A");
        }
        if(averageScore>=70&&averageScore<90){
            System.out.println("Your grade is a B");
        }
        if(averageScore>=50&&averageScore<70){
            System.out.println("Your grade is a C");
        }
        if(averageScore<50){
            System.out.println("Your grade is a F");
        }

    }
}
