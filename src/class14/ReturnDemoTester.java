package class14;

public class ReturnDemoTester {
    public static void main(String[] args) {
ReturnDemo rd=new ReturnDemo();
String str= rd.method1();
        System.out.println(str);
        int result=rd.method2();//The method we are
        // calling an int, so we are declaring
        // an int which is that methods return.
        System.out.println(result);
    }
}
