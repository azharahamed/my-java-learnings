public class DecimalComparator{
    public static void main(String []args){
        System.out.println("Result : " + areEqualByThreeDecimalPlaces(100.1234,100.1235));
    }

    public static boolean areEqualByThreeDecimalPlaces(Double a, Double b){
        long first = Double.valueOf(a*1000).longValue();
        long second = Double.valueOf(b*1000).longValue();

        if(first == second){
            return true;
        }

        return false;
    }
}