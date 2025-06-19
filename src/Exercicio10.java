import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Integer.parseInt;


public class Exercicio10 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[3];

        Scanner leitor = new Scanner(System.in);

        for (int i =0; i < numeros.length ; i++){
            System.out.println("insira um número: ");
            numeros[i] = parseInt(leitor.nextLine());
        }


        System.out.println("Lista original:" + Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Lista organizada" + Arrays.toString(numeros));

        leitor.close();
    }
}