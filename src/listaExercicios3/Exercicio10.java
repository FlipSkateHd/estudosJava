package listaExercicios3;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do depósito (em R$): ");
        double deposito = leitor.nextDouble();

        System.out.print("Digite a taxa de juros (em %): ");
        double taxaJuros = leitor.nextDouble();

        double rendimento = deposito * (taxaJuros / 100);
        double total = deposito + rendimento;

        System.out.printf("Rendimento: R$ %.2f\n", rendimento);
        System.out.printf("Valor total após o rendimento: R$ %.2f\n", total);

        leitor.close();
    }
}
