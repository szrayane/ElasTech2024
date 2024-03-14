package Atividade3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número para exibir a tabuada");
        int numero = leitura.nextInt();
        ExibirTabuada(numero);
    }

    public static void ExibirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

