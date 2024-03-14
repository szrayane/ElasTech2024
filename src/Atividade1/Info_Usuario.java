package Atividade1;

import java.util.Scanner;

public class Info_Usuario {
    public static void main(String[] args) {
        // problema 4: Dados do Usuário
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}
