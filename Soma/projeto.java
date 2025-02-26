package Soma;
import java.util.Scanner;

public class projeto {
    public static void main(String[] args) {

        double num1 = 0;
        double num2 = 0;
        double opcao = 0;
        double total = 0;

        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite um numero: \n");

        num1 = Double.parseDouble(ler.nextLine());

        System.out.printf("Digite outro numero: \n");

        num2 = Double.parseDouble(ler.nextLine());

        System.out.printf(" 1 - somar; \n 2 - subtrair: \n");

        opcao = Double.parseDouble(ler.nextLine());

        ler.close();

        if (opcao == 1) {
            total = num1 + num2;
        } else if (opcao == 2) {
            total = num1 - num2;
        } else {
            System.out.printf("Opção inexistente, tente novamente");
        }

        System.out.println(total);
    }
    
}
