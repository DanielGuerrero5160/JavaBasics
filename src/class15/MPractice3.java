package class15;

public class MPractice3 {
    /*
    Create a method that takes an array of ints sums all the elements from the array,
    and returns sum
     */
    int sumArray(int [] input){
        int sum=0;
        for (int i = 0; i < input.length; i++) {
            sum+=input[i];
        }
        return sum;
    }
}
