package listaExercicios2;

import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Exercicio1 {
    public static void main(String[] args) {
        int idade;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira a idade: ");
        idade = parseInt(leitor.nextLine());

        if (idade <= 12){
            System.out.println("Criança");

        } else if (idade <= 17){
            System.out.println("Adolescente");

        } else if (idade <= 64){
            System.out.println("Adulto");

        } else if (idade >= 64) {
            System.out.println("Idoso");

        } else {
            System.out.println("Erro ao processar, sem resultados");
        }


        leitor.close();
    }
}