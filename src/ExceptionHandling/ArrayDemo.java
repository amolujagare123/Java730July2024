package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 12;
        a[1] = 12;
        a[2] = 12;
        a[3] = 12;
        a[4] = 12;
        a[5] = 12;

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("End of the program");

    }
}
