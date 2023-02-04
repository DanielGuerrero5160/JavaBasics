package class18;

public class Task1 {

   private Task1(){
        System.out.println("Constructor without parameters");
    }
    Task1(String name){
        System.out.println("Constructor with a String parameter");
    }
   protected Task1(int num){
        System.out.println("Constructor with an int parameter");
    }
  public  Task1(char c){
        System.out.println("Constructor with an char int parameter");
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        Task1 task2=new Task1("Java");
        Task1 task3=new Task1(1000);
        Task1 task4=new Task1('G');
    }
}
