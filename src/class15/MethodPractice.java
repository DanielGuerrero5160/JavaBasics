package class15;

public class MethodPractice {
//create a method which returns true or false and takes the int number as a parameter
    //if number is even, it returns true, otherwise, it returns false

    boolean trueFalse(int a){
       boolean flag;
        if  (a%2==0){
            flag=true;
        }else{
            flag= false;
        }
        return flag;
    }
    boolean trueFalse1(int a){
        if  (a%2==0){
             return true;
        }else{
         return false;
        }

    }
    boolean isEven2(int number){
        return number%2==0;
    }

}
