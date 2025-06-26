package listaExercicios3;

import java.util.Scanner;


public class Exercicio3 {


    public static void main(String[] args) {
        double combustivelGasto = 0;
        double quilometrosRodados = 0;
        Scanner leitor = new Scanner(System.in);


        System.out.println("Quantos quilômetros você rodou?");
        quilometrosRodados = leitor.nextDouble();

        System.out.println("Quantos litros de gasolina foram gastos");
        combustivelGasto = leitor.nextDouble();

        System.out.println("o rendimento do seu carro é de " + quilometrosRodados/combustivelGasto + "Km/Litro ");
        leitor.close();
    }
}