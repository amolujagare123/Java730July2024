package StaticNFinal;

public class Student2 {
    int rno;
    String name;
    public static String college="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void staticDemo1()
    {
        System.out.println("staticDemo1");
        System.out.println("rno="+rno); // non-static - not allowed
        System.out.println("name="+name); // non-static - not allowed
        System.out.println("college="+college); // static - allowed
        staticDemo2(); // static - allowed
        nonStaticDemo1(); // non-static - not allowed
    }
    public static void staticDemo2()
    {
        System.out.println("staticDemo2");
    }

    void nonStaticDemo1()
    {
        System.out.println("nonStaticDemo1");
    }

    void nonStaticDemo2()
    {
        System.out.println("nonStaticDemo2");
        System.out.println("rno="+rno); // non-static -  allowed
        System.out.println("name="+name); // non-static -  allowed
        System.out.println("college="+college); // static - allowed
        staticDemo2(); // static - allowed
        nonStaticDemo1(); // non-static - allowed
    }


    public static void main(String[] args) {

        Student2 s = new Student2();

        s.staticDemo1();
        s.staticDemo2();

        Student2.staticDemo1();
        Student2.staticDemo2();

    }
}
