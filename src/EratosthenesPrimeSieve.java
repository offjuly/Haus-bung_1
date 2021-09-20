import java.util.Scanner;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private int oberGraenze;


    public EratosthenesPrimeSieve(int oberGraenze) {
        this.oberGraenze = oberGraenze;
    }

    public boolean isPrime(int p) {
        boolean[] array = new boolean[oberGraenze];

        for (int i = 0; i < array.length; i++) {
            array[i] = true;
        }
        for (int i = 2; i < array.length; i++) {
            for (int j = 2; j < array.length; j++) {
                array[i * j] = false;
            }

        }
        return false;
    }
       /* for (int i = 2; i < p; i++){
            if (p%i == 0){
                return false;
            }
        }
        return true;
    }*/

    public void printPrimes() {
        Scanner scanner = new Scanner(System.in);

        int oberGraenze = scanner.nextInt();

        for (int i = 2; i < oberGraenze; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}