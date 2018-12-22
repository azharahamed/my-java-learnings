public class StringFunc{
    public static void main(String... str){
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