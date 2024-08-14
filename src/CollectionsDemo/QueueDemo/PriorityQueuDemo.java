package CollectionsDemo.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueuDemo {

    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.offer("kuldeep");
        pq.offer("amol");
        pq.offer("pooja");
        pq.offer("sakshi");
        pq.offer("ashwini");
        pq.offer("pradeep");

        System.out.println(pq);

        // [amol, ashwini, kuldeep, pooja, pradeep ,  sakshi ]

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
