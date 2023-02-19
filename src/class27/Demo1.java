package class27;

public class Demo1 {
    public static void main(String[] args) {
        String name="Zafar";
        String name2="Aiperi";
        String name3="Sarah";

        String[] names={"Hiral", "Nima","Laura","Nat"};

        displayNames(names);
        printNames(name,name2,name3);
    }
    public static void displayNames(String[] names){
        for(String x:names){
            System.out.println(x);
        }

    }
    public static void printNames(String n,String n2,String n3){
        System.out.println(n+" "+n2+" "+n3);
    }

}
