package listaExercicios3;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Exercicio2 {


    public static void main(String[] args) {
        ArrayList<Double> precosLivros = new ArrayList<>();
        double precoFinal = 0;
        int quantidadeLivros = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos livros você quer comprar?");
        quantidadeLivros = leitor.nextInt();

        for (int i = 0; i < quantidadeLivros ; i++) {
            System.out.println("Qual o valor do livro " + i + "? (use , para centavos)");
            precosLivros.add(i, leitor.nextDouble());
            precoFinal += precosLivros.get(i);
        }
        if (quantidadeLivros >= 3){
            System.out.println("Preços dos livros comprados: "+ precosLivros);
            System.out.println("Preço final, sem desconto: "+precoFinal + "R$");
            precoFinal = precoFinal - (0.15 * precoFinal)  ;
            System.out.println("Preço novo, com o desconto de 15%: "+precoFinal + "R$");

        } else {
            System.out.println("Preço final, sem desconto: "+precoFinal + "R$");
        }

        leitor.close();
    }
}