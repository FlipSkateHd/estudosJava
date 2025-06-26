package listaExercicios3;

import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {
        double salario = 0.0;
        double pisoSalarial = 0.0;
        Scanner leitor = new Scanner(System.in);


        System.out.print("Insira o piso salarial da sua categoria em R$ (use , se precisar): ");
        pisoSalarial = leitor.nextDouble();

        System.out.print("Insira seu salario em R$ (use , se precisar): ");
        salario = leitor.nextDouble();


        if (salario == pisoSalarial){
            System.out.printf("Seu salário é o mesmo do piso,  %.2f", salario, "R$");
        } else if (salario > pisoSalarial) {
            System.out.printf("Seu salário está acima do piso,  %.2f", salario, "R$");
        } else if (salario < pisoSalarial){
            System.out.printf("Seu salário está abaixo do piso,  %.2f", salario, "R$");
        }

        leitor.close();
    }
}