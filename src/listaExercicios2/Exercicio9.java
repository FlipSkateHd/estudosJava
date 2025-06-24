package listaExercicios2;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Byte.parseByte;
import static java.lang.Integer.parseInt;


public class Exercicio9 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();
        int jogador;
        boolean par = false;
        int computador;
        byte escolha = 0;

        System.out.println("Vamos jogar par ou ímpar!");
        while(escolha != 2){

            System.out.print("""
                    Menu: \
                   
                     1- Jogar\
                    
                     2- Sair\
                    
                     >""");
            escolha = parseByte(leitor.nextLine());

            if (escolha == 1) {

                System.out.println("Insira seu número: ");
                jogador = parseInt(leitor.nextLine());

                System.out.println("""
                        Faça sua escolha \
                        1- Par \
                        2- Ímpar""");

                par = parseInt(leitor.nextLine()) == 1;

                computador = random.nextInt(1,10);

                System.out.println( "Meu número foi: " + computador);

                if (par && (jogador + computador) % 2 == 0 ){
                    System.out.println("Você ganhou!");

                } else {
                    System.out.println("Você perdeu!");
                }

            }
        }
        System.out.println("Saindo...");
        leitor.close();
    }
}