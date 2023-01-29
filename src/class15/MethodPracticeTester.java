package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {
      MethodPractice test=new MethodPractice();
       boolean answer=test.trueFalse(6);
        System.out.println(answer);

boolean result= test.isEven2(15);
        System.out.println(result);
        System.out.println("***************");

   boolean result100= test.isEven2(100);
        System.out.println(result100);
        boolean result12= test.isEven2(12);
        System.out.println(result12);
        boolean result20= test.isEven2(20);
        System.out.println(result20);


    }
}
