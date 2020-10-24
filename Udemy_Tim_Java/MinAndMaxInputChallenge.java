import java.util.Scanner;

class MinAndMaxInputChallenge {
    public static void main(String[] main){
        int maximum = 0;
        int minimum = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter Number : ");
            if(scanner.hasNextInt()){
                int a = scanner.nextInt();
                if(maximum < a || counter == 0){
                    maximum = a;
                }
                if(minimum > a || counter == 0){
                    minimum = a;
                }
                counter++;
            } else {
                System.out.println("Maximum : " + maximum);
                System.out.println("Minimum : " + minimum);
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}