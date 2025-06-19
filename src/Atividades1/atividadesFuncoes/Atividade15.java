package Atividades1.atividadesFuncoes;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String str = ler.nextLine();

        String reversa = reverterString(str);
        System.out.println("A string invertida é: " + reversa);
        ler.close();
    }

    public static String reverterString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}