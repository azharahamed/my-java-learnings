import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Date;
import java.text.SimpleDateFormat;


class DateConvertor {
    public static void main(String []args){
        try{

       
        String str = "2012-12-01";
        String format = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        //sdf.setLenient(false);
        if (!str.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$") && !str.matches("^[0-3]?[0-9]-[0-3]?[0-9]-(?:[0-9]{2})?[0-9]{2}$")){
            System.out.println("Didn't match");
        }
        Date dt = sdf.parse(str);
        int year = Integer.parseInt(new SimpleDateFormat("yyyy").format(dt));
        int month = Integer.parseInt(new SimpleDateFormat("MM").format(dt));
        int day = Integer.parseInt(new SimpleDateFormat("dd").format(dt));
        System.out.println("Year: " + year + " Month "+ month +" Day "+ day);
        System.out.println("Format Length : " + format.length() + " String : " + str.length() );

        if (year > 999 && str.matches("^[0-9].+[0-9///-][0-9]$") && str.length() <= format.length() ){
            System.out.println("Matches Mine");            
            //System.out.println("Year: " + year + " Month "+ month +" Day "+ day);
        } else {
            System.out.println("Didn't Match Mine");  
            //&& str.length()<=format.length()
        }
        
    } catch(Exception e){
        System.out.println("Exception");
    }
    }
    
}