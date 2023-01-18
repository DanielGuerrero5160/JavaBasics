package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        int[] arr={10,13,20,25,45,50};
        /*
        for(int x: arr) {
            if (x%2!=0) {
                System.out.println(x);
            }
        }


         */
    for(int i=0; i< arr.length;i++) {
        if (arr[i] % 2 != 0) {
            arr[i] = 0;
        }
        System.out.println(arr[i]);
    }



        }
    }

