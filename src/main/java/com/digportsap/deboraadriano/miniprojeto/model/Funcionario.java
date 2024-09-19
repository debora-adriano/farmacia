package com.digportsap.deboraadriano.miniprojeto.model;

public class Funcionario {

    String nome; //Criação da variável nome
    int bonus; //Criação da variável bonus
    double salarioBase; //Criação da variável salarioBase

    // Criação do construtor com as variáveis
    public Funcionario(String nome) {
        this.nome = nome;
        this.bonus = 0;
        this.salarioBase = 0;
    }

    // Criação do construtor sem as variáveis
    public Funcionario() {
    }

    // Criação do getNome para a coleta da variável nome
    public String getNome() {
        return nome;
    }

    // Criação do setNome para alterações na variável nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Criação do getBonus para a coleta da variável bonus
    public int getBonus() {
        return bonus;
    }

    // Criação do setBonus para alterações na variável bonus
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    // Criação do getSalarioBase para a coleta da variável salarioBase
    public double getSalarioBase() {
        return salarioBase;
    }

    // Criação do setSalarioBase para alterações na variável salarioBase
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Criação de um método toString para visualização das variáveis
    @Override
    public String toString() {
        return "Funcionario { " +
                "nome: " + nome +
                ", bonus: " + bonus +
                ", salarioBase: " + salarioBase +
                " }";
    }

    // Método para o bônus
    public String aumentaBonus(){
        setBonus(getBonus() + 10); // altera o bônus para ele mesmo + 10
        if (getBonus() % 3 == 0){ // verifica se o resto da divisão do bônus por 3 é zero para validar se deve incrementar o salário base
            setSalarioBase(getSalarioBase() + 100); // se o resultado for true acrescentar + 100 ao salário base
        }
        return "Atualização do bônus para " + getBonus() + " e seu salário base para " + getSalarioBase();
    }

}
