package basic;

public class DemoClass {

    public  int a;
    public  double d;
    public  char c;
    public  String str;

    public  void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int x;
        x = 10;
        DemoClass ob = new DemoClass();
        ob.a = 88;
        ob.d = 56.78;
        ob.c = 'h';
        ob.str = "Selenium";
        ob.display();

        DemoClass ob2 = new DemoClass();
        ob2.a = 90;
        ob2.d = 11.22;
        ob2.c = 'e';
        ob2.str = "Text";
        ob2.display();

    }


}
