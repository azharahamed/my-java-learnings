class A{
  void method(){
    System.out.print(" A B");
  }
}

class B extends A {
  protected void method(){
    System.out.print("C D");
  }
  void method2(){
    System.out.print("Azhar");
  }
}

class Q3 {
  public static void main(String[] args) {
    A a = new B();
    a.method();
    a.method2();
  }
}
