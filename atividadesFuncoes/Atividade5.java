import java.util.Scanner;
import java.util.Random;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();

        int numeroSorteado = rand.nextInt(10) + 1;
        System.out.println("Tente adivinhar o número sorteado (1 a 10):");
        int palpite = ler.nextInt();

        if (palpite == numeroSorteado) {
            System.out.println("Parabéns! Você acertou.");
        } else {
            System.out.println("Que pena! O número sorteado era " + numeroSorteado);
        }
        ler.close();
    }
}