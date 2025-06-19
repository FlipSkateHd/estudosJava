import java.util.Scanner;

public class LereImprimir {
    public static void main(String[] args) {

        String nome = "";

        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite um nome: ");

        nome = ler.nextLine();

        ler.close();

        System.out.println("Você digitou: "+ nome);
    }
    
}
