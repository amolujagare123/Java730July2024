package CollectionsDemo.SetDemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add("amol");
        hs.add("pradeep");
        hs.add("praveen");
        hs.add("pooja");
        hs.add(12);
        System.out.println(hs.add("pooja"));

        System.out.println(hs);
    }
}
