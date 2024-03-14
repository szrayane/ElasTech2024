package Atividade3;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcao;

        do {
            System.out.println("Selecione a conversão:");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case '1':
                    converterCelsiusParaFahrenheit(scanner);
                    break;
                case '2':
                    converterFahrenheitParaCelsius(scanner);
                    break;
                case '3':
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != '3');

        scanner.close();
    }

    public static void converterCelsiusParaFahrenheit(Scanner scanner) {
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }

    public static void converterFahrenheitParaCelsius(Scanner scanner) {
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperatura em Celsius: " + celsius);
    }
}


