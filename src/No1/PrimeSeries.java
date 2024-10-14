package No1;

public class PrimeSeries {
     public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void calculateSeries() {
        int sumPrime = 0;
        int sumNonPrime = 0;

        System.out.println("Deret Bilangan Prima:");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                sumPrime += i;
            }
        }
        System.out.println("\nJumlah Bilangan Prima: " + sumPrime);
    }
}

