package ClaasesNConstructors.pack1;

public class Java1 {

   public int a;
   private double d;
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

        Java1 ob = new Java1();
        ob.a = 88;
        ob.d = 56.78;
        ob.c = 'h';
        ob.str = "Selenium";
        ob.display();

    }


}
