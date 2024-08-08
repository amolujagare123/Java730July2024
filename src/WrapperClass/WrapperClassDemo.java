package WrapperClass;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int i = 10;
        System.out.println("i="+i);

        Integer ii1 = new Integer(i);
        System.out.println("ii1="+ii1); // boxing /wrapping

        Integer ii2 = 6;
        System.out.println("ii2="+ii2); // auto boxing /auto wrapping

        int i2 = ii2.intValue(); // unboxing / unwrapping
        System.out.println("i2="+i2);

        int i3 = ii2; // auto unboxing / auto unwrapping
        System.out.println("i3="+i3);

    }
}
