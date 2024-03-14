package Atividade3;
import java.util.Scanner;

public class Num_Primos {
        // método para verificar se um número é primo
        public static boolean verificarPrimo(int numero) {
            if (numero <= 1) {
                return false; // 1 não é primo
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false; // encontrou um divisor, não é primo
                }
            }
            return true; // não encontrou nenhum divisor, é primo
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();

            if (verificarPrimo(numero)) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }

            scanner.close();
        }
    }


