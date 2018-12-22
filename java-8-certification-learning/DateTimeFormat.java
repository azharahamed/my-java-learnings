import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormat {

    public static void main(String ...args){
        LocalDate localdate = LocalDate.of(2015, Month.JANUARY, 01);
        System.out.println("localdate : "+localdate);

        LocalTime localtime = LocalTime.of(12,13,10,10);
        System.out.println("localtime : "+localtime);

        LocalDateTime localtimedatetime = LocalDateTime.of(20,01,01,10,10,10);
        System.out.println("localtimedatetime : "+localtimedatetime);

        DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("YY MMM DD HH:SS");
        // System.out.println(datetimeformatter.format(localdate));
        System.out.println(localtimedatetime.format(datetimeformatter));


    }

}