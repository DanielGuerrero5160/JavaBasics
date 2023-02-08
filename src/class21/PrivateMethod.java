package class21;

public class PrivateMethod {
    /*
    Create 1 class with a private method that has
    3 overloaded forms. Then call each overloaded

    method with specific arguments and observe result.
     */
    private void printStuff(){
        System.out.println("This is a private method with no parameters");
    }
    private void printStuff(String greeting){
        System.out.println("Greeting is "+greeting);
    }
    private void printStuff(String greeting,String goodbye){
        System.out.println(greeting+" "+goodbye);
    }

    public static void main(String[] args) {
        PrivateMethod pm=new PrivateMethod();
        pm.printStuff();
        pm.printStuff("Howdy");
        pm.printStuff("Hello","Goodbye");
    }
}
