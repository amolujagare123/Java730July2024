package CollectionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("ashwini");
        s.push("Pooja");
        s.push("Prasad");
        s.push("Kuldeep");
        s.push("Sakshi");
        s.push("Pravin");

        System.out.println(s);
       // System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s);
      /*  s.pop();
        System.out.println(s);
*/
    }

}
