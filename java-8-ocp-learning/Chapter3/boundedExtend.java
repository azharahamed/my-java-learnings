import java.util.ArrayList;
import java.util.List;
class Sparrow extends Bird{
    public static void printName(){
        System.out.println("Sparrow");
    }
}
class Bird {
    public static void printName(){
        System.out.println("Bird");
    }
}
public class boundedExtend {
    public static void main(String [] args){
        List<? extends Bird> birds = new ArrayList<>();
        Sparrow sparrow = new Sparrow();
        Bird bird = new Bird();
        birds.add(sparrow);
        birds.add(bird);
    }
}