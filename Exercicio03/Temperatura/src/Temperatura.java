import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        //Solicitar para que digite a temperatura em celsius
        System.out.println("Digite a temperatura em Graus Celsius: ");
        double Celsius = scanner.nextDouble();

        //Converter a temperatura para fahrenheit
        double Fahrenheit = (Celsius * 1.8) + 32;
        
        //Mostrar a temperatura convertida para fahrenheit
        System.out.printf("A temperatura de %.1f°C é %.1f°F%n", Celsius, Fahrenheit);
    }
}
