package listaExercicios3;

import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Exercicio7 {
    public static void main(String[] args) {
        int peso = 0;
        int altura = 0;
        int imc;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira seu peso: ");
        peso = parseInt(leitor.nextLine());
        System.out.println("Insira sua altura");
        altura = parseInt(leitor.nextLine());

        imc = peso / (altura * altura);

        if (imc < 22){
            System.out.println("IMC abaixo do normal ");

        } else if (imc >= 22 && imc < 27){
            System.out.println("IMC dentro do normal");

        } else if (imc >= 27 && imc < 29){
            System.out.println("IMC aponta sobrepeso");

        } else if (imc >= 30) {
            System.out.println("IMC aponta obesidade");

        } else {
            System.out.println("Erro ao processar, sem resultados");
        }


        leitor.close();
    }
}