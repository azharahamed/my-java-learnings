abstract class Animal {
    public abstract String getName();
}

abstract class BigCat extends Animal {
    public abstract void roar();
}

class Lion extends BigCat {
    public String getName(){
        return "Lion";
    }

    public void roar(){
        System.out.println("Lion Roars !");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Lion l = new Lion();
        System.out.println(l.getName());
        l.roar();
        
    }
}