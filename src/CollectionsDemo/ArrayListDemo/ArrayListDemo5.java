package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo5 {

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

        System.out.println("al2="+al2);

        al2.addAll(al);
        System.out.println("al2="+al2);

    }
}
