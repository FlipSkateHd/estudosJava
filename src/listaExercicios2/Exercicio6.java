package listaExercicios2;

import java.util.Scanner;

import static java.lang.Byte.parseByte;
import static java.lang.Integer.parseInt;


public class Exercicio6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroTabuada;
        byte escolha = 0;

        while(escolha < 2){
            System.out.print("""
                    Menu: \
                   
                     1- Ver tabuada\
                    
                     2- Sair\
                    
                     >""");
             escolha = parseByte(leitor.nextLine());

             if (escolha == 1) {
                 System.out.println("Insira seu número:");
                 numeroTabuada = parseInt(leitor.nextLine());

                 for (int i = 0; i <= 10; i++) {
                     System.out.println(numeroTabuada + " * " + i + " = " + numeroTabuada * i + "\n");
                 }
             }



        }
        System.out.println("Saindo...");
        leitor.close();
    }
}