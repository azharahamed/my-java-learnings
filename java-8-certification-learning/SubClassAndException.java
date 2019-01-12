class AnimalsOutForWalk extends RuntimeException {}
class ExhibitClosed extends Exception {}
class ExhibitClosedForLunch extends ExhibitClosed {}

class A {
    public String functionA() throws ExhibitClosedForLunch {
        System.out.print("Function A");
        return "Testing A";
    }
}

class B extends A {
    public String functionA() {
        System.out.print("Function B");
        return "Testing B";
    }

    public static void testing(){
        System.out.println("Static can be called "+st);
    
    }
    public static int st = 10;
}

public class SubClassAndException {
    public static void main(String[] aregs){
        B b =  new B();
        b.testing();
        b.st++;
        b.testing();
    }
}