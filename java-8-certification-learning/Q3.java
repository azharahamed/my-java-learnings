class Q3 {
  int x = 013;
  public static void main(String[] args) {
    Q3 q3 = new Q3();
    q3.go(22);
  }

  void go(final int i){
    System.out.println(x);
    System.out.print(i/x);
  }
}
