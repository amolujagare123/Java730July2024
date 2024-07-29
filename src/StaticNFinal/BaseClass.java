package StaticNFinal;

public final class BaseClass {

    final void demoMethod()
    {
        System.out.println("BaseClass demoMethod");
    }

}

class ChildClass // extends BaseClass
{
 //   @Override
    void demoMethod()
    {
        System.out.println("ChildClass demoMethod");
    }

    public static void main(String[] args) {

     /*   BaseClass b = new ChildClass(); // upcasting
        b.demoMethod();*/
    }

}
