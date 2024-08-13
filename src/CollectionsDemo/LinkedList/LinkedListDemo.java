package CollectionsDemo.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("amol");
        ll.add("sakshi");
        ll.add("praveen");
        ll.add("prasad");
        ll.add("veena");
        ll.add("ashwini");
        ll.add("ashwini");
        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
