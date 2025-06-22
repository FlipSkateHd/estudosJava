package listaExercicios1;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Exercicio4 {
    public static void main(String[] args) {
        int numero = 1;
        ArrayList<Integer> par  = new ArrayList<>();
        ArrayList<Integer> impar  = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);
        for (int i=0; i < 10;i++){
             System.out.print("Insira um número: ");
             numero = parseInt(leitor.nextLine());
             if (numero % 2 == 0){
                 par.add(numero);
             } else {
                impar.add(numero);
             }

        }
        System.out.println("Quantidade de números pares: " + par.size()
                + "\n Quantidade de números ímpares: " + impar.size());

        leitor.close();
    }
}