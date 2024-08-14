package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(203,"amol");
        hm.put(204,"ashwini");
        hm.put(205,"pradeep");
        hm.put(206,"praveen");
        hm.put(207,"veena");
        hm.put(208,'d');
        hm.put(2.09,true);
        hm.put(null,"amol");
        hm.put(234,null);
        hm.put(899,null);
        hm.put(null,true);

        System.out.println(hm);

    }
}
