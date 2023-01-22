package class12;

public class StringDemo8ImportantForInterviews {
    public static void main(String[] args) {
        String str="Java is love";
        char c=str.charAt(2);///Like an array (0) is the first letter (1) is the second....
        System.out.println(c);
        int sumA=0;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if(str.charAt(i)=='a'){
                sumA++;
            }

        }
        System.out.println(sumA);
    }
}
