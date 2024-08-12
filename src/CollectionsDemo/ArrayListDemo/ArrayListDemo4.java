package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty()); // true

        al.add("amol");
        al.add("sakshi");
        al.add("praveen");
        al.add("prasad");
        al.add("veena");
        al.add("ashwini");
        al.add("ashwini");
      //  al.add(null);
        System.out.println(al.isEmpty()); // false
        System.out.println(al.size());

        System.out.println(al);

        System.out.println(al.get(4));

        System.out.println("========== using for loop ==========");

        for (int i=0;i<al.size();i++)
            System.out.println(al.get(i));

        System.out.println("========== using for each loop ==========");

        for(String str:al)
            System.out.println(str);

        Iterator itr = al.iterator();

        System.out.println("========== using Iterator Interface ==========");
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("Before Clear"+al);
        al.clear();
        System.out.println("After Clear"+al);


    }
}
