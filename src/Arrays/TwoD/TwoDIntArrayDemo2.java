package Arrays.TwoD;

public class TwoDIntArrayDemo2 {
    public static void main(String[] args) {

        int[][] a = {
                {11,22,33},
                {23,45,67},
                {76,65,43},
                {80,70,60},
        };



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
