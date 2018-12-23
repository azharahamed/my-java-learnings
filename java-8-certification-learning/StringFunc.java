import java.util.ArrayList;
import java.util.List;

public class StringFunc{ 
    public static void main(String... str){

        List<String> list = new ArrayList<>();
        list.add(0, "Testing List");
        for(String s: list){
            System.out.println(s);
        }
        StringBuilder strBuilder = new StringBuilder();

        strBuilder.insert(0, "Testing");

        System.out.println(strBuilder);

        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if(a == "2cfalse") System.out.println("==");
        if(a.equals("2cfalse")) System.out.println("equals");

        
        char ch = 'A';
        double i = ch;
        if(i >= ch) System.out.println("The char can be compared to a int");
        System.out.println("ch = "+ch);
        System.out.println("i = "+ i);
    }

} 