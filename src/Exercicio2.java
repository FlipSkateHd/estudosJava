import java.util.Scanner;
import static java.lang.Integer.parseInt;


public class Exercicio2 {
    public static void main(String[] args) {
        int numero = 1;
        Scanner leitor = new Scanner(System.in);
        while(numero > 0){
            System.out.print("Insira um número: ");
             numero = parseInt(leitor.nextLine());
        }
        leitor.close();
    }
}