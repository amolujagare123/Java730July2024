package CollectionsDemo.MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(203,"amol");
        lhm.put(204,"ashwini");
        lhm.put(205,"pradeep");
        lhm.put(206,"praveen");
        lhm.put(207,"veena");
        lhm.put(208,"pooja");
        lhm.put(null,"amol");
        lhm.put(234,null);
        lhm.put(899,null);


        System.out.println(lhm);

    }
}
