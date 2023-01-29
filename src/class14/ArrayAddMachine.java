package class14;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int[] array2={10,10,10,20,30};
        addArrayElementsMachine(array2);
        int [] array3={234,34542,745,35,6,7,2,};
        addArrayElementsMachine(array3);
    }
    static void addArrayElementsMachine(int [] arr){
        int sum=0;
        for (int numbers:arr) {
            sum+=numbers;
        }
        System.out.println(sum);
    }

}
