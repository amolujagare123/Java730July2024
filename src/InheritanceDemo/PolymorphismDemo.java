package InheritanceDemo;

public class PolymorphismDemo {

    int a;
    int b;

    void addition()
    {
        int c = a + b;
        System.out.println("c="+c);
    }

    void addition(int x)
    {
        int c = x + b;
        System.out.println("c="+c);
    }
    void addition(int x , int y)
    {
        int c = x + y;
        System.out.println("c="+c);
    }

    void addition(int x , int y , int z)
    {
        int c = x + y + z;
        System.out.println("c="+c);
    }

    void addition(double x , double y)
    {
        double c = x + y;
        System.out.println("c="+c);
    }

    void addition(String x , String y)
    {
        String c = x + y;
        System.out.println("c="+c);
    }

    public static void main(String[] args) {

        PolymorphismDemo ob = new PolymorphismDemo();
        ob.a = 12;
        ob.b = 89;
        ob.addition();
        ob.addition(12);
        ob.addition(12,12);
        ob.addition(12,12,12);
        ob.addition(12.34,12.34);
        ob.addition("MyString","STR");


    }

}
