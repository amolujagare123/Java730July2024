package CollectionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("ashwini");
        s.push("ashwini");
        s.push("Pooja");
        s.push("Prasad");
        s.push("Kuldeep");
        s.push("Sakshi");
        s.push("Pravin");

        System.out.println(s.search("ashwini"));


    }

}
