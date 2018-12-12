interface Walk {
  public default int getSpeed() {
    return 5;
  }
}

interface Run {
  public default int getSpeed(){
    return 10;
  }
}

class Q3 implements Walk, Run {
  public int getSpeed(){
    return 6;
  }
  public static void main(String[] args) {
    Q3 an = new Q3();
    System.out.println(an.getSpeed());
  }
}
