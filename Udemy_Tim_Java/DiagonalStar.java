public class DiagonalStar {
    // write your code here
    public static void printSquareStar(int number){
        if(number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        boolean isEven = (number%2!=0);
        int middleValue = (isEven) ? (number/2)+1 : number/2;
        String reverseString = "";
        for(int i=1;i<=middleValue;i++){
            reverseString = "";
            for(int j=1;j<=middleValue;j++){
                if((i==j) || (i==1) || (j==1)){
                    System.out.print("*");
                    if(isEven && (j==middleValue)){
                    } else {
                        reverseString = "*"+reverseString;
                    }
                } else {
                    System.out.print(" ");
                    if(isEven && (j==middleValue)){
                    } else {
                        reverseString = " "+reverseString;
                    }
                }
            }
            System.out.println(reverseString);
        }
        int i = (isEven) ? middleValue-1:middleValue;
        for(;i>=1;i--){
            reverseString = "";
            for(int j=1;j<=middleValue;j++){
                if((i==j) || (i==1) || (j==1)){
                    System.out.print("*");
                    if(isEven && (j==middleValue)){
                    } else {
                        reverseString = "*"+reverseString;
                    }
                } else {
                    System.out.print(" ");
                    if(isEven && (j==middleValue)){
                    } else {
                        reverseString = " "+reverseString;
                    }
                }
            }
            System.out.println(reverseString);
        }
        
    }

    public static void main(String args[]){
        printSquareStar(5);
    }
}