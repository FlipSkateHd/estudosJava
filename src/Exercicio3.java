import java.util.Scanner;
import static java.lang.Byte.parseByte;
import static java.lang.Integer.parseInt;


public class Exercicio3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int primeiroNum;
        int segundoNum;
        byte operacao = 0;

        while(operacao < 5){
            System.out.print("""
                    Selecione uma operação: \
                    
                     1- Adição\
                    
                     2- Subtração\
                    
                     3- Multiplicação\
                    
                     4- Divisão\
                    
                     5- Sair\
                    
                     >""");
             operacao = parseByte(leitor.nextLine());

             System.out.println("Insira seu primeiro valor:");
             primeiroNum = parseInt(leitor.nextLine());
             System.out.println("Insira seu primeiro valor:");
             segundoNum = parseInt(leitor.nextLine());

             System.out.println("Seu resultado é: ");
             switch (operacao) {
             case 1 -> System.out.print(primeiroNum + segundoNum + "\n");
             case 2 -> System.out.print(primeiroNum - segundoNum + "\n");
             case 3 -> System.out.print(primeiroNum * segundoNum + "\n");
             case 4 -> System.out.print(primeiroNum / segundoNum + "\n");
             }

        }
        leitor.close();
    }
}