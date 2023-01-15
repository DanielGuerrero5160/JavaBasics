package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {
        double [] arr={10.5,12.0,45,10.5,23,10.5};
        int count=0;
        for (int i=0; i< arr.length;i++){
            if(arr[i]==10.5){
                count++;

            }

        }
        System.out.println("The number of times 10.5 appears in the array is "+count);
    }
}
