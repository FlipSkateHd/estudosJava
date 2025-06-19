package Atividades1.atividadesFuncoes;

import java.util.Scanner;
import java.util.Random;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();

        int placarUsuario = 0;
        int placarComputador = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha 0 para Pedra, 1 para Papel ou 2 para Tesoura:");
            int escolhaUsuario = ler.nextInt();
            int escolhaComputador = rand.nextInt(3);

            System.out.println("Você escolheu " + opcao(escolhaUsuario) + " e o computador escolheu " + opcao(escolhaComputador));

            if (escolhaUsuario == escolhaComputador) {
                System.out.println("Empate!");
            } else if ((escolhaUsuario == 0 && escolhaComputador == 2) ||
                       (escolhaUsuario == 1 && escolhaComputador == 0) ||
                       (escolhaUsuario == 2 && escolhaComputador == 1)) {
                System.out.println("Você ganhou!");
                placarUsuario++;
            } else {
                System.out.println("O computador ganhou!");
                placarComputador++;
            }

            System.out.println("Placar: Você " + placarUsuario + " x " + placarComputador + " Computador");
            System.out.println("Quer jogar novamente? (s/n)");
            continuar = ler.next().equalsIgnoreCase("s");
        }
        ler.close();
    }

    public static String opcao(int escolha) {
        switch (escolha) {
            case 0: return "Pedra";
            case 1: return "Papel";
            case 2: return "Tesoura";
            default: return "Inválido";
        }
    }
}