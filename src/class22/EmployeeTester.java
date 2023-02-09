package class22;

public class EmployeeTester {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.printSalary();
        manager.printHolidays();
        QA qa = new QA();
        qa.printHolidays();
        qa.printSalary();
        OfficeBoy ob=new OfficeBoy();
        ob.printSalary();
        ob.printHolidays();
    }
}
