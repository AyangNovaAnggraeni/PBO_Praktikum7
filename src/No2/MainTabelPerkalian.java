package No2;

import java.util.Scanner;

public class MainTabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = input.nextInt();
       
        TabelPerkalian tabel = new TabelPerkalian(n);
      
        tabel.tampilkanTabel();
        
        input.close();
    }
}

