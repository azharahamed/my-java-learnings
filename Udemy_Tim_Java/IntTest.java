public class IntTest {
    public static void main(String[] args){
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        long testLong = 100L;

        System.out.println("Integer Minimum Value " + myMinValue);
        System.out.println("Integer Maximum Value " + myMaxValue);

        System.out.println("Busted Minimum Value " + (myMinValue - 1));
        System.out.println("Busted Maximum Value " + (myMaxValue + 1));

        System.out.println("Long value = " + testLong);
    }
}