import java.util.ArrayList;
import java.util.Scanner;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private int oberGraenze;


    public EratosthenesPrimeSieve(int oberGraenze) {
        this.oberGraenze = oberGraenze;
    }

    public boolean isPrime(int p) {
        boolean[] array = new boolean[oberGraenze];


            return false;
        }



    public void printPrimes() {
        int n = 20;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        boolean[] isPrime = new boolean[n];
        for (int i=2; i<n; i++)
            isPrime[i]=true;
        for (int i=2; i<n; i++)
            if (isPrime[i])
            {
                primes.add(i);
                for (int j=i*i; j<n; j+=i)
                    isPrime[j]=false;
            }
        for(int i=2; i<primes.size(); i++) {
            System.out.println(primes.get(i));
        }
    }
}