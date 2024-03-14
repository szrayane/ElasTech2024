package Atividade3;

public class Fibonacci {
        public static void main(String[] args) {
            int n = 20; // número de termos da sequência de Fibonacci a serem exibidos

            int primeiroTermo = 0;
            int segundoTermo = 1;

            System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");

            // exibindo os primeiros 20 números da sequência de Fibonacci
            for (int i = 1; i <= n; ++i) {
                System.out.print(primeiroTermo + " ");

                int proximoTermo = primeiroTermo + segundoTermo;
                primeiroTermo = segundoTermo;
                segundoTermo = proximoTermo;
            }
        }
    }


