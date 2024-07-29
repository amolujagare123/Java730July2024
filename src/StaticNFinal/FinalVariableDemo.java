package StaticNFinal;

public class FinalVariableDemo {

   final int speed = 100;

    void change()
    {
     //   speed = 200;
    }

    public static void main(String[] args) {
        FinalVariableDemo ob = new FinalVariableDemo();
       // ob.change();
    //    ob.speed = 300;
        System.out.println(ob.speed);
    }
}
