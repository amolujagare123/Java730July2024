package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(203,"amol");
        hm.put(204,"ashwini");
        hm.put(205,"pradeep");
        hm.put(206,"praveen");
        hm.put(207,"veena");
        hm.put(208,"pooja");
        hm.put(null,"amol");
        hm.put(234,null);
        hm.put(899,null);


        System.out.println(hm);

    }
}
