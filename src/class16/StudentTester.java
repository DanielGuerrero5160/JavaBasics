package class16;

public class StudentTester {
    public static void main(String[] args) {
      Student student=new Student();
      student.name="Zafar";
      student.id="123";
      student.schoolName="Syntax";//this is a static variable in the Student class
      //because we assigned a value to this static variable,
      //we do not need to assign a value for the other objects
      //since it is a static variable
      student.age=22;
      student.weight=70;

      Student student1=new Student();
      student1.name="Daniel";
      student1.id="456";
      student1.age=5;
    //  student1.schoolName="Syntax";//static variable as it is the same for all objects
      student1.weight=75;

        Student student2=new Student();
        student2.name="Saud";
        student2.id="789";
        student2.age=22;
       // student2.schoolName="Syntax";
        student2.weight=25;
      System.out.println(student2.schoolName);//because schoolName is static in the
      // Student class, we can still call it
      System.out.println(student2.name);//name is not static in the class
      //so we cannot call it
      System.out.println(Student.schoolName);//we can just access the static
      // variables using the class name
    }
}
