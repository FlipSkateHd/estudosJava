import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = ler.nextInt();

        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + fatorial);
        ler.close();
    }

    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}