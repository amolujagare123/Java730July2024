package ClaasesNConstructors;

public class MyClass3 {

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

    void anotherFunction()
    {
        System.out.println("anotherFunction");
    }

    void addition()
    {
        double c = a + d;
        System.out.println("addition="+c);
    }

    // parameterized constructor with this operator
    MyClass3(int a,double d,char c,String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    public static void main(String[] args) {

        MyClass3 ob = new MyClass3(12,23.56,'g',"Amol");

        ob.display();

        ob.addition();


    }


}
