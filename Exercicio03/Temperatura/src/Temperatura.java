import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Defini por padrão,a temperatura em Grau Celsius

        System.out.println("Digite a temperatura em Celsius: ");
        double Celsius = scanner.nextDouble();

        while (continuar) {
            // Mostrar as opções de conversão
            System.out.println("\nEscolha a opção de conversão:");
            System.out.println("1 -Para Fahrenheit");
            System.out.println("2 -Para Réaumur");
            System.out.println("3 -Para Kelvin");
            System.out.println("4 - Sair");

            int Opcao = scanner.nextInt();
            switch (Opcao) {
                case 1:
                    // Conversão para Fahrenheit

                    double Fahrenheit = (Celsius * 1.8) + 32;
                    System.out.printf("Temperatura em Fahrenheit %.1f°F%n ", Fahrenheit);
                    break;

                case 2:
                    // Conversão para Réaumur

                    double Reaumur = (Celsius * 0.8);
                    System.out.printf("Temperatura em Reaumur %.1f°Re%n", Reaumur);
                    break;

                case 3:
                    // Conversão para Kelvin

                    double Kelvin = Celsius + 273.15;
                    System.out.printf("Temperatura em Kelvin %.1f°K%n", Kelvin);
                    break;

                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.print("Opção Inválida. Selecione novamente.");

            }
            ;

        }
        ;

        scanner.close();
    };
};
