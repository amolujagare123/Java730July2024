package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(45);
        al.add(15);
        al.add(43);
        al.add(65);
        al.add(48);
        al.add(35);
        al.add(85);


        System.out.println("al="+al);

  //      al.remove("sakshi");


      //  Integer ii = new Integer(48);

      //  al.remove(ii);
        al.remove(new Integer(35));

        System.out.println("al="+al);


    }
}
