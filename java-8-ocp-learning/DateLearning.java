import java.time.*;

public class DateLearning{
    public static void main(String[] args){
        System.out.println("LocalDate : "+ LocalDate.now());
        System.out.println("LocalTime : "+ LocalTime.now());
        System.out.println("LocalDateTime : "+ LocalDateTime.now());
        System.out.println("ZonedDateTime : "+ ZonedDateTime.now());
        System.out.println("LocalTime : "+ LocalTime.of(6, 15));

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);

        ZoneId.getAvailableZoneIds().stream()
            .sorted()
            .filter(z -> z.contains("GMT"))
            .forEach(System.out::println);
        
        ZoneId zone = ZoneId.of("GMT");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(1970,01,01,00,00,00,00, zone);


        zonedDateTime = zonedDateTime.plusMonths(2).plusYears(1);
        System.out.println(zonedDateTime);
        System.out.println(ZoneId.systemDefault());
    }
}