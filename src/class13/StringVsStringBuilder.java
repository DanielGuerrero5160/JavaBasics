package class13;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            str.append(i);
            //string builder is faster but it saves 1000 different memory boxes

        }
        String str1="";
        for (int i = 0; i < 1000; i++) {
            str1 = str1 + i;
            //String is slower because it checks to see that string already
            // exists and if it is a duplicate, it will save in the same box.
        }
    }
}
