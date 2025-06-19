package Atividades1.atividadesFuncoes;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) { 

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o tamanho do cateto adjacente (cm)");
        double cateto1 = ler.nextDouble();
        System.out.println("Qual o tamanho do cateto oposto (cm)");
        double cateto2 = ler.nextDouble();
        double hipo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)); 
        System.out.println("A hipotenusa é de: " +  hipo);
        ler.close();

    }
}