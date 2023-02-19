package class28;


import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {


        Integer integer = new Integer(10);//this is boxing
        int number = integer;//auto-unboxing
        //wrapper is being unwrapped and converted into a primitive.
        int number2 = integer.intValue();//manual unboxing which is not needed anymore

        double d = 12.3;
        Double wrapperD = new Double(d);//manual boxing

        Double wrapperB = 12.5;
        Double wrapperP = d;//auto-boxing

        Float f = 12.4f;
        ArrayList<Double> arrayList1 = new ArrayList<>();
        arrayList1.add(12.5);


    }
}
