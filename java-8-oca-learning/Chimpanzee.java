class Primate {
    public Primate() {
        System.out.println("Primate()");
    }
}

class Ape extends Primate {
    public Ape() {
        System.out.println("Ape()");
    }

    public Ape(int i){
        System.out.println("Ape(int i)");
    }
}

public class Chimpanzee extends Ape {
    public Chimpanzee(){ 
        super(10);
        System.out.println("Chimpanzee()");
    }
    public Chimpanzee(int i){ 
        this();
        System.out.println("Chimpanzee(int i)");
    }
    public static void main(String[] args){
        new Chimpanzee(10);
    }
}