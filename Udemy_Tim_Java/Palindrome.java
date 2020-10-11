public class Palindrome {
 public static boolean isPalindrome(int number){
     if(number < 0){
         number = number * -1;
     }
     int traverse = number;
     int reverseNumber = 0;
     while(traverse>0){
         reverseNumber = (reverseNumber*10)+(traverse%10);
         traverse = traverse/10;
         System.out.println(" traverse : "+traverse+" | reverseNumber : "+reverseNumber);
     }
     if(reverseNumber == number){
         return true;
     }
     return false;
 }

 public static void main(String[] args){
     System.out.println("Palindrome 11"+isPalindrome(-222));
 }
}