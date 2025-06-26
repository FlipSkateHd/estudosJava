package listaExercicios2;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Exercicio5 {

    /* Fibonacci: do terceiro termo em diante, cada novo é a soma dos dois anteriores.  */

    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int primeirosValores;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um número do final: ");
        primeirosValores = parseInt(leitor.nextLine());


        for (int i =0 ; i < primeirosValores ; i++) {
            if (i > 1){  // a partir do i = 2, começa a regra
                fibonacci.add(i,fibonacci.get(i - 1) + fibonacci.get(i - 2));
            } else {
                fibonacci.add(i,i);
            }
        }
        System.out.println(fibonacci);
        leitor.close();
    }
}