package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("sakshi");
        al.add("praveen");
        al.add("prasad");
        al.add("veena");
        al.add("ashwini");
        al.add("ashwini");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();

        al2.add("text1");
        al2.add("praveen");
        al2.add("text2");
        al2.add("text3");
        al2.add("veena");
        al2.add("text4");
        al2.add("ashwini");

        System.out.println("al2="+al2);

        al2.removeAll(al);
        System.out.println("al2="+al2);

    }
}
