package listaExercicios1;

import java.util.Scanner;
import static java.lang.Integer.parseInt;


public class Exercicio1 {
    public static void main(String[] args) {
        System.out.print("Insira um número: ");
            Scanner leitor = new Scanner(System.in);
            int numero = parseInt(leitor.nextLine());

            if(numero > 0){
            System.out.println("O número é positivo e maior que zero.");
        } else if (numero < 0 ){
                System.out.println("O número é negativo");
            } else {
                System.out.println("O número é zero");
            }
    }
}