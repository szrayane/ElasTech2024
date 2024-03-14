package Atividade1;

import java.util.Scanner;

public class Main {
    // método para calcular a média aritmética de uma lista de números
    public static double calcularMedia(int[] numeros) {
        double soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma / numeros.length;
    }

    public static void main(String[] args) {
        // problema 1: Calculando médias
        int[] numeros1 = {8, 9, 7};
        int[] numeros2 = {4, 5, 6};

        // calculando as médias das listas
        double media1 = calcularMedia(numeros1);
        double media2 = calcularMedia(numeros2);

        // calculando a soma das duas médias
        double somaDasMedias = media1 + media2;

        // calculando a média das médias
        double mediaDasMedias = somaDasMedias / 2;

        // imprimindo os resultados
        System.out.println("Média dos números 8, 9 e 7: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das duas médias: " + somaDasMedias);
        System.out.println("Média das médias: " + mediaDasMedias);

        // problema 2: Antecessor e Sucessor
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um número inteiro: ");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O sucessor de " + numero + " é " + sucessor);

        // problema 3: Operações Matemáticas
        int a = 10;
        int b = 5;

        // operações matemáticas
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;

        System.out.println("\nSoma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        // problema 4: Dados do Usuário
        scanner.nextLine(); // Limpar o buffer

        System.out.print("\nDigite seu Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite sua Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Digite seu Endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("\nInformações do usuário:");
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);

        // problema 5: Cadastro de Usuário e Ano de Nascimento
        System.out.print("\nDigite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        int anoNascimento = java.time.Year.now().getValue() - idade;

        System.out.println("\n" + nome + " nasceu no ano de " + anoNascimento);

        scanner.close();
    }
}
