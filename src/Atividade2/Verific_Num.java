package Atividade2;

import java.util.Scanner;

public class Verific_Num {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int num = scanner.nextInt();

            if (num > 0) {
                System.out.println("O número é positivo.");
            } else if (num < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero.");
            }

            scanner.close();
        }
    }


