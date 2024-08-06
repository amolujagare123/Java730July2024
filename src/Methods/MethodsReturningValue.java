package Methods;

import basic.DemoClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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


    public String convertDate(String dateStr) throws ParseException // dd/MM/yyyy
    {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sd.parse(dateStr);

        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd");
        String dateStrNew = sd2.format(date);

        return dateStrNew;
    }

    double[] getMyDoubleArray(int l)
    {
          double[] d = new double[l];

          for (int i=0;i<d.length;i++)
          {
              d[i] =  Math.random()*100;
          }

          return d;
    }

    int[] getMyIntArray(int l)
    {
        int[] d = new int[l];

        for (int i=0;i<d.length;i++)
        {
            d[i] = (int) (Math.random()*100);
        }

        return d;
    }

    String[][] getMyStringArray()
    {
        String[][] indianNames = {
                {"Aarav", "Vihaan", "Aditya", "Krishna", "Sai"},
                {"Ananya", "Isha", "Tanvi", "Riya", "Diya"},
                {"Arjun", "Ishaan", "Kabir", "Rohan", "Karan"},
                {"Sanya", "Pooja", "Maya", "Sneha", "Nidhi"}
        };

        return indianNames;
    }


    public static void main(String[] args) throws ParseException {

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


        String myDateStr = ob.convertDate("06/08/2024");

        System.out.println("myDateStr="+myDateStr);

       // create a random double array of size 10 & print

        double[] myDouble = ob.getMyDoubleArray(5);
        for (int i=0;i<myDouble.length;i++)
        {
            System.out.print(myDouble[i]+"\t");
        }
        System.out.println("\n==================");

        int[] myInt = ob.getMyIntArray(10);

        for (int i=0;i<myInt.length;i++)
        {
            System.out.print(myInt[i]+"\t");
        }
        System.out.println("\n==================");

        String[][] myStr = ob.getMyStringArray();

        for (int i=0;i<myStr.length;i++)
        {
            for (int j=0;j<myStr[0].length;j++) {
                System.out.print(myStr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n==================");
    }
}
