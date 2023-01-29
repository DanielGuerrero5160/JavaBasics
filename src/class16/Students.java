package class16;

public class Students {
    String name;
    String ID;
   static int numOfStudents=0;

    public static void main(String[] args) {
        Students st1=new Students();
        st1.ID="123";
        st1.name="Daniel";
        numOfStudents++;
        System.out.println(Students.numOfStudents);

        System.out.println("******");

        Students st2=new Students();
        st2.ID="1234";
        st2.name="Zafar";
        numOfStudents++;
        System.out.println(Students.numOfStudents);



    }

}
