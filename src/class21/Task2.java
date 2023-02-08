package class21;

public class Task2 {
/*
Create 1 class with a static method that has
3 overloaded forms. Then call each overloaded
method with specific arguments and observe result.
 */
    static void printInfo(){
        System.out.println("This is a mthod with no parameters");
    }
    static void printInfo(String name){
        System.out.println("name is:"+name);
    }
    static void printInfo(int number){
        System.out.println("number is:"+number);
    }

    public static void main(String[] args) {
        Task2 t=new Task2();
        printInfo();
        printInfo("Daniel");
        printInfo(5);

    }
}
