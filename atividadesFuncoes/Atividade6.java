import java.util.Scanner;
import java.util.Random;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Quantas vezes você quer lançar a moeda?");
        int n = ler.nextInt();

        int caras = 0;
        int coroas = 0;

        for (int i = 0; i < n; i++) {
            int resultado = rand.nextInt(2);
            if (resultado == 0) {
                caras++;
            } else {
                coroas++;
            }
        }

        System.out.println("Caras: " + caras + " (" + (caras * 100.0 / n) + "%)");
        System.out.println("Coroas: " + coroas + " (" + (coroas * 100.0 / n) + "%)");
        ler.close();
    }
}