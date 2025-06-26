package listaExercicios3;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Calculadora de fatorial\nInsira um número: ");
        int numero = leitor.nextInt();

        int fatorial = 1;

        // Multiplica os números de 1 até o número inserido
        for (int i = 1; i <= numero; i++) {
            System.out.println(fatorial + "*" + i);
            fatorial *= i;     // var fatorial recebe ela mesma multiplicada pelo i do atual laço
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        leitor.close();
    }
}
