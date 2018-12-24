class PassByValueVsReference {
    public static void main(String... args){
        String name1 = "Azhar";
        String name2 = "Jasmin";
        System.out.println("Before " + name1 + " | " + name2);
        swap(name1, name2);
        System.out.println("After " + name1 + " | " + name2);
    }
    static void swap(String name1, String name2){
        String temp = name1;
        name1 = name2;
        name2 = temp;

        System.out.println("Inside "+ name1 + " | " + name2);
    }
}

