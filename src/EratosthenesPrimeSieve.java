import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private int p;

    public EratosthenesPrimeSieve(int p)
    {
        this.p = p;
    }

    @Override
    public boolean isPrime(int p) {
        boolean isprime= true;
        for(int i = p-1;i>1;i--)
            if(p%i==0)
            {
                isprime = false;
            }

        return isprime;
    }

    @Override
    public void printPrimes() {
        ArrayList<Integer> primes= primesBonus(p);
        for(int i=0; i< primes.size(); i++) {
            System.out.println(primes.get(i));
        }
    }
    public void beispiel2Bonus(int oGrenze)
    {
        ArrayList<Integer> primes= primesBonus(oGrenze);

        int x = primes.get(0);
        int y = primes.get(0);
        int z = primes.get(0);
        for (int i = 4; i<=oGrenze; i+=2)
        {
                for(int j = 0; j<primes.size(); j++) {
                    for(int k = 0;k<primes.size(); k++) {
                        for(int h = 0;h<primes.size(); h++) {
                            if (i == x + y + z) {
                                System.out.println(i + " summe: " + i + " = " + x + " + " + y + " + "+z);
                                break;
                            }
                            z = primes.get(h);
                        }
                        x = primes.get(k);
                    }
                    y = primes.get(j);
                }
        }
    }
    public void beispiel2(int oGrenze)
    {
        ArrayList<Integer> primes= primesBonus(oGrenze);

        int x = primes.get(0);
        int y = primes.get(0);
        boolean stop = false;
        for (int i = 4; i<=oGrenze; i+=2)
        {
            for(int j = 0; j<primes.size()&&!stop; j++) {
                for(int k = 0;k<primes.size(); k++) {
                    if(i==x+y)
                    {
                        System.out.println(i+" summe: "+i +" = "+x+" + "+y);
                        stop = true;
                        break;

                    }
                    x = primes.get(k);
                }
                y = primes.get(j);
            }
            stop = false;
        }
    }
    public static ArrayList<Integer> primesBonus(int p) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        boolean[] isprime = new boolean[p];
        for (int i = 2; i < isprime.length; i++)
            isprime[i] = true;

        for (int i = 2; i < isprime.length; i++)
            if (isprime[i]) {
                primes.add(i);
                for (int j = i * i; j < isprime.length; j += i)
                    isprime[j] = false;
            }
        return primes;

    }
}//f