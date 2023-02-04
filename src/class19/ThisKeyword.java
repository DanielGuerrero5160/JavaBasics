package class19;

public class ThisKeyword {
    int a,b;

    ThisKeyword(int a,int b){
        this.a=a;//refers to the current instance variables
        this.b=b;//we do not need to write this as it will happen in the compiler automatically
    }

    public void sum(int a,int b){
        System.out.println("Sum of local variables is "+(a+b));
        System.out.println("Sum of instance variables is "+(this.a+this.b));
    }
    void hello(){
        System.out.println("Hello batch 15");
    }
    void howAreYou(){
        System.out.println("How are you batch 15");
    }
    void greetings(){
     this.hello();//this keyword refers to the instance methods
     this.howAreYou();
    }
    public static void main(String[] args) {
        ThisKeyword tk=new ThisKeyword(12,2);
        System.out.println(tk.a);
        tk.sum(100,200);
        System.out.println("*************");

        tk.greetings();

    }
}
