package Arrays.TwoD;

public class TwoDStringArrayDemo3 {
    public static void main(String[] args) {

        String[][] stArr = {
                {"Amit", "Raj", "Neha", "Kavita", "Rahul"},
                {"Sita", "Vijay", "Priya", "Anil", "Pooja"},
                {"Ravi", "Meena", "Kiran", "Anita", "Arjun"}
        };


        int row = stArr.length;
        int col = stArr[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for (int i=0;i<stArr.length;i++)
        {
            for(int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
