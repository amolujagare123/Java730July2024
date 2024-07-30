package AbstractionDemo;

public interface AnotherInterface {

    void call();
    void display();

    default void method1()
    {
        System.out.println("method1");
    }

    private void method2()
    {
        System.out.println("method2");
    }

    static void method3()
    {
        System.out.println("method3");
    }

}

class ChildInterface implements AnotherInterface
{
    public void call()
    {
        System.out.println("call");
    }

    public void display()
    {
        System.out.println("display");
    }

    public static void main(String[] args) {

        AnotherInterface ob = new ChildInterface();
        ob.call();
        ob.display();
    }

}
