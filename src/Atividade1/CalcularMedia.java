package Atividade1;

public class CalcularMedia {
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
} }
