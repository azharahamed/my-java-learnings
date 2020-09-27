public class LeapYear {
    public static void main(String []args){
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1700));
    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        if(year%4 == 0){
            if((year%100 == 0) && (year%400 == 0)){
                return true;
            } else if(year%100 != 0){
                return true;
            }
        }
        return false;
    }
}