package listaExercicios3;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor do salário mínimo (em R$): ");
        double salarioMinimo = leitor.nextDouble();

        System.out.print("Informe o seu salário atual (em R$): ");
        double salarioPessoa = leitor.nextDouble();

        double quantidadeSalarios = salarioPessoa / salarioMinimo;

        System.out.printf("Você recebe aproximadamente %.2f salários mínimos.\n", quantidadeSalarios);

        leitor.close();
    }
}
