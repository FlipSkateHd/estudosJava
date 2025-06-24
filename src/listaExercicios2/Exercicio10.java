package listaExercicios2;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Byte.parseByte;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


public class Exercicio10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valorMonetario = 0.00;
        byte escolha = 0;

        System.out.println("Iniciando conversor de moedas...");
        while(escolha != 4){

            System.out.print("""
                    Menu: \
                    \s
                     1- Converter Real para Dólar\
                    \s
                     2- Converter Real para Euros\
                    \s
                     3- Converter Euros para Libras \
                    \s
                     4- Sair
                     >""");
            escolha = leitor.nextByte();
            if (escolha == 4){
                break;
            }

            System.out.println("Insira seu valor monetário (BRL): ");
            valorMonetario = leitor.nextDouble();

            switch (escolha){
                case 1 -> System.out.println(valorMonetario * 0.20 + " $");
                case 2 -> System.out.println(valorMonetario * 0.18 + " €");
                case 3 -> System.out.println(valorMonetario * 0.16 + " £");
            }




        }
        System.out.println("Saindo...");
        leitor.close();
    }
}