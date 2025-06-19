package Atividades1.atividadesFuncoes;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = ler.nextInt();

        if (verificarParImpar(numero) == 1) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        ler.close();
    }

    public static int verificarParImpar(int numero) {
        return numero % 2 == 0 ? 1 : 0;
    }
}