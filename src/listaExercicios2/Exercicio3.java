package listaExercicios2;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Exercicio3 {
    public static void main(String[] args) {
        int comeco;
        int fim;
        ArrayList<Integer> primos  = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira um número do começo: ");
        comeco = parseInt(leitor.nextLine());

        System.out.print("Insira um número do final: ");
        fim = parseInt(leitor.nextLine());

        for (; comeco < fim ; comeco ++){

             if (comeco != 1 && (comeco == 2 || comeco == 3 || comeco == 5 || comeco == 7 || (comeco % 2 != 0 && comeco % 3 != 0 && comeco % 5 != 0 && comeco % 7 != 0 ) )){
                 primos.add(comeco);
             }

        }
        System.out.println("números primos: " + primos);

        leitor.close();
    }
}