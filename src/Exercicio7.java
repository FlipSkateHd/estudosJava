import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Exercicio7 {
    public static void main(String[] args) {
        int nota = 0;
        char conceito;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira a nota (de 0 a 100): ");
        nota = parseInt(leitor.nextLine());
        /* A > 80 B<= 80 C >= 70  D >= 50  F > 25 */

        if (nota < 25){
            System.out.println("Nota: F");

        } else if (nota >= 50 && nota < 70){
            System.out.println("Nota D");

        } else if (nota >= 70 && nota < 80){
            System.out.println("Nota C");

        } else if (nota <= 80 && nota < 90) {
            System.out.println("Nota B");

        } else if (nota > 80 && nota < 100) {
            System.out.println("Nota A");

        } else {
            System.out.println("Erro ao processar, sem resultados");
        }


        leitor.close();
    }
}