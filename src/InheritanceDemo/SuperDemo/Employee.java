package InheritanceDemo.SuperDemo;

public class Employee {

  /*  Employee()
    {
        System.out.println("Employee constructor");
    }*/

    Employee(int empID)
    {

        System.out.println("empID="+empID);
        System.out.println("Employee constructor");
    }

    public int salary = 35000;

    int bonus = 2500;

    void employeeWork() {
        System.out.println("Complete the tasks");
    }

    void calculateSalary() {
        int month = 30;
        salary = 1100 * 30; // 33000
        System.out.println("Employee Salary=" + salary);
    }

}

class Programmer extends  Employee
{
    int bonus = 10000;


    Programmer()
    {
        super(123);
        System.out.println("Programmers constructor");

    }

    void programmerWork()
    {
        System.out.println("Do coding");
    }

    void calculateSalary()
    {
        int month = 30;
        salary = 1800 * 30; // 54000
        System.out.println("Programmer Salary="+salary);
    }

    void sampleMethod()
    {
        System.out.println("bonus="+super.bonus);
        System.out.println("salary="+salary);
        programmerWork();
        employeeWork();
        super.calculateSalary(); //
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
       /* System.out.println("bonus="+p.bonus);
        p.programmerWork();

        p.sampleMethod();
*/

      /*  Employee e = new Employee();
        e.salary =100000;
        e.employeeWork();

        System.out.println("bonus="+p.salary);
        p.employeeWork();*/



    }
}
