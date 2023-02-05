package class20;

public class Parent {
    String name;
    static String lastName;

    Parent(){
        System.out.println("I am a parent class constructor");
    }

    public static void main(String[] args) {
        Parent parent=new Parent();

    }
    public void hello(){
        System.out.println("Public method Hello from parent class");
    }

    protected static void bye(){
        System.out.println("Protected method bye from parent class");
    }
    private void money(){
        System.out.println("Private method money from parent class");
    }
}
