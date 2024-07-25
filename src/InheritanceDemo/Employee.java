package InheritanceDemo;

public class Employee {

    public int salary = 35000;

    void employeeWork()
    {
        System.out.println("Complete the tasks");
    }

}

class Programmer extends  Employee
{
    int bonus = 10000;

    void programmerWork()
    {
        System.out.println("Do coding");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("bonus="+p.bonus);
        p.programmerWork();


        Employee e = new Employee();
        e.salary =100000;
        e.employeeWork();

        System.out.println("bonus="+p.salary);
        p.employeeWork();

    }
}
