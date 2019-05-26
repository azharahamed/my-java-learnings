public class FourLegged {
    String walk = "walk, ";

    public static String test(){
        return " -- Walk --";
    }
    static class BabyRhino extends FourLegged{
        String walk = "toddle , ";

        public static String test(){
            return " -- Toddle --";
        }

    }

    public void callOuter(){
        FourLegged f = new BabyRhino();
        BabyRhino b = new BabyRhino();
        System.out.println(f.walk + b.walk);
        System.out.println(f.test() + b.test());
    }

    public static void main(String [] args){
        new FourLegged().callOuter();
    }
}