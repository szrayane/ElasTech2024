package Atividade4;

public class Main {
    public static void main(String[] args) {
        Suprimentos item1 = new Suprimentos(1, "Mouse", 2, 25.0);
        System.out.println("Número do Item: " + item1.getNumero());
        System.out.println("Descrição do Item: " + item1.getDescricao());
        System.out.println("Quantidade Comprada: " + item1.getQtdComprada());
        System.out.println("Preço Unitário: $" + item1.getValorUnitario());
        System.out.println("Valor da Fatura: $" + item1.getInvoiceAmount());

        Colaboradores c1 = new Colaboradores("Rayane", "Souza", 5000);
        Colaboradores c2 = new Colaboradores("Julya", "Souza", 2000);


        System.out.println("Salário primeira colaboradora: "+ c1.getSalarioMensal());
        System.out.println("Salário segunda colaboradora: "+ c2.getSalarioMensal());
        c1.aumentarSalario(10);
        c2.aumentarSalario(10);
        System.out.println("Salário primeira colaboradora após aumento de 10%: "+ c1.getSalarioMensal());
        System.out.println("Salário segunda colaboradora após aumento de 10%: "+ c2.getSalarioMensal());

    }
}
