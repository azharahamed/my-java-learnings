import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Date;
import java.text.SimpleDateFormat;


class DateConvertor {
    public static void main(String []args){
        try{

       
        String str = "1/1/99";
        if (!str.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$") && !str.matches("^[0-3]?[0-9]-[0-3]?[0-9]-(?:[0-9]{2})?[0-9]{2}$")){
            System.out.println("Didn't match");
        }
        if (str.matches("^[0-9].+[0-3]?[0-9]$")){
            System.out.println("Matches Mine");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = sdf.parse(str);
        int year = Integer.parseInt(new SimpleDateFormat("yyyy").format(dt));
		int month = Integer.parseInt(new SimpleDateFormat("MM").format(dt));
		int day = Integer.parseInt(new SimpleDateFormat("dd").format(dt));
        System.out.println("The date is "+ dt + " Year: " + year + " Month "+ month +" Day "+ day);
    } catch(Exception e){
        System.out.println("Exception");
    }
    }
    
}