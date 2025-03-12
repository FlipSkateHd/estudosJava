import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        //variavel que vai carregar o valor que a pessoa vai digitar no começo do código, se o valor for = 0 o programa termina.
        double resposta = 20; 

        Scanner ler = new Scanner(System.in);

        while(resposta != 0){
            //código em java para o programa esperar 2 segundos para continuar a executar.
            try{
            Thread.sleep(2000);
            } catch (InterruptedException e){
            } //Pergunta inicial para o usuário, será repitida até o usuário responder com 0.
            System.out.println();
            System.out.println("Escolha uma fórmula de 1 a 15");
            System.out.print("(1)Energia cinética, ");
            System.out.print("(2)Velocidade média, ");
            System.out.println("(3)Aceleração, ");
            System.out.print("(4)Força, ");
            System.out.print("(5)Velocidade final, ");
            System.out.println("(6)Fórmula da potência, ");
            System.out.print("(7)Potencial Gravitacional, ");
            System.out.print("(8)Densidade, ");
            System.out.println("(9)Pressão, ");
            System.out.print("(10)Quantidade de Movimento, ");
            System.out.print("(11)Lei de Ohm, ");
            System.out.println("(12)Frequência, ");
            System.out.print("(13)Comprimento da onda, ");
            System.out.print("(14)Amperagem, ");
            System.out.println("(15)Energia mecânica, ");
            System.out.println("(0)Sair do programa.");
            resposta = ler.nextDouble();
            
            switch((int)resposta){
                case 0:
                break;
                case 1:
                    //Fórmula da energia cinética: Ec = mv² / 2
                    System.out.print("Digite a massa (kg): ");
                    double massa = ler.nextDouble();
                    System.out.print("Digite a velocidade (m/s): ");
                    double velocidade = ler.nextDouble();
                    double ec = 0.5 * massa * Math.pow(velocidade, 2);
                    System.out.println("Energia Cinética: " + ec + " J");
                    break;
                case 2:
                    //Fórmula da velocidade média: Vm = ΔS / Δt
                    System.out.print("Digite a distância (m): ");
                    double distancia = ler.nextDouble();
                    System.out.print("Digite o tempo (s): "); 
                    double tempo = ler.nextDouble();
                    double vm = distancia / tempo; 
                    System.out.println("Velocidade média é de: " + vm + " m/s");               
                    break;
                case 3:
                    //Fórmula da aceleração média: acl = Δv / Δt
                    System.out.print("Digite a variação da velocidade (m/s): ");
                    double aceleraçãoVelocidade = ler.nextDouble();
                    System.out.print("Digite o tempo decorrido (s): "); 
                    double aceleracaoTempo = ler.nextDouble();
                    double acl = aceleraçãoVelocidade / aceleracaoTempo; 
                    System.out.println("A aceleração média é de: " + acl + " m/s²");
                    break;
                case 4:
                    // Fórmula da Força: F = m * a
                    System.out.print("Digite a massa (kg): ");
                    double massaForca = ler.nextDouble();
                    System.out.print("Digite a aceleração (m/s²): ");
                    double aceleracaoForca = ler.nextDouble();
                    double forca = massaForca * aceleracaoForca;
                    System.out.println("A Força é de: " + forca + " N");
                    break;
                case 5:
                    // Fórmula da Velocidade Final (MRUV): v = v0 + a * t
                    System.out.print("Digite a velocidade inicial (m/s): ");
                    double velocidadeInicial = ler.nextDouble();
                    System.out.print("Digite a aceleração (m/s²): ");
                    double aceleracaoMRUV = ler.nextDouble();
                    System.out.print("Digite o tempo (s): ");
                    double tempoMRUV = ler.nextDouble();
                    double velocidadeFinal = velocidadeInicial + (aceleracaoMRUV * tempoMRUV);
                    System.out.println("A Velocidade Final é de: " + velocidadeFinal + " m/s");
                    break;
                case 6:
                    // Fórmula da Potência: P = W / t
                    System.out.print("Digite o trabalho (J): ");
                    double trabalhoPotencia = ler.nextDouble();
                    System.out.print("Digite o tempo (s): ");
                    double tempoPotencia = ler.nextDouble();
                    double potencia = trabalhoPotencia / tempoPotencia;
                    System.out.println("A Potência é de: " + potencia + " W");
                    break;
                case 7:
                    // Fórmula da Energia Potencial Gravitacional: Ep = m * g * h
                    System.out.print("Digite a massa (kg): ");
                    double massaEP = ler.nextDouble();
                    System.out.print("Digite a altura (m): ");
                    double alturaEP = ler.nextDouble();
                    double g = 9.81; // Aceleração da gravidade
                    double energiaPotencial = massaEP * g * alturaEP;
                    System.out.println("A Energia Potencial Gravitacional é de: " + energiaPotencial + " J");
                    break;
                case 8:
                    // Fórmula da Densidade: ρ = m / V
                    System.out.print("Digite a massa (kg): ");
                    double massaDensidade = ler.nextDouble();
                    System.out.print("Digite o volume (m³): ");
                    double volumeDensidade = ler.nextDouble();
                    double densidade = massaDensidade / volumeDensidade;
                    System.out.println("A Densidade é de: " + densidade + " kg/m³");
                    break;
                case 9:
                    // Fórmula da Pressão: P = F / A
                    System.out.print("Digite a força (N): ");
                    double forcaPressao = ler.nextDouble();
                    System.out.print("Digite a área (m²): ");
                    double areaPressao = ler.nextDouble();
                    double pressao = forcaPressao / areaPressao;
                    System.out.println("A Pressão é de: " + pressao + " Pa");
                    break;
                case 10:
                    // Fórmula da Quantidade de Movimento: Q = m * v
                    System.out.print("Digite a massa (kg): ");
                    double massaQ = ler.nextDouble();
                    System.out.print("Digite a velocidade (m/s): ");
                    double velocidadeQ = ler.nextDouble();
                    double quantidadeMovimento = massaQ * velocidadeQ;
                    System.out.println("A Quantidade de Movimento é de: " + quantidadeMovimento + " kg·m/s");
                    break;
                case 11:
                    // Fórmula da Lei de Ohm: V = R * I
                    System.out.print("Digite a resistência (Ω): ");
                    double resistenciaOhm = ler.nextDouble();
                    System.out.print("Digite a corrente (A): ");
                    double correnteOhm = ler.nextDouble();
                    double tensaoOhm = resistenciaOhm * correnteOhm;
                    System.out.println("A Tensão é de: " + tensaoOhm + " V");
                    break;
                case 12:
                    // Fórmula da Frequência: f = 1 / T
                    System.out.print("Digite o período (s): ");
                    double periodoFrequencia = ler.nextDouble();
                    double frequencia = 1 / periodoFrequencia;
                    System.out.println("A Frequência é de: " + frequencia + " Hz");
                    break;
                case 13:
                    // Fórmula do Comprimento de Onda: λ = v / f
                    System.out.print("Digite a velocidade da onda (m/s): ");
                    double velocidadeOnda = ler.nextDouble();
                    System.out.print("Digite a frequência (Hz): ");
                    double frequenciaOnda = ler.nextDouble();
                    double comprimentoOnda = velocidadeOnda / frequenciaOnda;
                    System.out.println("A Comprimento de Onda é de: " + comprimentoOnda + " m");
                    break;
                case 14:
                    // Fórmula da amperagem: a = w / v
                    System.out.print("Digite a potência (w): ");
                    double potenciaAmperagem = ler.nextDouble();
                    System.out.print("Digite a voltagem (v): ");
                    double voltagemAmperagem = ler.nextDouble();
                    double amperagem = potenciaAmperagem / voltagemAmperagem;
                    System.out.println("A Força Centrípeta é de: " + amperagem + " A");
                    break;
                case 15:
                    // Fórmula da Energia Mecânica: Em = Ec + Ep
                    System.out.print("Digite a energia cinética (J): ");
                    double energiaCinetica = ler.nextDouble();
                    System.out.print("Digite a energia potencial (J): ");
                    double energiaPotencialMec = ler.nextDouble();
                    double energiaMecanica = energiaCinetica + energiaPotencialMec;
                    System.out.println("A Energia Mecânica é de: " + energiaMecanica + " J");
                    break;
                default:
                    // Caso o usuário digite um número maior que 15 ou um número negativo, vai aparecer essa mensagem.
                    System.out.println("Número inválido.");
                    break;
            }
        }
        // Esse código vai rodar após o usuário digitar 0, encerrando o while e o programa.
        System.out.println("Saindo do programa, valeu Rabinson pelas suas aulas de java :).");
        ler.close();
    }
}