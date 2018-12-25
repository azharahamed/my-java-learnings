public class Constructor{
    int no;
    String name;
    Constructor(int no, String name){
        System.out.println("-Name & Number-");
        this.no = no;
        this.name = name;
    }
    Constructor(){
        // System.out.println("-Default-");
        this(0,"default");
    }
    
}