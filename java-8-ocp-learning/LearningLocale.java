import java.util.*;

public class LearningLocale {
    public static void main(String[] args){
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(Locale.US);
        System.out.println(new Locale("ml", "IN"));

        Locale l1 = new Locale.Builder()
            .setLanguage("hi")
            .setRegion("AZ")
            .build();
        
        System.out.println(l1);

        Locale english = new Locale("en", "FR");
        printProperties(english);
    }

    public static void printProperties(Locale locale){
        ResourceBundle rb = ResourceBundle.getBundle("Zoo_fr");
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
    }
}