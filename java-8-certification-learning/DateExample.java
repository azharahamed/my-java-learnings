import java.time.*;
class DateExample {
  public static void main(String args[]){
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());

    LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
    LocalDate date2 = LocalDate.of(2015, 1, 20);
    System.out.println(date1 + " : " + date2 );

    LocalTime time1 = LocalTime.of(6,1);
    System.out.println("Time 1 : " + time1);

    LocalTime time2 = LocalTime.of(6,15,30);
    System.out.println("Time 2 : " + time2);

    LocalTime time3 = LocalTime.of(6,15,30,200);
    System.out.println("Time 3 : " + time3);

    LocalDateTime localDateTime1 = LocalDateTime.of(2018,03,01,13,01);
    System.out.println("LocalDateTime1 : "+localDateTime1);
    localDateTime1 = localDateTime1.minusDays(10);
    System.out.println("LocalDateTime1 - 10 days : "+localDateTime1);

    LocalDateTime localDateTime2 = LocalDateTime.of(2018,03,01,13,01,02);
    System.out.println("LocalDateTime2 : "+localDateTime2);

    LocalDateTime localDateTime3 = LocalDateTime.of(2018,03,01,13,01,02,300);
    System.out.println("LocalDateTime3 : "+localDateTime3);
    }

}
