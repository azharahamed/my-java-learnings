import java.util.ArrayList;
import java.util.List;

class Autoboxing{
    public static void main(String ... args){
        List<Integer> ages =  new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("7"));
        ages.add(null);
        ages.add(12);
        for(Integer a: ages)
            System.out.println(a);
    }
}