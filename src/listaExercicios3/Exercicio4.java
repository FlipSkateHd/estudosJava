package listaExercicios3;


import java.util.ArrayList;
import java.util.Scanner;




public class Exercicio4 {




    public static void main(String[] args) {
        ArrayList<Double> precosIndividuais = new ArrayList<>();
        double precoFinal = 0;
        int quantidadePessoas = 0;
        Scanner leitor = new Scanner(System.in);


        System.out.println("Quantas pessoas ficarão hospedadas?");
        quantidadePessoas = leitor.nextInt();


        for (int i = 0; i < quantidadePessoas ; i++) {
            System.out.println("A pessoa " + i +" vai querer café diário? (15R$) \n 1- sim \n 2- não");
            if (leitor.nextInt() == 1 ) {
                precosIndividuais.add(i, 295.0);
            } else {
                precosIndividuais.add(i, 280.0);
            }
            precoFinal += precosIndividuais.get(i);
        }
        System.out.println("Preço total: " + precoFinal + "R$");
        leitor.close();
    }
}
