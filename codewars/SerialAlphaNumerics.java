import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;  
import java.util.InputMismatchException;

class SerialAlphaNumerics {

  public static String nextAlphaNumeric(String format, String incomingNumber) throws InputMismatchException {
    StringBuilder returnNumber = new StringBuilder();
    List<String> formatCharList = Arrays.asList(format.split("\\|"));

    int stringLength = incomingNumber.length(); 

    // Throw exception, if existing serialNumber length is not matching the input format
    if(formatCharList.size() != stringLength) {
          throw new InputMismatchException("nextAlphaNumeric(String a, String b) - Length Mismatch");
    }

    List<Character> currentCharList = new ArrayList<>();

    for(int i = 0; i < stringLength; i++){
      currentCharList.add(incomingNumber.charAt(i));
    }
    
    // Reversing the both lists, so that we can evaluate and increment the values from right to left
    //Collections.reverse(currentCharList);
    Collections.reverse(formatCharList); 
    boolean incrementCompleted = false;

    // Traverse through each format char to evaluate and increment the incomingNumber
    for(String chr : formatCharList){ 
      stringLength--;
      Character currentCharacter = currentCharList.get(stringLength);

      if(chr.length() == 1 && chr.equals(Character.toString(currentCharacter))){
        returnNumber.append(Character.toString(currentCharacter));
        continue;
      }

      if(chr.charAt(0) <= currentCharacter && chr.charAt(2) >= currentCharacter) {
        char beginChar = chr.charAt(0);
        char endChar = chr.charAt(2);
        if(!incrementCompleted){
          if(currentCharacter == endChar){
            returnNumber.append(Character.toString(beginChar));
          } else {
          currentCharacter++;
          returnNumber.append(Character.toString(currentCharacter));
          incrementCompleted = true;
          }
        } else {
          returnNumber.append(Character.toString(currentCharacter));
        }
      } else {
        System.out.println("Exception!");

      }     
    }

    if(!incrementCompleted) System.out.println("Max out Exception!");

    String nextAlphaNumeric1 = returnNumber.reverse().toString();
    return nextAlphaNumeric1;
  }

  public static void main(String [] args){
    String format = "1-6|0-9|0-9|0-9|0-9|A-Z|A-Z|A-Z|0|0";
    System.out.println("60999ZZZ00 | " + nextAlphaNumeric(format, "69999ZZZ00"));
  }
}