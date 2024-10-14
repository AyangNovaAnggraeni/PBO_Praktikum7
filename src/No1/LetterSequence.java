package No1;

public class LetterSequence {
    public void displayZtoA() {
        char letter = 'Z';

        System.out.println("Huruf Z hingga A:");
        do {
            System.out.print(letter + "  ");
            letter--;
        } while (letter >= 'A');
    }
}



