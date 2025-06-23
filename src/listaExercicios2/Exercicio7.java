package listaExercicios2;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Byte.parseByte;
import static java.lang.Integer.parseInt;


public class Exercicio7 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();
        int chute = 0;
        int escolha = random.nextInt(1,100);

        System.out.println("Eu pensei em um número, e direi somente se ele é maior ou menor que seu chute... Quero ver adivinhar.");
        while(escolha != chute){
            System.out.println("Insira seu chute: ");
            chute = parseInt(leitor.nextLine());

            if(chute > escolha){
              System.out.println("Seu chute foi maior que o número que pensei.");
            } else if(chute < escolha){
                System.out.println("Seu chute foi menor que o número que pensei.");
            } else {
                System.out.println("Erro! Insira seu próximo chute.");
            }

        }
        System.out.println("Você venceu!");
        leitor.close();
    }
}