package AbstractionDemo;

public interface InterfaceDemo {

    void call();
    void display();

    static void method1()
    {
        System.out.println("1st interface");
    }

    default void method2()
    {
        System.out.println("1st interface - 2");
    }
}

interface Interface2
{
    default void method2()
    {
        System.out.println("2nd interface - 2");
    }
    static void method1()
    {
        System.out.println("2nd interface");
    }
    void start();
    void display();
}

class ChildInterface2 implements InterfaceDemo,Interface2
{

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void call() {
        System.out.println("call");
    }

    @Override
    public void display() {
        System.out.println("display");
    }

    @Override
    public void method2() {
     //   System.out.println("child method");
        Interface2.super.method2();
    }

    public static void main(String[] args) {
        InterfaceDemo ob1 = new ChildInterface2();
        ob1.display();
        InterfaceDemo.method1();

        Interface2 ob2 = new ChildInterface2();
        ob2.display();
        Interface2.method1();
        ob2.method2();
    }
}
