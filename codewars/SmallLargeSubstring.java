import java.util.Scanner;

class SmallLargeSubstring {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int strLength = s.length();
        for(int i=0;i<strLength-k+1;i++){
            String temp = s.substring(i,i+k);
            if(i==0){
                smallest = temp;
                largest = temp;
            } else {
                if(temp.compareTo(smallest) < 0){
                    smallest = temp;
                }
                if(temp.compareTo(largest) > 0){
                    largest = temp;
                }
            }
            System.out.println("Smallest : " + smallest +" | Largest : " + largest + " | Temp : " + temp);
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}