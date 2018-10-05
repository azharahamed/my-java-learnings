import java.util.ArrayList;

public class KPrimes {
  /* A natural number is called k-prime if it has exactly k prime factors, counted with multiplicity.

  A natural number is thus prime if and only if it is 1-prime.*/
    
  public static Long[] countKprimes(int k, long start, long end) {
      // your code
      int countPrimes;
      ArrayList<Long> kPrimes = new ArrayList<>();
      for(long i=start;i<=end; i++) {
        countPrimes = puzzle(i);
        //System.out.println("i : "+i+"; countPrimes : "+countPrimes);
        if(countPrimes == k) kPrimes.add(i);  
      }      
      return kPrimes.toArray(new Long[kPrimes.size()]);
  }
  public static int puzzle(long s) {
      // your code
      int countPrimes = 0;
      for(long a=2;a<s;a++){
        //System.out.println("    -> "+a+" ?isPrime :"+isPrime(a));
        if(isPrime(a) && s%a==0) countPrimes++;
        if(a*a == s) countPrimes++;
      }
      return countPrimes;
  }

  public static boolean isPrime(long a){
    if(a==2 || a==1) return true;
    for(int i=2; i<=a/2; i++){
      if(a%i == 0) return false;
    }
    return true;
  }

  public static void main(String[] args){
    for(Long a: countKprimes(2, 0, 100))
      System.out.println(a);
  }
}