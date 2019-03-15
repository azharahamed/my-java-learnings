class EnumLearning {
    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String ... args){
        Season s;
        s = Season.SPRING;
        System.out.println(s);
        System.out.println(s.ordinal() == 1);

        for(Season season: Season.values()){
            System.out.println(season.name() + " " + season.ordinal());
        }
    }
}