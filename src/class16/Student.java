package class16;

public class Student {
    String name;
   static String schoolName; // only one memory
    // location is shared for all objects
    //if we want to share something across all
    // object and the value will stay the same across all objects,
    // we should reserve only one memory location with static
    String id;
    int age;
    double weight;

    void printName(){
        System.out.println(name);
        System.out.println(schoolName);
    }
    static void printStudentInfo(){
       // System.out.println(name);//we cannot print this as name it is not static
        System.out.println(schoolName);
    }

}
