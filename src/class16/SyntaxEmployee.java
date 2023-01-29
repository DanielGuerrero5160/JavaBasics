package class16;

public class SyntaxEmployee {
    String empID;
    int salary;
    static String ceo="Sumair";//This variable will be same in each object, so we create it as static

    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID="123";
        emp1.salary=100000;


        System.out.println(emp1.empID);
        System.out.println(emp1.salary);
        System.out.println(SyntaxEmployee.ceo);

        System.out.println("*********");

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empID="345";
        emp2.salary=200000;


        System.out.println(emp2.empID);
        System.out.println(emp2.salary);
        System.out.println(emp2.ceo);
    }

}
