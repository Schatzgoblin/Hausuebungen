public class Main {
    public static void main(String[] args) {
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve(10);
        System.out.println(e.isPrime(100));
        e.printPrimes();
        //e.beispiel2(50);
        e.beispiel2Bonus(50);
    }
}
