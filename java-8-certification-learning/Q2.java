import static java.lang.System.out;
public class Q2 {
    
    public static void main(String... args){
        name = "animal";
        Sample s1 = new Sample();
        s1.a = 20;
        Sample1 s2 = new Sample1();
        s2.a = 30;
        out.println("S1 (a)" +" : "+ s1.a +" | "+s2.a + " "+ name);
        s1.printA();
        s2.printA();
    }

    static String name;
}

class Sample {
    protected int a =10;
    public void printA(){
        out.println("The value of a is "+a+" and is printed by the super class");
    }
}

class Sample1 extends Sample {
    @Override
    public void printA() {
        out.println("The value of a is "+a+" and is printed by the super class");
    }
} 