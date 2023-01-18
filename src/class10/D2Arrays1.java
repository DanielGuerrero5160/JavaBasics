package class10;

public class D2Arrays1 {
    public static void main(String[] args) {
        int[][] nums={{10,20,30},
                      {55,22,45},
                      {100,220,450},
        };
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
