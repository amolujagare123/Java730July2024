package ClaasesNConstructors;

public class MyClass {

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

    public static void main(String[] args) {

        int x;
        x = 10;
        MyClass ob = new MyClass();
        ob.a = 88;
        ob.d = 56.78;
        ob.c = 'h';
        ob.str = "Selenium";
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 90;
        ob2.d = 11.22;
        ob2.c = 'e';
        ob2.str = "Text";
        ob2.display();

    }


}
