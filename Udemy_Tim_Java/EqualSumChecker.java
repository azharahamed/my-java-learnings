public class EqualSumChecker {
    public static boolean hasEqualSum(int a, int b, int sum){
        if((a+b)==sum) {
            return true;
        }
        return false;
    }

    public static void main(String []args){
        System.out.println(hasEqualSum(1,-1,0));
    }
}