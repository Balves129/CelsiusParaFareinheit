import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import util.*;

public class Temperatura {
    public static void main(String[] args) throws Exception {
        // Aqui temos a importação do Scanner, que serve para entrada de dados pelo
        // teclado
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // O programa começa pedindo ao usuário para digitar seu nome:
        // Registrar o nome do usuario que está realizando a conversão
        System.out.print("Digite seu nome de usuário:\n ");
        // A variável nomeUsuario recebe o nome digitado pelo usuário
        // A função nextLine() lê uma linha inteira do teclado até encontrar um
        // caractere de nova linha ('\n')
        // A variável nomeUsuario é então atribuída o nome digitado pelo usuário sem
        // espaços em branco

        String nomeUsuario = scanner.nextLine();
        RegistroUsuario Usuario = new RegistroUsuario(nomeUsuario);
        // A variável DadosRegistrados é uma lista de strings, que vai armazenar os
        // dados de cada conversão
        // Lista para registrar/armazenar os dados de usuario e temperatura
        List<String> DadosRegistrados = new ArrayList<>();

        // Defini por padrão,a temperatura em Grau Celsius
        // O método getNome() é usado para retornar o nome do usuário registrado no
        // objeto RegistroUsuario
        System.out.printf("%s, Digite a temperatura em Celsius: ", Usuario.getNome());
        double Celsius = scanner.nextDouble();

        while (continuar) {
            // Mostrar as opções de conversão
            System.out.printf("\n%s, escolha a opção de conversão:", Usuario.getNome());
            System.out.println("\n1 -Para Fahrenheit");
            System.out.println("2 -Para Réaumur");
            System.out.println("3 -Para Kelvin");
            System.out.println("4 -Para Rankine");
            System.out.println("5 - Sair");

            int Opcao = scanner.nextInt();
            switch (Opcao) {
                case 1:
                    // Conversão para Fahrenheit
                    // O método add() é usado para adicionar um novo registro de conversão (em
                    // string) à lista DadosRegistrados
                    // O método format() é usado para formatação do texto, que neste caso é para
                    // mostrar a temperatura em Fahrenheit com uma casa decimal ( %.1f°F)
                    double Fahrenheit = (Celsius * 1.8) + 32;
                    String RegistroFarenheit = (String.format("Temperatura em Fahrenheit: %.1f°F", Fahrenheit));
                    DadosRegistrados.add(RegistroFarenheit);
                    break;

                case 2:
                    // Conversão para Réaumur

                    double Reaumur = (Celsius * 0.8);
                    String RegistroReaumur = (String.format("Temperatura em Reaumur: %.1f°Re", Reaumur));
                    DadosRegistrados.add(RegistroReaumur);
                    break;

                case 3:
                    // Conversão para Kelvin

                    double Kelvin = Celsius + 273.15;
                    String RegistroKelvin = (String.format("Temperatura em Kelvi: %.1f°K", Kelvin));
                    DadosRegistrados.add(RegistroKelvin);
                    break;

                case 4:
                    // Conversão para Rankine
                    double Rankine = (Celsius * 1.8)+ 491.67;
                    String RegistroRankine = (String.format("Temperatura em Rankine %.1f°Ra", Rankine));
                    DadosRegistrados.add(RegistroRankine);
                    break;

                case 5:
                    continuar = false;
                    break;
                default:

                    System.out.print("Opção Inválida. Selecione novamente.");

            }

        }
        System.out.print("\n--- Resumo Final \n---");
        System.out.printf("Usuário: %s%n", Usuario.getNome());
        System.out.println("Registros de Temperaturas:");
        // Aqui mostra todos os dados registrados na lista DadosRegistrados
        // O método forEach() é usado para percorrer cada elemento da lista e imprimir
        // seu conteúdo
        // Informacoes é um objeto do tipo String, que contem todos os dados da minha
        // lista
        for (String Informacoes : DadosRegistrados) {
            System.out.println(Informacoes);
        }

        scanner.close();
    };
};
