package com.digportsap.deboraadriano.miniprojeto.model;

public class Medicamento {

    String nome; //Criação da variável nome
    int quantidadeEstoque; //Criação da variável quantidade em estoque
    double preco; //Criação da variável preço

    // Criação do construtor com as variáveis
    public Medicamento(String nome, int quantidadeEstoque, double preco) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    // Criação do construtor sem as variáveis
    public Medicamento() {
    }

    // Criação do getNome para a coleta da variável nome
    public String getNome() {
        return nome;
    }

    // Criação do setNome para alterações na variável nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Criação do getQuantidadeEstoque para a coleta da variável quantidade em estoque
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    // Criação do setQuantidadeEstoque para alterações na variável quantidade em estoque
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Criação do getPreco para a coleta da variável preço
    public double getPreco() {
        return preco;
    }

    // Criação do setPreco para alterações na variável preço
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Criação de um método toString para visualização das variáveis
    @Override
    public String toString() {
        return "Medicamento { " +
                "nome: " + nome +
                ", quantidadeEstoque: " + quantidadeEstoque +
                ", preco: " + preco +
                " }";
    }

    // Verifica estoque
    public int diminuiEstoque (int quantidadeComprada){
        setQuantidadeEstoque(getQuantidadeEstoque() - quantidadeComprada); // diminui a quantidade comprada da quantidade em estoque
        return getQuantidadeEstoque();
    }
}
