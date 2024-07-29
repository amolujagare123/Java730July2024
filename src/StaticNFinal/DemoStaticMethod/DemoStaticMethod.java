package StaticNFinal.DemoStaticMethod;


import StaticNFinal.Student2;


/*import static StaticNFinal.Student2.staticDemo1;
import static StaticNFinal.Student2.staticDemo2;
import static StaticNFinal.Student2.college;*/

import static StaticNFinal.Student2.*;

public class DemoStaticMethod {

    public static void main(String[] args) {

       /* Student2 ob = new Student2();
        ob.staticDemo1();*/

        staticDemo1();
        staticDemo2();
        college = "";
    }
}
