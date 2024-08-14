package CollectionsDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("amol");
        lhs.add("pradeep");
        lhs.add("praveen");
        lhs.add("pooja");
        lhs.add(12);
        lhs.add(null);
        System.out.println(lhs.add("pooja"));

        System.out.println(lhs);
    }
}
