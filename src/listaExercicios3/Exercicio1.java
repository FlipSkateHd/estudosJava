package listaExercicios3;

import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Exercicio1 {


    public static void main(String[] args) {
        int horasSemanais = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Calculadora de média de horas de estudo");
        for (int i = 0; i < 4 ; i++) {
            System.out.print("Quantas horas você estudou nesta semana? : ");
            horasSemanais = horasSemanais + parseInt(leitor.nextLine());

        }
        horasSemanais = horasSemanais / (7 * 4) ;
        System.out.println("Você estudou em média: " + horasSemanais + "Horas por semana neste mês." );

        leitor.close();
    }
}