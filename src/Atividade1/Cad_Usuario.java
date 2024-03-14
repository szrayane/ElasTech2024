package Atividade1;

import java.util.Scanner;
import java.time.Year;

public class Cad_Usuario {
    public static void main(String[] args) {
        // problema 5: Cadastro de Usuário e Ano de Nascimento
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        int anoNascimento = Year.now().getValue() - idade;

        System.out.println("\n" + nome + " nasceu no ano de " + anoNascimento);

        scanner.close();
    }
}
