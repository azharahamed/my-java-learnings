public class AnnoInner{
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice){
        SaleTodayOnly saleTodayOnly = new SaleTodayOnly(){
        
                @Override
                int dollarsOff() {
                    return 1;
                }
        };
        return basePrice - saleTodayOnly.dollarsOff();
    }

    public static void main(String[] args) {
        AnnoInner annoInner = new AnnoInner(); 
        System.out.println(annoInner.admission(20));
    }
}