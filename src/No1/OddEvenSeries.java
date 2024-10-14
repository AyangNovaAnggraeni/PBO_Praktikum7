package No1;

public class OddEvenSeries {
    public void calculateOddEvenSeries() {
        int sumOdd = 0;
        int sumEven = 0;
        int i = 1;

        System.out.println("Deret Bilangan Genap:");
        while (i < 20) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sumEven += i;
            }
            i++;
        }
        System.out.println("\nJumlah Bilangan Genap: " + sumEven);

        i = 1; 

        System.out.println("\nDeret Bilangan Ganjil:");
        while (i < 20) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sumOdd += i;
            }
            i++;
        }
        System.out.println("\nJumlah Bilangan Ganjil: " + sumOdd);
    }
}




