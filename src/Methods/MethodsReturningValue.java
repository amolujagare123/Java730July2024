package Methods;

import basic.DemoClass;

public class MethodsReturningValue {

    int methodName1()
    {
        int a = 12;
        return a;
    }

    double methodName2()
    {
        double d = 12.44;
        return d;
    }

    String methodName3()
    {
        String st = "amol";
        return st;
    }
    String reverseString(String str)
    {
        String reversedString = "";

        for (int i=(str.length()-1);i>=0;i--)
        {
            reversedString = reversedString + str.charAt(i);
        }

        return reversedString;
    }


    public static void main(String[] args) {

        MethodsReturningValue ob = new MethodsReturningValue();

      //  When a method returns a value it actually
        //  holds the value that it  returns.

        int x ;
        x = 10 ;
        int b = x;
        System.out.println(x);
        // if a variable holds a value it can
        // 1. assign itself to some other similar type of variable
        // 2. we can put is inside the  System.out.println to print its value
        // if the value is printable

        int y = ob.methodName1();
        System.out.println("y="+y);
        System.out.println("ob.methodName1()="+ob.methodName1());


        System.out.println(ob.methodName3());

        String myStr1 = "We are the world";

        String myStr2 = ob.reverseString(myStr1);

        System.out.println(myStr2);
    }
}
