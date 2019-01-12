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

interface Hastail {
    int i =10;
    public void testing();
}

interface intB {

}

abstract class abA {

}
abstract class abB{

}

interface B extends Hastail{

}

public abstract class AbstractClass extends abA implements Hastail, intB {
    public static void main(String[] args) {
        Lion l = new Lion();
        System.out.println(l.getName());
        l.roar();
        
    }

    public void testing(){

    }
}