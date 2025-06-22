package listaExercicios1;

import java.util.Scanner;

import static java.lang.Byte.parseByte;
import static java.lang.Integer.parseInt;


public class Exercicio8 {


    public static double calcularAreaCirculo(double raio) {  // Função Área circulo
        return Math.PI * raio * raio;
    }

    public static double calcularAreaTriangulo(double base, double altura) { // Função Área Triângulo
        return (base * altura / 2);
    }

    public static double calcularAreaRetangulo(double base, double altura){return  base * altura;}

    public static void main(String[] args) {
        byte operacao = 0;
        Scanner leitor = new Scanner(System.in);

        while(operacao < 5){
            System.out.print("""
                    Selecione uma operação: \
                    
                     1- Área do círculo\
                    
                     2- Área do quadrado\
                    
                     3- Área do retângulo\
                    
                     4- Área do triângulo\
                    
                     5- Sair\
                    
                     >""");
            operacao = parseByte(leitor.nextLine());

            switch (operacao) {
                case 1 -> {
                    // Cálculo da área do círculo
                    System.out.print("Digite o raio do círculo (cm): ");
                    double raio = Double.parseDouble(leitor.nextLine());

                    double areaCirculo = calcularAreaCirculo(raio);
                    System.out.printf("A área do círculo é: %.2f cm²\n", areaCirculo);


                }
                case 2 -> {
                    // Cálculo da área do quadrado
                    System.out.print("Digite a base do quadrado (cm): ");
                    double base = Double.parseDouble(leitor.nextLine());
                    System.out.print("Digite a altura do quadrado (cm): ");
                    double altura = Double.parseDouble(leitor.nextLine());

                    double areaQuadrado = calcularAreaRetangulo(base,altura);
                    System.out.printf("A área do quadrado é: %.2f cm²\n", areaQuadrado);
                }
                case 3 -> {
                    // Cálculo da área do retângulo
                    System.out.print("Digite a base do retângulo (cm): ");
                    double base = Double.parseDouble(leitor.nextLine());
                    System.out.print("Digite a altura do retângulo (cm): ");
                    double altura = Double.parseDouble(leitor.nextLine());

                    double areaRetangulo = calcularAreaRetangulo(base,altura);
                    System.out.printf("A área do retângulo é: %.2f cm²\n", areaRetangulo);
                }
                case 4 -> {
                    // Cálculo da área do triângulo
                    System.out.print("Digite a base do triangulo (cm): ");
                    double base = Double.parseDouble(leitor.nextLine());
                    System.out.print("Digite a altura do triangulo (cm): ");
                    double altura = Double.parseDouble(leitor.nextLine());

                    double areaTriangulo = calcularAreaTriangulo(base,altura);
                    System.out.printf("A área do triangulo é: %.2f cm²\n", areaTriangulo);

                }

                case 5 -> System.out.print("Saindo...");

                default -> System.out.println("Erro! tente novamente.");
                }
            }

        leitor.close();
    }
}
