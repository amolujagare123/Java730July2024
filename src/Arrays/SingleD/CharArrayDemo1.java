package Arrays.SingleD;

public class CharArrayDemo1 {
    public static void main(String[] args) {

        char[] ch = new char[5];

        ch[0] = 't';
        ch[1] = 'y';
        ch[2] = 'u';
        ch[3] = 'i';
        ch[4] = 'o';

     /*   for(int i =0;i<5;i++)
          System.out.println(ch[i]);*/

        for(char z : ch)
            System.out.println(z);
    }
}
