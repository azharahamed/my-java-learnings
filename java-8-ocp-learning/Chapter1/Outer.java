public class Outer{
    private  String greeting = "Hi";

    protected  class Inner {
        public int repeat = 3;
        public void go(){
            for(int i = 0; i < repeat; i++){
                System.out.println(greeting);
            }
        }

        public void testing(){
            System.out.println("Testing");
        }
    }

    public void callInner(){
        Inner inner = new Inner();
        inner.go();

        inner = new Outer().new Inner();
        inner.testing();
    }

    public static void main(String[] args){
        Outer outer = new Outer();
        outer.callInner();  
    }
}