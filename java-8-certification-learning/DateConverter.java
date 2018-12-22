import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;


class DateConvertor {
    public static void main(String []args){
        String format = new String("dd/MM/yy");
        String str = "01/02/10";
 
        System.out.println("String : "+str+" | Format : "+format+" Return date :" + validDateFormat(str, format));

    }

    public static Date validDateFormat(String str, String format) {
		//DateFormat sdf = null;
		Date retVal = null;
		if (!str.isEmpty() && !str.equalsIgnoreCase("NULL")) {
			if (format!=null) {
				try{
					SimpleDateFormat sdf = new SimpleDateFormat(format);
					sdf.setLenient(false);
					retVal = sdf.parse(str);
					int year = Integer.parseInt(new SimpleDateFormat("yyyy").format(retVal));
					if(year < 1000 || !str.matches("^[0-9].+[0-9///-][0-9]$") || str.length() > format.length()) {
                        System.out.println(" Defaulting to a value for incorrect format ");
                        retVal = null;
						}
					} catch (Exception e){
                        System.out.println(" Exception Occured ");
				}
			} else{			
				retVal = null;
			}
		}
		return retVal;
    }
    
}