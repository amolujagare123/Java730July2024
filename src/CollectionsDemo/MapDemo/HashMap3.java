package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMap3 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        System.out.println(hm.isEmpty()); // true
        System.out.println(hm.size()); // 0

        hm.put(203,"amol");
        hm.put(204,"ashwini");
        hm.put(205,"pradeep");
        hm.put(206,"praveen");
        hm.put(207,"veena");
        hm.put(208,"pooja");
        hm.put(null,"amol");
        hm.put(234,null);
        hm.put(899,null);
        System.out.println(hm.isEmpty());
        System.out.println("hm="+hm);
        System.out.println(hm.get(206));

        System.out.println(hm.size());

        hm.remove(207);
        System.out.println("hm="+hm);

        System.out.println(hm.containsKey(206));
        System.out.println(hm.containsValue("ashwini2"));

        hm.clear();

        System.out.println("hm="+hm);




    }
}
