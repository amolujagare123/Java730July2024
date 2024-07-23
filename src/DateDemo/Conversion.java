package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public static void main(String[] args) throws ParseException {

        String expected = "22/07/2024";
        String actual = "2024-07-22";

        // lets convert actual date into expected Date format

        // step 1 - convert actual date in string to date format
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sd.parse(actual);

        // step 2 - convert  date into  string
        SimpleDateFormat sd2 = new SimpleDateFormat("dd/MM/yyyy");
        String convertedActual = sd2.format(date);

        System.out.println("expected="+expected);
        System.out.println("convertedActual="+convertedActual);

        if(expected.equals(convertedActual))
            System.out.println("Test is passed");
        else
            System.out.println("Test is failed");


    }
}
