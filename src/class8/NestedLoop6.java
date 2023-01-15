package class8;

public class NestedLoop6 {
    public static void main(String[] args) {
        /*0 1 2 3 4 5
0 2 4 6 8 10
0 3 6 9 12 15 */
       /* for(int i=1;i<4; i++){
            for(int j=0;j<=i*5;j=j+i){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
        for(int i=1;i<4; i++){
            for(int j=0;j<=5;j++){
                System.out.print(j*i+" ");
            }
            System.out.println();
        }
    }
}
