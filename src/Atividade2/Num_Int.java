package Atividade2;

import java.util.Scanner;

public class Num_Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("O número é positivo e par.");
        } else if (num < 0) {
            System.out.println("O número é negativo e par.");
        } else {
            System.out.println("O número é zero.");
        }

        scanner.close();
    }
}


