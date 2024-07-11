package loops;

public class FibonacciDemo {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        int n = 7;

        System.out.print(a+" "+b);

        for(int i=n-2; i>=1; i--)
        {
            sum = a + b ;
            System.out.print(" "+sum);
            a = b;
            b = sum ;
        }

    }
}
