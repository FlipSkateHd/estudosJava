package Atividades1.atividadesFuncoes;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = ler.nextInt();

        int numeroInvertido = inverterNumero(numero);
        System.out.println("O número invertido é: " + numeroInvertido);
        ler.close();
    }

    public static int inverterNumero(int numero) {
        int invertido = 0;
        while (numero != 0) {
            invertido = invertido * 10 + numero % 10;
            numero = numero / 10;
        }
        return invertido;
    }
}