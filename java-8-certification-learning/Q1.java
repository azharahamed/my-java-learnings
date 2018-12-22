public class Q1{
    public static void main(String args[]){
        int arr[][] = {{1,3,5},{7,8}};
        out: for (int [] a: arr) {
            for(int i: a){
                if(i==7) continue; 
                System.out.print(i+ " ");
                if(i==3) break;
            }
            
        }
    }
}