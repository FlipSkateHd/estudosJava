package Atividades1.calculos;

import java.util.Scanner;

public class CalculosGeometricos {

    public static double calcularHipotenusa(double cateto1, double cateto2) { // Função Hiportenusa
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }



    public static double calcularAreaCirculo(double raio) {  // Função Área circulo
        return Math.PI * raio * raio;
    }



    public static double calcularAreaTriangulo(double base, double altura) { // Função Área Triângulo
        return (base * altura / 2);
    }

    

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String opcao = "";

            // menu de opções
            System.out.println("\nEscolha uma opção:");
            System.out.println("H - Calcular hipotenusa");
            System.out.println("C - Calcular área do círculo");
            System.out.println("T - Calcular área do triangulo");
            System.out.print("Opção: ");
            opcao = ler.nextLine();

            switch (opcao) {
                case "H":
                    // Cálculo da hipotenusa
                    System.out.print("Digite o valor do cateto a (cm): ");
                    double cateto1 = Double.parseDouble(ler.nextLine());
                    System.out.print("Digite o valor do cateto b (cm): ");
                    double cateto2 = Double.parseDouble(ler.nextLine());

                    double hipotenusa = calcularHipotenusa(cateto1, cateto2);
                    System.out.printf("A hipotenusa é: %.2f cm²\n", hipotenusa);
                    break;

                case "C":
                    // Cálculo da área do círculo
                    System.out.print("Digite o raio do círculo (cm): ");
                    double raio = Double.parseDouble(ler.nextLine());

                    double areaCirculo = calcularAreaCirculo(raio);
                    System.out.printf("A área do círculo é: %.2f cm²\n", areaCirculo);
                    break;

                case "T":
                    // Cálculo da área do círculo
                    System.out.print("Digite a base do triangulo (cm): ");
                    double base = Double.parseDouble(ler.nextLine());
                    System.out.print("Digite a altura do triangulo (cm): ");
                    double altura = Double.parseDouble(ler.nextLine());

                    double areaTriangulo = calcularAreaTriangulo(base,altura);
                    System.out.printf("A área do triangulo é: %.2f cm²\n", areaTriangulo);
                    break;


                default:
                    // Opção inválida
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        ler.close();
    }
}