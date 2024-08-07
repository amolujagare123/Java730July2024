package DateDemo;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) throws ParseException { //converting String to date

        String dateStr = "07/17-2024";
        System.out.println(dateStr);
  //  try {
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sd.parse(dateStr);
        System.out.println(date);
   /* }
    catch (Exception e)
    {

    }*/

        String dateStr1= "2016-06-23 | 8:34:22";
        SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        Date date1 = sd1.parse(dateStr1);
        System.out.println(date1);

        String dateStr2= "Thursday 2016/06/23";
        SimpleDateFormat sd2 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        Date date2 = sd2.parse(dateStr2);
        System.out.println(date2);
    }
}
