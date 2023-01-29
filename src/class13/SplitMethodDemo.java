package class13;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str="I like java. I write a lot of code daily. I am from Batch 15";
        String[] StrArr=str.split("[.?!]");
        System.out.println(StrArr.length);
        System.out.println(StrArr[2].trim());//the .trim takes out the space, because the
        // split makes the split after punctuation and before the next sentence, there is a space.
    }
}
