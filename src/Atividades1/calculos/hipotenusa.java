package Atividades1.calculos;

import java.util.Scanner;

public class hipotenusa {
    public static void main(String[] args) {


        
        // HIPOTENUSA
        double cateto1 = 0;
        double cateto2 = 0;
        double hipotenusa = 0;

        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite o valor do cateto a (cm): \n");
        cateto1 = Double.parseDouble(ler.nextLine());
        System.out.printf("Digite o valor do cateto a (cm): \n");
        cateto2 = Double.parseDouble(ler.nextLine());
        ler.close();
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.print(hipotenusa + "(cm)");

        

    }
    
}
