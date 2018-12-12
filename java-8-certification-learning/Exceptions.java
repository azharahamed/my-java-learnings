class Exceptions{
  public static void main(String args[]){
    String v = new String();
    v = null;
    try{
      try{
        System.out.println("First Try Before Exception!");
        v.length();
        System.out.println("After the First Try exception");
      } catch(NullPointerException e) {
        System.out.println("NullPointerException");
        int a = 5/0;
        System.out.println("NullPointerException - After AritmeticException");
      } catch(ArithmeticException e){
        System.out.println("AritmeticException");
      } finally {
        System.out.println("finally");
      }
  } catch(ArithmeticException e){
    System.out.println("NullPointerException - At the end");
  }
}
}