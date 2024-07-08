package controlStructure;

public class GreaterNumber2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if(a>b) { // if there are a multiple statements curly brackets are compulsory
            System.out.println("a is greater");
            System.out.println("a=" + a);
        }
        else // if there is a single statement curly brackets are not compulsory
            System.out.println("b is greater");

    }
}
