import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a base:");
        double base = ler.nextDouble();
        System.out.println("Digite o expoente:");
        int expoente = ler.nextInt();

        double resultado = calcularPotencia(base, expoente);
        System.out.println("O resultado é: " + resultado);
        ler.close();
    }

    public static double calcularPotencia(double base, int expoente) {
        return Math.pow(base, expoente);
    }
}