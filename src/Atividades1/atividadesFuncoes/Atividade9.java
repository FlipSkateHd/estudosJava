package Atividades1.atividadesFuncoes;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = ler.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = ler.nextInt();

        int soma = somar(num1, num2);
        System.out.println("A soma é: " + soma);
        ler.close();
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}