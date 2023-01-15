package class9;

public class ArraysDemo5Tasks {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;
        int sumEvenIndex=0;
        int sumOddIndex=0;
        for(int i=0; i< numbers.length;i++){
            if(i%2==0){
                sumEvenIndex+=numbers[i];
            }else{
              sumOddIndex+=numbers[i];
            }

        }
        System.out.println(sumEvenIndex);
        System.out.println(sumOddIndex);
        System.out.println("************");

    int[] numbers1={10,20,30,4,5,6,7,80};
   int sumEven=0;
    for(int i=0;i< numbers1.length;i++){
        if(numbers1[i]%2==0){
            sumEven+=numbers1[i];
        }
    }
        System.out.println(sumEven);
    }
}

