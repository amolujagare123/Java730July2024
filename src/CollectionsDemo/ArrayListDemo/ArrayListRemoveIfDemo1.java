package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo1 {

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

        // remove the elements those are divisible by 5
        // i - i%5 == 0
        // -> predicate symbol

        //al.removeIf(i -> ( i%5 == 0 ) );

        // remove the elements which are less than 30
        al.removeIf(i -> ( i < 30 ) );

        System.out.println("al="+al);


    }
}
