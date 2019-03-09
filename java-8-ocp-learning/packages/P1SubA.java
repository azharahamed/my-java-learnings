package p1;

public class P1SubA extends P1A{
    public static void main(String[] args) {
        P1SubA p1a = new P1SubA();
        System.out.println(p1a.publicV);
        System.out.println(p1a.protectedV);
        System.out.println(p1a.defaultV);
        System.out.println(p1a.privateV);
    }
}