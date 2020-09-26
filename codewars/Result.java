import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Result {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale dollar = new Locale("en", "US");
        Locale rupee = new Locale("en", "IN");
        Locale ch = new Locale("zh","CN");
        Locale fr = new Locale("fr", "FR");
		NumberFormat usnf = NumberFormat.getCurrencyInstance(dollar);
        NumberFormat indianf = NumberFormat.getCurrencyInstance(rupee);
        NumberFormat chinanf = NumberFormat.getCurrencyInstance(ch);
        NumberFormat francenf = NumberFormat.getCurrencyInstance(fr);
        String us = usnf.format(payment);
        String india = indianf.format(payment);
        String china = chinanf.format(payment);
        String france = francenf.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}