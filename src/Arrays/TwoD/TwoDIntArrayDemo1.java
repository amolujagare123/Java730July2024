package Arrays.TwoD;

public class TwoDIntArrayDemo1 {
    public static void main(String[] args) {

        int[][] a = new int[4][3];

        a[0][0] = 12;
        a[0][1] = 13;
        a[0][2] = 14;

        a[1][0] = 22;
        a[1][1] = 23;
        a[1][2] = 24;

        a[2][0] = 28;
        a[2][1] = 29;
        a[2][2] = 27;

        a[3][0] = 28;
        a[3][1] = 29;
        a[3][2] = 27;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
