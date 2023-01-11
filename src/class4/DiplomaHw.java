package class4;

public class DiplomaHw {
    public static void main(String[] args) {
        boolean diploma=true;
        double gpa=3.4;
        if(diploma){
            System.out.println("Congratulations");
            if(gpa>=3.5){
                System.out.println("You are eligible for a scholarship");
            }else{
                System.out.println("You should have studied harder");
            }
        }else{
            System.out.println("You should get a degree");
        }

    }
}
