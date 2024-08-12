package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveDemo {

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

  //      al.remove("sakshi");
        al.remove(3);

        System.out.println("al="+al);


    }
}
