package CollectionsDemo.QueueDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDQueuDemo {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.offer("kuldeep");
        adq.offer("amol");
        adq.offer("pooja");
        adq.offer("sakshi");
        adq.offer("ashwini");
        adq.offer("pradeep");

        System.out.println(adq);

        adq.offerFirst("First");
        adq.offerLast("Last");

        System.out.println(adq);

       // System.out.println(adq.poll());

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);

    }
}
