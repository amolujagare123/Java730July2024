package Arrays.TwoD;

public class TwoDCharArrayDemo3 {
    public static void main(String[] args) {

        char[][] ch = {
                {'h','h','h','z','6'},
                {'a','a','a',']','#'},
                {'b','b','b','!','@'},
        };



        int row = ch.length;
        int col = ch[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for (int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch[0].length;j++)
            {
                System.out.print(ch[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
