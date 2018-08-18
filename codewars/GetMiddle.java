class GetMiddle {
  public static String getMiddle(String word) {
    //Code goes here!
    int len = word.length();
    if(len == 0) return null;
    if(len == 1 || len == 2) return word;
    if(len%2 == 0 ) return word.substring((len/2)-1, (len/2)+1);
    return word.substring((len-1)/2,(len+1)/2);
  }

  public static void main(String[] args){
    System.out.println(getMiddle("test"));
    System.out.println(getMiddle("middle"));
    System.out.println(getMiddle("tes"));
    System.out.println(getMiddle("A"));
  }
}