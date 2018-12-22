interface Foo {}
class A implements Foo {}
class B extends A {}
class C {}

public class InstanceOfOp {
    public static void main(String... args){
        A a = new A();
        B b = new B();
        System.out.println("a instanceof A "  + (a instanceof A));
        System.out.println("b instanceof B "  + (a instanceof B));
        System.out.println("b instanceof B "  + (a instanceof C));

    }
}