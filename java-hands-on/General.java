import java.math.BigDecimal;

public class General {
    public static void main(String ...args){
        Long a = null;
        Utils.identifyMyClass(a);
    }
}

class Utils {
    public static void identifyMyClass(Object o){
        String name = o.getClass().getName();
        System.out.println(name);
        if(o == null)
            System.out.println("This is null");
        if(o instanceof String)
            System.out.println("This is a String");
        else if(o instanceof BigDecimal)
            System.out.println("This is a BigDecimal");
        else if(o instanceof Integer)
            System.out.println("This is a Integer");
        else if(o instanceof Long)
            System.out.println("This is a Long");
        else if(o instanceof Float)
            System.out.println("This is a Float");
    }
}