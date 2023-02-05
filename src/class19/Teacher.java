package class19;

public class Teacher {
   public String name;
    public int teacherId;
    public String subject;

    Teacher(String name,int teacherId){
        this.name=name;
        this.teacherId=teacherId;
    }
    Teacher(String name,int teacherId,String subject){
        this(name, teacherId);
        this.subject=subject;
    }
}
