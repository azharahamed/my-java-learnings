import java.util.Arrays;

class ArrayBinary{
    public static void main(String []args){
        String[][] strings = {{"A","Z"}, {"C", "D", "S"}, {"L"}};
        Arrays.sort(strings);
        for(String []s: strings){
            for(String str: s){
            System.out.print(str);
            }
        }
    }
    
}