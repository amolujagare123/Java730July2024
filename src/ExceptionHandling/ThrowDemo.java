package ExceptionHandling;

public class ThrowDemo {

    void checkNumber(int i)
    {
        if(i<=10 && i>=1)
            System.out.println("We are safe");
        else
            throw new ArithmeticException("we are in danger");
    }

    public static void main(String[] args) {

        int a = 18;
        System.out.println("a="+a);
        System.out.println("checking number");

        ThrowDemo ob = new ThrowDemo();

        ob.checkNumber(a);


        System.out.println("a="+a);
        System.out.println("end of the program");
    }
}
