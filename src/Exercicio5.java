import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Exercicio5 {
    public static void main(String[] args) {
        int ano = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um ano: ");
        ano = parseInt(leitor.nextLine());
        boolean bissexto = ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0 ? true : false;
        if (bissexto) {
            System.out.println("O ano é bissexto.");

        } else {
            System.out.println("O ano não é bissexto.");

        }
        leitor.close();
    }
}