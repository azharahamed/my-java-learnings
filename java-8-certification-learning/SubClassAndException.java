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
    public String functionA() throws ExhibitClosed {
        System.out.print("Function B");
        return "Testing B";
    }
}

public class SubClassAndException {
    public static void main(String[] aregs){

    }
}