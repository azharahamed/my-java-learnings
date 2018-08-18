import java.util.ArrayList;

public class JadenCase {
  public static String toJadenCase(String phrase) {
    if(phrase == null || phrase.length() == 0) return null;
    String[] words = phrase.split(" ");
    StringBuilder newWords = new StringBuilder();
    for(int i=0;i<words.length;i++){
      newWords.append(words[i].substring(0,1).toUpperCase()+words[i].substring(1)+" ");
    }
    return newWords.toString().trim();
  }
  
  public static void main(String[] args){
    System.out.println(JadenCase.toJadenCase("most trees are blue"));
    System.out.println(JadenCase.toJadenCase("How can mirrors be real if our eyes aren't real"));
    System.out.println(JadenCase.toJadenCase(""));
    System.out.println(JadenCase.toJadenCase(null));
  }

  

}