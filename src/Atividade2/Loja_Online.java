package Atividade2;

import java.util.Scanner;

public class Loja_Online {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicitar ao usuário o valor total da compra
        System.out.print("Digite o valor total da sua compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double desconto = 0.0;

        // aplicar descontos conforme o valor da compra
        if (valorCompra > 200) {
            desconto = valorCompra * 0.1; // 10% de desconto
        } else if (valorCompra >= 100 && valorCompra <= 200) {
            desconto = valorCompra * 0.05; // 5% de desconto
        }

        double valorFinal = valorCompra - desconto;

        // exibir o valor final a ser pago pelo usuário após o desconto
        System.out.println("\nValor total da compra: R$ " + valorCompra);
        System.out.println("Desconto aplicado: R$ " + desconto);
        System.out.println("Valor final a ser pago: R$ " + valorFinal);

        // exibir opções de pagamento
        System.out.println("\nEscolha o método de pagamento:");
        System.out.println("1. Cartão de crédito");
        System.out.println("2. Boleto bancário");
        System.out.println("3. Transferência bancária");

        // ler a opção de pagamento escolhida pelo usuário
        System.out.print("\nDigite o número correspondente ao método de pagamento: ");
        int opcaoPagamento = scanner.nextInt();

        // exibir mensagem de confirmação do pagamento
        switch (opcaoPagamento) {
            case 1:
                System.out.println("Pagamento realizado com cartão de crédito.");
                break;
            case 2:
                System.out.println("Pagamento realizado com boleto bancário.");
                break;
            case 3:
                System.out.println("Pagamento realizado por transferência bancária.");
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
        }

        scanner.close();
    }
}
