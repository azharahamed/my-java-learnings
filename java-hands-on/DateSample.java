import java.util.Date;

public class DateSample {
    public static void main(String [] args){
        Date a = new Date(2015,01,02,18,40,25);
        System.out.println(a);
        Date b = new Date(a.getYear(),a.getMonth(),a.getDate(),00,00,00);
        System.out.println(b);
    }
}