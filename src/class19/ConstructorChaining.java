package class19;

public class ConstructorChaining {

    ConstructorChaining(){
        System.out.println("I am a non argument constructor");
    }
    ConstructorChaining(String str){
        this();//making a call to non-argument constructor
        //this() always must be on the first line of the new constructor
        System.out.println(str);
    }
    ConstructorChaining(String str,int number){
       this(str);//making a call to string constructor
        System.out.println("This is constructor with int parameter "+number);
    }

    public static void main(String[] args) {
        ConstructorChaining obj=new ConstructorChaining("Hello",10);

        System.out.println("--------END OF CODE________");
    }
}
