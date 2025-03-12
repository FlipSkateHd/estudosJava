import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = ler.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = ler.nextInt();
        System.out.println("Digite o terceiro número:");
        int num3 = ler.nextInt();

        int maior = encontrarMaior(num1, num2, num3);
        System.out.println("O maior número é: " + maior);
        ler.close();
    }

    public static int encontrarMaior(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}