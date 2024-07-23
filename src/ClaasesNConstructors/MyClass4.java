package ClaasesNConstructors;

public class MyClass4 {

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

    // parameterized constructor
    MyClass4(int a1, double d1, char c1, String str1)
    {
        a = a1;
        d = d1;
        c = c1;
        str = str1;
    }

    public static void main(String[] args) {

        MyClass4 ob = new MyClass4(12,23.56,'g',"Amol");

        ob.display();

    }


}
