package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];
        try {
            a[0] = 12;
            a[1] = 12;
            a[2] = 12;
            a[3] = 12;
            a[4] = 12;
            a[5] = 12;
        }
        catch (ArithmeticException e)
        {
            System.out.println("inside ArithmeticException");
          /*  System.out.println("inside catch");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();*/
        }
        catch (Error e)
        {
            System.out.println("inside Error");
          /*  System.out.println("inside catch");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();*/
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("inside IndexOutOfBoundsException");
        }
        catch (Exception e)
        {
            System.out.println("inside Exception");
          /*  System.out.println("inside catch");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();*/
        }

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("End of the program");

    }
}
