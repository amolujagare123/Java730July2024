package CollectionsDemo.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();
        ts.add("pooja");
        ts.add("amol");
        ts.add("pradeep");
        ts.add("praveen");

       // ts.add(12);
       // ts.add(null);
        System.out.println(ts.add("pooja"));

        System.out.println(ts);
    }
}
