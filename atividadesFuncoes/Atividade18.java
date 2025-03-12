import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");
        int tamanho = ler.nextInt();
        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = ler.nextInt();
        }

        int soma = somarElementos(array);
        System.out.println("A soma dos elementos é: " + soma);
        ler.close();
    }

    public static int somarElementos(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma;
    }
}