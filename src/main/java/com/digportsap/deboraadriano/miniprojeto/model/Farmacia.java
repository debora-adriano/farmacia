package com.digportsap.deboraadriano.miniprojeto.model;

import java.util.ArrayList;

public class Farmacia {
    double lucro; //Criação da variável lucro
    ArrayList<Medicamento> medicamentos = new ArrayList<>(); //Criação da lista medicamentos
    ArrayList<Funcionario> funcionarios = new ArrayList<>(); //Criação da lista funcionarios

    // Criação do construtor com as variáveis
    public Farmacia(ArrayList<Medicamento> medicamentos, ArrayList<Funcionario> funcionarios) {
        this.lucro = 0; // lucro sempre inicia em zero
        this.medicamentos = medicamentos;
        this.funcionarios = funcionarios;
    }

    // Criação do construtor sem as variáveis
    public Farmacia() {
    }

    // Criação do getLucro para a coleta da variável lucro
    public double getLucro() {
        return lucro;
    }

    // Criação do setLucro para alterações na variável lucro
    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    // Criação do getMedicamentos para a coleta da variável medicamentos
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    // Criação do setMedicamentos para alterações na variável medicamentos
    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    // Criação do getFuncionarios para a coleta da variável funcionarios
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    // Criação do setFuncionarios para alterações na variável funcionarios
    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    // Criação de um método toString para visualização das variáveis
    @Override
    public String toString() {
        return "Farmacia { " +
                "lucro: " + lucro +
                ", medicamentos: " + medicamentos +
                ", funcionarios: " + funcionarios +
                " }";
    }

    // Compra medicamento
    public String compraMedicamento(String nomeMedicamento, String nomeFuncionario, int quantidade){
        int qtd = 0; // variável para ser utilizada no retorno do método
        String func = null; // variável para ser utilizada no retorno do método
        boolean temMedicamento = false; // variável para ser utilizada no teste do medicamento
        for (Medicamento medicamento : medicamentos){ // percorre a lista de medicamentos
            if (medicamento.getNome().equalsIgnoreCase(nomeMedicamento) && medicamento.getQuantidadeEstoque() >= quantidade){ // testa se existe o medicamento e se possui quantidade em estoque
                temMedicamento = true; // altera variável para positivo
                setLucro(getLucro() + (medicamento.getPreco()*quantidade)); // altera o lucro da empresa
                qtd = medicamento.diminuiEstoque(quantidade); // altera a quantidade em estoque
                for (Funcionario funcionario : funcionarios) { // percorre a lista de funcionários
                    if (funcionario.getNome().equalsIgnoreCase(nomeFuncionario)){ // testa se existe o funcionário
                        func = funcionario.aumentaBonus(); // aumenta o bonus do funcionario
                    }
                }
            }
        }

        if (temMedicamento){ // testa se o medicamento foi localizado
            return "O lucro atual da fármacia é " + getLucro() + " a nova quantidade em estoque do medicamento " + nomeMedicamento
                    +  " é " + qtd + " e o funcionário " + nomeFuncionario + " obteve a seguinte alteração: " + func;
        }else { // retorno caso o medicamento não tenha sido localizado
            return "Medicamento não encontrado!" + "\n" + medicamentos.toString();
        }
    }

    // Método para limpar o lucro da farmácia e o bônus do funcionário
    public void limpaTudo(){
        for (Funcionario funcionario : funcionarios){ // percorre a lista de funcionários
            funcionario.setBonus(0); // altera o bônus para 0
        }
        setLucro(0); // altera o lucro da farmacia para 0
    }

}
