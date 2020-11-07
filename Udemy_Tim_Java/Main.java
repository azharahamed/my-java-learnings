public class Main{
    public static void main(String []args){
        int[] myInt = {1,2,3,4,5};
        int[] copy = myInt;
        myInt[3]=400;

        System.out.println(copy[3]);

        System.out.println(myInt[3]);
    }
}