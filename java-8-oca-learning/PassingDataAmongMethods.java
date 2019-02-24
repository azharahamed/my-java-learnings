class PassingDataAmongMethods {
  public static void main(String[] args){
    StringBuilder name  = new StringBuilder();
    speak(name);
    System.out.println("After speak :" + name );
    speak1(name);
    System.out.println("After speak1 :" + name );
    String name1 = "Test 1";
    System.out.println("After speak2 :" + name1 );

  }

  public static void speak2(String s){
    s = "Test 2";
  }

  public static void speak(StringBuilder s){
    s.append("Webby");
  }

  public static void speak1(StringBuilder s){
    s = new StringBuilder("Testing");
  }
}