class Bear {
    private static int a;
    public static void eat(){
        System.out.println("Bear is eating"+a);
    }
}

public class Panda extends Bear{
    public static int a;
    public static void eat(){
        System.out.println("Panda bear is chewing" + a);
    }

    public static void main(String[] args) {
        Panda.eat();
        
    }
}
