package No2;

public class TabelPerkalian {
    private int n;

    public TabelPerkalian(int n) {
        if (n <= 10) {
            this.n = n;
        } else {
            System.out.println("Nilai n tidak boleh lebih dari 10.");
            this.n = 10;  
        }
    }

    public void tampilkanTabel() {
        System.out.println("Tabel Perkalian " + n + " x " + n + ":");
        
        printHorizontalLine(n);
        
        for (int i = 1; i <= n; i++) {
            System.out.print("|");
            for (int j = 1; j <= n; j++) {
                System.out.printf(" %3d |",i * j);  
            }
            System.out.println(); 
            
            printHorizontalLine(n);
        }
    }
    
    private void printHorizontalLine(int n) {
        System.out.print("+");
        for (int i = 1; i <= n; i++) {
            System.out.print("-----+"); 
        }
        System.out.println();
    }
}




