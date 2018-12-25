public class Varargs{
    public static void main(String... args){
        fly(new int[]{1,2,3});
    }

    public static void fly(int... a){
        for(int b: a) System.out.println(b+ " ");
    }
}