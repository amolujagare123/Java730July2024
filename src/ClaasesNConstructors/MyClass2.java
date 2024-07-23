package ClaasesNConstructors;

public class MyClass2 {

    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

   /* MyClass2()
    {

    }*/

   MyClass2()
    {
        a = 20;
        d = 11.45;
        c = 'a';
        str = "JAVA";
    }

    public static void main(String[] args) {

        MyClass2 ob = new MyClass2();

        ob.display();

        ob.a = 88;
        ob.d = 56.78;
        ob.c = 'h';
        ob.str = "Selenium";

        ob.display();

    }


}
