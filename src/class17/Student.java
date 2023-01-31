package class17;

public class Student {
    String name;
    int age;
    double weight;
    String id;

    public Student(String sName,String sId, int sAge){
        name=sName;
        id=sId;
        age=sAge;
    }

   public Student(String sName, int sAge, double sWeight,String sId){//we can use access modifiers for constructors
        name=sName;
        age=sAge;
        weight=sWeight;
        id=sId;

    }
    void printInfo(){
        System.out.println("name "+name+" age "+age+" weight "+weight+" ID "+id);
    }

    public static void main(String[] args) {
        Student student1=new Student("Daniel",25,125,"abc123");
        Student student2=new Student("Saud",25,190,"abc123457633");
        Student student3=new Student("Dominic",25,200,"abc1212263673");
        Student student4=new Student("Sam",25,220,"abc13463");
        Student student5=new Student("Zafar",35,149,"abc126");

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
        student4.printInfo();
        student5.printInfo();

        System.out.println("*************");

        Student student6=new Student("ssnflskdng","askjnldfs",55);
        student6.printInfo();
    }
}
