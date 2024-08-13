package CollectionsDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("amol");
        v.add("sakshi");
        v.add("praveen");
        v.add("prasad");
        v.add("veena");
        v.add("ashwini");

        System.out.println(v);

        System.out.println("using Iterator");

        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("using Enumeration");

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

    }
}
