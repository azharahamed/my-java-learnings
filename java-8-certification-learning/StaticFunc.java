public class StaticFunc {
    public static int i = 1;
    static {System.out.println("Static Block "+i);}
    public static void swing(){
        i++;
        System.out.println("swing "+i);
    }
    public void climb(){
        System.out.println("climb ");
    }
    public static void play(){
        swing();
    }
    public static void main(String[] args){
        StaticFunc rope = new StaticFunc();
        rope.i = 10;
        StaticFunc rope2 = null;
        rope2.play();
        
    }
}
