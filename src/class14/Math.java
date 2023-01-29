package class14;

public class Math {
    void addition(int num1, int num2){
        System.out.println(num1+num2);
    }
    void subtract(int num1,int num2){
        System.out.println(num1-num2);
    }
    void mul(int num1,int num2, int num3){
        System.out.println(num1*num2*num3);
    }
    //Methods with void keyword can execute some code,
    //but it will not be able to return a value
//below we are declaring a return type of int
    int sub(int num1, int num2){//The int in this line tells java what value to return
        return num1-num2;
        //we can call this method by typing object.sub(number, number); and it will pass on that value

    }
}
