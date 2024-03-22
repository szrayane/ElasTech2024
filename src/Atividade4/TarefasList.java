package Atividade4;
import java.util.ArrayList;
import java.util.Scanner;

public class TarefasList {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tarefas = new ArrayList<>();
    public void menuTarefas() {


        while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarTarefa(scanner, tarefas);
                    break;
                case 2:
                    removerTarefa(scanner, tarefas);
                    break;
                case 3:
                    listarTarefas(tarefas);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
            System.out.println();
        }
    }

    public void adicionarTarefa(Scanner scanner, ArrayList<String>tarefas){
        scanner.nextLine();
        System.out.println("Digite uma tarefa para adicionar");
        String novaTarefa = scanner.nextLine();
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");

    }


    public void removerTarefa(Scanner scanner, ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas para remover.");
            return;
        }

        System.out.println("Tarefas:");
        listarTarefas(tarefas);

        System.out.print("Digite o número da tarefa a ser removida: ");
        int indiceRemover = scanner.nextInt();
        if (indiceRemover >= 1 && indiceRemover <= tarefas.size()) {
            tarefas.remove(indiceRemover - 1);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Número de tarefa inválido.");
        }
    }

    public void listarTarefas(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas pendentes.");
        } else {
            System.out.println("Tarefas Pendentes:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }
}
