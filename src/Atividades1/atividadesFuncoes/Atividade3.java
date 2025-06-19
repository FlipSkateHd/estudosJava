package Atividades1.atividadesFuncoes;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double a = ler.nextDouble();
        System.out.println("Digite o valor de b:");
        double b = ler.nextDouble();
        System.out.println("Digite o valor de c:");
        double c = ler.nextDouble();

        double delta = calcularDelta(a, b, c);
        System.out.println("O valor de delta é: " + delta);

        if (delta >= 0) {
            double x1 = calcularX1(a, b, delta);
            double x2 = calcularX2(a, b, delta);
            System.out.println("O valor de x1 é: " + x1);
            System.out.println("O valor de x2 é: " + x2);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }
        ler.close();
    }

    public static double calcularDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static double calcularX1(double a, double b, double delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public static double calcularX2(double a, double b, double delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}