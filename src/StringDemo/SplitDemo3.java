package StringDemo;

public class SplitDemo3 {

    public static void main(String[] args) {

        String str = "Hey Baby you are so lovely";
        String[] stArr = str.split(" ");

        // print the words ending with 'y'

        for(int i=0; i<stArr.length;i++)
        {
            System.out.println(stArr[i]);
        }


    }
}
