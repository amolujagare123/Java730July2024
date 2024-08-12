package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo2 {

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

        // remove the elements whose length <= 5
        // remove the elements  having 's' in the text
        al.removeIf(str -> ( str.length() <= 5 ) );


      //  al.removeIf(str -> ( str.contains("s") ) );

        System.out.println("al="+al);


    }
}
