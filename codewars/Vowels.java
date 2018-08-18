public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    // your code here
    for(char ch:str.toCharArray())
      if("aeiou".indexOf(ch) >= 0)
         vowelsCount++;       
    return vowelsCount;
  }

  public static void main(String[] args){
    System.out.println(Vowels.getCount("abracadabra"));
  }

}