package Atividades1.atividadesFuncoes;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = ler.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = ler.nextDouble();
        System.out.println("Digite o operador (+, -, *, /):");
        char operador = ler.next().charAt(0);

        double resultado = calcular(num1, num2, operador);
        System.out.println("O resultado é: " + resultado);
        ler.close();
    }

    public static double calcular(double a, double b, char operador) {
        switch (operador) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: throw new IllegalArgumentException("Operador inválido");
        }
    }
}