package listaExercicios2;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Byte.parseByte;
import static java.lang.Integer.parseInt;


public class Exercicio8 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();
        int jogador = 0;
        int computador = random.nextInt(1,100);
        byte escolha = 0;

        System.out.println("Vamos jogar pedra, papel e tesoura!");
        while(escolha != 2){

            System.out.print("""
                    Menu: \
                   
                     1- Jogar\
                    
                     2- Sair\
                    
                     >""");
            escolha = parseByte(leitor.nextLine());

            System.out.println("1: ");
            jogador = parseInt(leitor.nextLine());

            if(jogador > computador){
              System.out.println("Seu chute foi maior que o número que pensei.");
            } else if(jogador < computador){
                System.out.println("Seu chute foi menor que o número que pensei.");
            } else {
                System.out.println("Erro! Insira seu próximo chute.");
            }

        }
        System.out.println("Você venceu!");
        leitor.close();
    }
}