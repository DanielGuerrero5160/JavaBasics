package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {

int sum=0;
        int[] nums = {10, 20, 30, 45, 50};
        for (int i = 0; i< nums.length;i++){//we start at 0 because the first index of arrays is always 0
            System.out.println(nums[i]);
            sum=sum+nums[i];
        }
        System.out.println("The sume of the numbers in the array is "+sum);
    }
}
