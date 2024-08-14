package CollectionsDemo.MapDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(503,"amol");
        tm.put(204,"ashwini");
        tm.put(305,"pradeep");
        tm.put(106,"praveen");
        tm.put(207,"veena");
        tm.put(228,"pooja");
      //  tm.put(null,"amol");
        tm.put(294,null);
        tm.put(899,null);


        System.out.println(tm);

    }
}
