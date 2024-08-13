package CollectionsDemo.VectorDemo;

import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        System.out.println("size="+v.size()); // 0
        System.out.println("capacity="+v.capacity()); //10

        v.add("amol");
        v.add("sakshi");
        v.add("praveen");
        v.add("prasad");
        v.add("veena");
        v.add("ashwini");
        v.add("ashwini");
        v.add("veena");
        v.add("ashwini");
        v.add("ashwini");
        v.add("ashwini");
        v.add("praveen");
        v.add("prasad");
        v.add("veena");
        v.add("ashwini");
        v.add("ashwini");
        v.add("veena");
        v.add("ashwini");
        v.add("ashwini");
        v.add("ashwini");
        v.add("ashwini");

        System.out.println("size="+v.size()); // 21
        System.out.println("capacity="+v.capacity()); // 20

        System.out.println(v);
    }
}
