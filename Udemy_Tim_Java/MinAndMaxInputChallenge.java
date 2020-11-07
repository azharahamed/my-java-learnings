import java.util.Scanner;

class MinAndMaxInputChallenge {
    public static void main(String[] main){
        int maximum = 0;
        int minimum = 0;
        boolean first = true;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter Number : ");
            if(scanner.hasNextInt()){
                int a = scanner.nextInt();
                if(first){
                    first = false;
                    maximum = a;
                    minimum = a;
                }
                if(maximum < a){
                    maximum = a;
                }
                if(minimum > a ){
                    minimum = a;
                }
            } else {
                if(!first){
                    System.out.println("Maximum : " + maximum);
                    System.out.println("Minimum : " + minimum);
                    break;
                }
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}