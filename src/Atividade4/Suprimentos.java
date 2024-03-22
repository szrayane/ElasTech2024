package Atividade4;

public class Suprimentos {
    private int numero;
    private String descricao;
    private int qtd;
    private double valorUnitario;

    public Suprimentos(int numero, String descricao, int qtd, double valorUnitario) {
        this.numero = numero;
        this.descricao = descricao;
        if (qtd > 0)
            this.qtd = qtd;
        else
            this.qtd = 0;

        if (valorUnitario > 0)
            this.valorUnitario = valorUnitario;
        else
            this.valorUnitario = 0.0;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setQtdComprada(int qtd) {
        if (qtd > 0)
            this.qtd = qtd;
        else
            this.qtd = 0;
    }

    public int getQtdComprada() {
        return qtd;
    }

    public void setValorUnitario(double valorUnitario) {
        if (valorUnitario > 0)
            this.valorUnitario = valorUnitario;
        else
            this.valorUnitario = 0.0;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public double getInvoiceAmount() {
        return qtd * valorUnitario;
    }
    }


