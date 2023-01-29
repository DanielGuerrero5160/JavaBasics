package class15;

public class MPractice3Tester {
    public static void main(String[] args) {


        MPractice3 mp3 = new MPractice3();
        int[] arr1 = {1, 2, 3, 4};
        int arrSum = mp3.sumArray(arr1);
        System.out.println(arrSum);

        int[] arr2={3,67,764,845};
        System.out.println(mp3.sumArray(arr2));
    }

}
