import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo:");
        double lado1 = ler.nextDouble();
        System.out.println("Digite o segundo lado do triângulo:");
        double lado2 = ler.nextDouble();
        System.out.println("Digite o terceiro lado do triângulo:");
        double lado3 = ler.nextDouble();

        if (verificarTriangulo(lado1, lado2, lado3)) {
            System.out.println("O triângulo existe.");
        } else {
            System.out.println("O triângulo não existe.");
        }
        ler.close();
    }

    public static boolean verificarTriangulo(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}