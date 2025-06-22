package listaExercicios2;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Exercicio2 {
    public static void main(String[] args) {

        String senha = "abc";
        String tentativa;

        Scanner leitor = new Scanner(System.in);

        for (int i = 2; i >= 0; i--) {
            System.out.println("Digite sua senha");
            tentativa = leitor.nextLine();
            if (tentativa.equals(senha)){
                System.out.println("Senha correta!");
                break;
            }
                System.out.println("Erro!" + "Você tem " + i + " tentativas restantes");

        }

        leitor.close();
    }
}