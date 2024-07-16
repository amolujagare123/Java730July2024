package Arrays.SingleD;

public class IntArrayDemo1 {
    public static void main(String[] args) {

        int[] a= new int[5];

        a[0] = 12;
        a[1] = 34;
        a[2] = 66;
        a[3] = 54;
        a[4] = 90;

       /* for(int i =0;i<5;i++)
          System.out.println(a[i]);*/

        for(int x : a)
            System.out.println(x);
    }
}
