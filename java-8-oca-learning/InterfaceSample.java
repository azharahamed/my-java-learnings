class Sample{
    public static int a;
    public static String abc(){
        return "Testing";
    }
}

public class InterfaceSample{
    public static void main(String[] aStrings){
        Sample s = null;
        System.out.println("s.a : "+ s.a);
        System.out.println("s.abc : " + s.abc());
    }
}

