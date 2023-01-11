package class3;

public class TypeCasting {
    public static void main(String[] args) {
       long number=125l;
       byte shorterNumber=(byte) number;
       float f=10.5f;
       int num= (int) f; //.5 will be lost
        System.out.println(shorterNumber);
        System.out.println(num);

        /*byte
        short
        int
        long
        float
        double
        If we try to store the contents of a smaller box in a bigger box, Java does not complain
        because the content can easily fit in the larger box. If we go from larger to smaller,
        there is an error and we need to type cast to store the contents.
         */
        byte b=10;
        int number2=b; // no error here-smaller box(byte) to larger box (int) is ok.
        short c= (short) number2;
        System.out.println(b);

        float eggs=12.5f;
        int wholePart= (int)eggs;
        System.out.println(wholePart);


    }
}
