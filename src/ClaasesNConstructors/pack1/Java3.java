package ClaasesNConstructors.pack1;

public class Java3 extends Java1{



    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a = 88;
        ob.c = 'j';
        ob.d = 56.78;
        ob.c = 'h';
        ob.str = "Selenium";
        ob.display();

        Java3 j3 = new Java3();
        j3.a = 89; // public
        j3.c = 'h'; // protected
        j3.d = 56.78; // private
        j3.str = "Selenium";
        j3.display();

    }


}
