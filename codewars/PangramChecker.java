public class PangramChecker {
  public static boolean check(String sentence){
    //code
    for(Character ch:"abcdefghijklmnopqrstuvwxyz".toCharArray()){
      if(sentence.toLowerCase().indexOf(ch) < 0 ) {
        return false;
      }
    }    
    return true;
  }

  public static void main(String[] args){
    System.out.println(check("The quick brown fox jumps over the lazy dogawq."));
    System.out.println(check("You shall not pass!"));
  }
}