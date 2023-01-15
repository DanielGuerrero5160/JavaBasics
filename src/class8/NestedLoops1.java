package class8;

public class NestedLoops1 {
    public static void main(String[] args) {

        for(int i=0; i<5;i++){//outer for loop - Determines hpw many times to execute inner loop

            for(int j=0; j<5;j++){///called an inner for loop
                System.out.println("i= "+i+" j= "+j);
            }
            System.out.println("**********");
        }
    }
}
