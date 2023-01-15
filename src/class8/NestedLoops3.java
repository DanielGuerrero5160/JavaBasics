package class8;

public class NestedLoops3 {
    public static void main(String[] args) {
        //print a rectangular box

        for(int i=0; i<4; i++){

            if(i==1||i==2){
                System.out.println("*   *");
             continue;
            }

            for(int j=0; j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
