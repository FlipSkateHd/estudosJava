package listaExercicios2;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Byte.parseByte;
import static java.lang.Integer.parseInt;


public class Exercicio8 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();
        int jogador;
        int computador;
        int pontosComputador = 0;
        int pontosJogador = 0;
        byte escolha = 0;

        System.out.println("Vamos jogar pedra, papel e tesoura!");
        while(escolha != 2){

            System.out.print("""
                    Menu: \
                   
                     1- Jogar\
                    
                     2- Sair\
                    
                     >""");


            escolha = parseByte(leitor.nextLine());

            if (escolha == 1) {


                System.out.println("Jogador: " + pontosJogador + " Computador: " + pontosComputador);
                System.out.println("""
                        Faça sua escolha \
                        1- Pedra \
                        2- Papel \
                        3- Tesoura""");
                jogador = parseInt(leitor.nextLine());
                computador = random.nextInt(1,3);

                System.out.println(computador);

                if(jogador == computador){
                    System.out.println("Empate! Vamos jogar de novo...");

                    /*Possibilidades do jogador perder*/
                } else if ((jogador == 1 && computador == 2) || (jogador == 2 && computador == 3) || (jogador == 3 && computador == 1)){
                    System.out.println("Você perdeu! ");
                    pontosComputador++;

                    /*Possibilidades do computador perder*/
                } else if ((jogador == 2 && computador == 1) || (jogador == 3 && computador == 2) || (jogador == 1 && computador == 3)) {
                    System.out.println("Você ganhou! ");
                    pontosJogador++;
                }
            }
        }
        System.out.println("Saindo...");
        leitor.close();
    }
}