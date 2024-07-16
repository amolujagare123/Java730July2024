package Arrays.SingleD;

public class StringArrayDemo1 {
    public static void main(String[] args) {

        String[] stArr = new String[5];

        stArr[0] = "Aarav";
        stArr[1] = "Isha";
        stArr[2] = "Rahul";
        stArr[3] = "Ananya";
        stArr[4] = "Neha";

      /*  for(int i =0;i<5;i++)
          System.out.println(stArr[i]);*/

        for (String str : stArr)
            System.out.println(str);
    }
}
