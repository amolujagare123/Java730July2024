package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo3 {

    public static void main(String[] args) {

        ArrayList<Character> al = new ArrayList<>();

        al.add('a');
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');
        al.add('f');
        al.add('g');
        al.add('h');
        al.add('i');
        al.add('j');
        al.add('k');
        al.add('l');
        al.add('m');
        al.add('n');
        al.add('o');
        al.add('p');


        System.out.println("al="+al);

        // remove all the vowels in the list - a,e,i,o,u

        al.removeIf(ch -> ( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'   ) );

        System.out.println("al="+al);


    }
}
