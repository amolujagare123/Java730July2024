package loops;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        int a ;  // sc.nextInt()
        int b ;
        int c;

        char choice;

        do {

            String operation;
            Scanner sc = new Scanner(System.in);

            System.out.println("enter the value of a");
            a = sc.nextInt();

            System.out.println("enter the value of b");
            b = sc.nextInt();

            System.out.println("Operation need to performed");
            operation = sc.next();

            switch (operation) {
                case "add":
                    c = a + b;
                    System.out.println("Addition=" + c);
                    break;
                case "sub":
                    c = a - b;
                    System.out.println("Subtraction=" + c);
                    break;
                case "mult":
                    c = a * b;
                    System.out.println("Multiplication=" + c);
                    break;
                case "div":
                    c = a / b;
                    System.out.println("Division=" + c);
                    break;
                default:
                    System.out.println("wrong operation");
                    break;
            }

            System.out.println("Do you want to continue (y/n) :");
            choice = sc.next().charAt(0);

        } while(choice=='y' ||choice=='Y' );

    }
}
