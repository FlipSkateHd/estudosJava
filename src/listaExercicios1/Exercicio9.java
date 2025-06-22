package listaExercicios1;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Exercicio9 {
    public static void main(String[] args) {
        int comeco;
        int fim = 0;
        ArrayList<Integer> par  = new ArrayList<>();
        ArrayList<Integer> impar  = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira um número do começo: ");
        comeco = parseInt(leitor.nextLine());

        System.out.print("Insira um número do final: ");
        fim = parseInt(leitor.nextLine());

        for (comeco = comeco; comeco < fim ;comeco ++){

             if (comeco % 2 == 0){
                 par.add(comeco);
             } else {
                impar.add(comeco);
             }

        }
        System.out.println("números pares: " + par
                + "\n números ímpares: " + impar);

        leitor.close();
    }
}