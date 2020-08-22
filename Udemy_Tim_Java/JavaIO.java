import java.util.Scanner;
import java.lang.ArithmeticException;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;

public class JavaIO {
    public static void main(String[] args){
        int result = divide();
        System.out.println(result);
    }

    private static int divide(){
        int x, y;
        try {
            x = getInt();
            y = getInt();
        } catch(NoSuchElementException e){
            throw new ArithmeticException("no suitable input");
        }
        System.out.println("X is " + x + ", y is " + y);
        try {
            return x/y;
        } catch (ArithmeticException e){
            throw new ArithmeticException("attempt to divide by zero");
        }
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        while(true){
            try {
                return s.nextInt();
            } catch(InputMismatchException e){
                s.nextLine();
                System.out.println("Please enter a valid number!!");
            }
        }
    }
}