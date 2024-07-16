package Arrays.SingleD;

public class DoubleArrayDemo1 {
    public static void main(String[] args) {

        double[] d = new double[5];

        d[0] = 12.45;
        d[1] = 34.67;
        d[2] = 66.78;
        d[3] = 54.13;
        d[4] = 90.34;

        /*for(int i =0;i<5;i++)
          System.out.println(d[i]);*/
        for (double y : d )
            System.out.println(y);
    }
}
