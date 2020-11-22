import java.time.*;
import java.time.temporal.ChronoUnit; 

public class DateLearning{
    public static void main(String[] args){
       // LocalTime localTime = LocalTime.now();

        // System.out.println(localTime);

        /* ZoneId.getAvailableZoneIds().stream()
            .sorted()
            .filter(z -> z.contains("GMT"))
            .forEach(System.out::println); */
        
        ZoneId zone = ZoneId.of("America/New_York");
        LocalDate date = LocalDate.of(2016,03,13);
        LocalTime time = LocalTime.of(1,30);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(date,time, zone);
        String dateTimeString = zonedDateTime.toString();
        System.out.println("Zoned Date : " + dateTimeString);
        System.out.println("Zoned Date + 1 Hours : " + zonedDateTime.plusHours(1));

        System.out.println("========================");

        ZonedDateTime zonDt = ZonedDateTime.of(2016,03,13,01,30,00,00,zone);

        
        System.out.println("Zoned Date1 : " + zonDt);
        System.out.println("Zoned Date1 + 1 Hours : " + zonDt.plusHours(1));

        LocalDateTime localDateTime = LocalDateTime.of(date,time);

        System.out.println("Local DateTime : " + localDateTime);
        System.out.println("Local DateTime + 1 Hours : " + localDateTime.plusHours(1));

        System.out.println(ZoneId.systemDefault());


    }
}