public class InitializationOrderSimple {
    private String name = "Torchie";
    {System.out.println(name);}
    private static int COUNT=0;
    static {System.out.println(COUNT);}
    static {COUNT+=10;System.out.println(COUNT);}
    public InitializationOrderSimple(){
        System.out.println("Constructor");
    }

    public static void main(String args[]){
        System.out.println("ready to contruct");
        new InitializationOrderSimple (); 
    }
}