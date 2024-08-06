package Methods;

import basic.DemoClass;

public class MethodsArguments {

    void methodName1(int a)
    {
        System.out.println("a="+a);
        System.out.println("============");
    }
    void methodName2(int a,int b)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("============");
    }

    void methodName3(int a,int b,int c)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("============");
    }

    void methodName4(int a,float b,char c)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("============");
    }

    void methodName5(int a,float b,String str)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("str="+str);
        System.out.println("============");
    }

    void printMyArray(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n============");
    }


    void printMyTwoDArray(String[][] stArr)
    {
        for (int i=0;i< stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void setMyDemoObject(DemoClass obj)
    {
        obj.a = 10;
        obj.d = 34.56;
        obj.c = 'h';
        obj.str = "amol";
    }

    public static void main(String[] args) {

        MethodsArguments ob = new MethodsArguments();
        /*ob.methodName1(12);
        ob.methodName2(12,45);
        ob.methodName3(34,56,78);
        ob.methodName4(34,56.45f,'k');
        ob.methodName5(34,56.45f,"amol ujagare");

        int[] myArray = {23,45,67,89,11,223,45,78,90};

        ob.printMyArray(myArray);

        String[][] myTwoDArr = {
                {"Amit", "Raj", "Neha", "Kavita", "Rahul"},
                {"Sita", "Vijay", "Priya", "Anil", "Pooja"},
                {"Ravi", "Meena", "Kiran", "Anita", "Arjun"}
        };

        ob.printMyTwoDArray(myTwoDArr);*/

        DemoClass demoClass = new DemoClass();
        demoClass.display();

        ob.setMyDemoObject(demoClass);

        demoClass.display();

    }
}
