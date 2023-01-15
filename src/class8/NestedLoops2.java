package class8;

public class NestedLoops2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 5; j++){
                if(j==1||j==2){
                    continue;///skipping inner loop iterations
                }
                System.out.print("* ");//prints 5 stars in one line
            }
            System.out.println();//created a new line for the next iteration of outder loop
        }
    }
}
