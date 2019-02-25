class GenDemo {
    public static void main(String args[]){
        System.out.println("***** Interger *****");
        Gen<Integer> iOb = new  Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("value: " + v);

        System.out.println("\n***** String *****");
        Gen<String> sOb = new  Gen<String>("This is a String");
        sOb.showType();
        String str = sOb.getOb();
        System.out.println("String: " + str);

    }
}