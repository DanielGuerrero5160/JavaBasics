package class27;

public class BoxingDemo {
    //converting a primitive data type int a wrapper object is boxing
    public static void main(String[] args) {
        int number=15;
        printData(number);//automatically converting primitive int into wrapper Integer

        Integer f=10;//autoboxing going from primitive to wrapper
        int number2=f;//auto-unboxing -going from wrapper to primitive
    }

    public static void printData(Integer number){
        System.out.println(number);
    }
}
