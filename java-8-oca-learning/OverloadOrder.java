
public class OverloadOrder {
    public void fly(Double d){
        System.out.println("Double ");
    }

    public void fly(Float f){
        System.out.println("Float ");
    }

    public void fly(Long l){
        System.out.println("Long ");
    }

    public void fly(Object o){
        System.out.println("Object ");
    }

    // public void fly(Integer i){
    //     System.out.println("Int ");
    // }

    public static void main(String[] args){
        OverloadOrder o = new OverloadOrder();
        o.fly(10);
    }
}

class Second {}