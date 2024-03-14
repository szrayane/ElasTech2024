package Atividade3;
import java.util.Scanner;
public class Num_inteirosUs {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int contador = 0;
            int soma = 0;

            System.out.println("Digite números inteiros positivos. Digite um número negativo para encerrar e calcular a média.");

            // loop para solicitar números inteiros positivos
            while (true) {
                System.out.print("Digite um número: ");
                int numero = scanner.nextInt();

                // verifica se o número é negativo para encerrar o loop
                if (numero < 0) {
                    break;
                }

                // incrementa o contador e adiciona o número à soma
                contador++;
                soma += numero;
            }

            // verifica se foram inseridos números positivos para evitar divisão por zero
            if (contador > 0) {
                double media = (double) soma / contador;
                System.out.println("A média dos números inseridos é: " + media);
            } else {
                System.out.println("Nenhum número positivo foi inserido.");
            }

            scanner.close();
        }
    }


