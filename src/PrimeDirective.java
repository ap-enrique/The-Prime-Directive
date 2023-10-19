import java.util.ArrayList;;

public class PrimeDirective {
    public PrimeDirective() {

    }

    public boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
          if (number % i == 0) {
            return false;
          }
        }
        return true;
        }
    
    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        
        return primes;
    }
}
