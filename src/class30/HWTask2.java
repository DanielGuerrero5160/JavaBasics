package class30;

import java.util.HashSet;
import java.util.Set;

public class HWTask2 {
    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the insertion order.
        Each student object should have name and studentID.
        Display name of each student.
         */
        Set<Student> students=new HashSet<>();//acheiving polymorphism with the set in the
        // general Set interface. This helps us if we want to change the set type alter
        students.add(new Student("Daniel","12344444"));
        students.add(new Student("Julia","7773454"));
        students.add(new Student("Jimmy","345434"));
        students.add(new Student("Saud","23e344"));

        for(Student s:students){
            System.out.println(s.getName());
            System.out.println(s.getId());

        }

    }

}
class Student{
    private String name;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }



    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
}