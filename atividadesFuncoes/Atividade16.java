import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int a = ler.nextInt();
        System.out.println("Digite o segundo valor:");
        int b = ler.nextInt();

        System.out.println("Antes da troca: a = " + a + ", b = " + b);
        trocarValores(a, b);
        System.out.println("Depois da troca: a = " + b + ", b = " + a);
        ler.close();
    }

    public static void trocarValores(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}