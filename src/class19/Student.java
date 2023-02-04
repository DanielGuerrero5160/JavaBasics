package class19;

public class Student {
    /*
    Write a Student class   that have instance variables name
    and address. Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;
    Student(String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        Student st=new Student("Daniel","123 5th Street");
        st.displayInfo();
    }

}
