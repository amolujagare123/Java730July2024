package StringDemo;

public class StringComparison {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

       // System.out.println(a==b);

        String str1 = "amol";
        String str2 = "amol";
        String str3 = "AMOL";
        String str4 = "Sakshi";
        String str5 = new String("amol");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));

        System.out.println(str1==str2);

        System.out.println(str1==str5); // true

    }
}
