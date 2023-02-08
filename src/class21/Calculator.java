package class21;

public class Calculator {

    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    void add(int num1,int num2, int num3){//overloading by adding another parameter int num3
        System.out.println(num1+num2+num3);
    }
    void add(double num1,double num2, double num3){//overloading by changing datatype
        System.out.println(num1+num2+num3);
    }
    void add(double num2,int num1){//overloading by changing order/sequence
        System.out.println(num1+num2);
    }
    void add(int num1,double num2){//same as above, but different order
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        calc.add(1,6);
    }

}
