class Marsupial {
    public int a = 10;
    static public boolean isBiped(){
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped()+" > "+a);
    }
}

public class Kangaroo extends Marsupial {
    public int a = 20;
    static public boolean isBiped() {
        return true;
    }
    public void getKangarooDescription(){
        System.out.println("Kangaroo hops on two legs: "+isBiped() + "| " + this.a);
        System.out.println ("Super");
        super.getMarsupialDescription();
        System.out.println("This");
        this.getMarsupialDescription();
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs hjkh: "+isBiped()+" > "+a);
    }

    public static void main(String[] args){
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}