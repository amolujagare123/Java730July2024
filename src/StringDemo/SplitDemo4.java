package StringDemo;

public class SplitDemo4 {

    public static void main(String[] args) {

        String str = "Hey Baby you are so lovely";
        String[] stArr = str.split(" ");

        // print the words ending with 'y'

        for(int i=0; i<stArr.length;i++)
        {
            String temp = stArr[i]; // hey
           // int l = temp.length();

            if(temp.endsWith("y")) // check last character of the string
             System.out.println(stArr[i]);
        }


    }
}
