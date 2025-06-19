package Atividades1.calculos;

import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {

        double raio = 0;
        double total = 0;

        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite o raio do circulo (cm): \n");

        raio = Double.parseDouble(ler.nextLine());

        ler.close();

        total = (Math.PI * raio * raio);
        System.out.println(total + "cm");
    }
    
}
