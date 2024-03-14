package Atividade3;

public class Num_Pares {
    public static void main(String[] args) {
        int soma = 0;

        // loop de 1 a 100
        for (int i = 1; i <= 100; i++) {
            // verifica se o número é par
            if (i % 2 == 0) {
                soma += i; // adiciona o número par à soma
            }
        }

        // exibe a soma dos números pares
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}

