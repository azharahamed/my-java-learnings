package p1;

public class P1A{
    static public String publicV = "This is public";
    static protected String protectedV = "This is protected";
    static String defaultV = "This is default";
    static private String privateV = "This is private";

    public static void main(String[] args) {
        //P1A p1a = new P1A();
        System.out.println(publicV);
        System.out.println(protectedV);
        System.out.println(defaultV);
        System.out.println(privateV);
    }
}