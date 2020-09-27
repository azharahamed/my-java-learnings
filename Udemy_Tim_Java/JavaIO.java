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
            System.out.println("X is " + x + ", y is " + y);
            return x/y;
        } catch(ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Can't handle this exception! Shutting out");
        }
        return 0;

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