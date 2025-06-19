package Atividades1.atividadesFuncoes;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = ler.nextLine();

        int vogais = contarVogais(frase);
        System.out.println("A frase contém " + vogais + " vogais.");
        ler.close();
    }

    public static int contarVogais(String frase) {
        int contador = 0;
        for (char c : frase.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
}