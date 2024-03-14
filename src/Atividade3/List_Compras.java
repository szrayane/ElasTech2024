package Atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class List_Compras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaCompras = new ArrayList<>();
        char opcao;

        do {
            System.out.println("Selecione a operação:");
            System.out.println("1 - Adicionar item à lista de compras");
            System.out.println("2 - Exibir lista de compras");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case '1':
                    adicionarItem(listaCompras, scanner);
                    break;
                case '2':
                    exibirLista(listaCompras);
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

    public static void adicionarItem(ArrayList<String> listaCompras, Scanner scanner) {
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite o item a ser adicionado à lista de compras: ");
        String item = scanner.nextLine();
        listaCompras.add(item);
        System.out.println("Item adicionado com sucesso.");
    }

    public static void exibirLista(ArrayList<String> listaCompras) {
        if (listaCompras.isEmpty()) {
            System.out.println("A lista de compras está vazia.");
        } else {
            System.out.println("Lista de compras:");
            for (int i = 0; i < listaCompras.size(); i++) {
                System.out.println((i + 1) + ". " + listaCompras.get(i));
            }
        }
    }
}


