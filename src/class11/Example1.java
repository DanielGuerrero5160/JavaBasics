package class11;

public class Example1 {
    public static void main(String[] args) {
        int[][] numbers={{10,20,30},
                {45,55,66,},
                {30,40,20,10,25},
        };
        //numbers.length tells us how many 1D arrays are present in 2D array
        for(int i=0;i<numbers.length;i++){
            //numbers[i].length - Gives the size/length of 1D array
            for(int j=0;j< numbers[i].length;j++){
                if(numbers[i][j]%2!=0){
                    System.out.print(numbers[i][j] + " ");
                }
            }
            System.out.println();
        }
        //foreach loop to print all the numbers from a 2D array
        for(int[] arr:numbers){
           for(int n:arr){
               System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
