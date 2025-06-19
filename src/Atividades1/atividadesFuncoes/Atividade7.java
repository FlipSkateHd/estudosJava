package Atividades1.atividadesFuncoes;

import java.util.Scanner;
import java.util.Random;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();

        int placarUsuario = 0;
        int placarComputador = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha 0 para par ou 1 para ímpar:");
            int escolhaUsuario = ler.nextInt();
            int numeroUsuario = rand.nextInt(11);
            int numeroComputador = rand.nextInt(11);

            int soma = numeroUsuario + numeroComputador;
            System.out.println("Você escolheu " + (escolhaUsuario == 0 ? "par" : "ímpar"));
            System.out.println("Você jogou " + numeroUsuario + " e o computador jogou " + numeroComputador);
            System.out.println("A soma é " + soma);

            if ((soma % 2) == escolhaUsuario) {
                System.out.println("Você ganhou!");
                placarUsuario++;
            } else {
                System.out.println("O computador ganhou!");
                placarComputador++;
            }

            System.out.println("Placar: Você " + placarUsuario + " x " + placarComputador + " Computador");
            System.out.println("Quer jogar novamente? (s/n)");
            continuar = ler.next().equalsIgnoreCase("s");
            ler.close();
        }
    }
}
