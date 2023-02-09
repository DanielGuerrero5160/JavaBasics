package class22;

public class Employee {
    String name;
   static int baseSalary=30000;
   static int baseHolidays=10;

    void printSalary(){
        System.out.println("Salary is:"+baseSalary);
    }
    void printHolidays(){
        System.out.println("Number if holidays is:"+baseHolidays);
    }
}
class OfficeBoy extends Employee{

}
class Manager extends Employee{
    void printSalary(){
        System.out.println("Salary is:"+(baseSalary*4)+200000);
    }
}
class Developer extends Employee{

    void printSalary(){
        System.out.println("Salary is:"+(baseSalary*4)+25000);
    }
}
class QA extends Employee{
    void printSalary(){
        System.out.println("Salary is:"+baseSalary+4005968);
    }
    void printHolidays(){
        System.out.println("Number if holidays is:"+(baseHolidays+5));
    }

}
