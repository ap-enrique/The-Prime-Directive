public class Main {
    public static void main(String[] args) throws Exception {
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        PrimeDirective pd = new PrimeDirective();
        System.out.println(pd.isPrime(8));
        System.out.println(pd.onlyPrimes(numbers));
        ;
    }
}
