package p1;

public class P1A{
    public String publicV = "This is public";
    protected String protectedV = "This is protected";
    String defaultV = "This is default";
    private String privateV = "This is private";

    public static void main(String[] args) {
        P1A p1a = new P1A();
        System.out.println(p1a.publicV);
        System.out.println(p1a.protectedV);
        System.out.println(p1a.defaultV);
        System.out.println(p1a.privateV);
    }
}