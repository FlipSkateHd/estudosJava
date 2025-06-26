package listaExercicios3;

import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] args) {
        Double notas = 0.0;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Insira sua nota " + i + "(use , se precisar): ");
            notas = notas + leitor.nextDouble();
        }
        notas = notas/3;
        if (notas <= 5.0){
            System.out.printf("Reprovado, sua média é: %.2f", notas);
        } else if (notas > 5 && notas < 7){
            System.out.printf("Recuperação, sua média é: %.2f", notas);
        } else if (notas >= 7){
            System.out.printf("Aprovado, sua média é: %.2f", notas);
        }

        leitor.close();
    }
}