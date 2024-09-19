package com.digportsap.deboraadriano.miniprojeto;

import com.digportsap.deboraadriano.miniprojeto.model.Farmacia;
import com.digportsap.deboraadriano.miniprojeto.model.Funcionario;
import com.digportsap.deboraadriano.miniprojeto.model.Medicamento;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class MiniprojetoApplication implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(MiniprojetoApplication.class, args); }

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in); // instanciando o objeto scanner para utilizar o prompt
		String retorno = ""; // criando variável retorno para ser utilizada no while

		Medicamento medicamento1 = new Medicamento("Neosaldina", 50, 40.00); // instanciando medicamento1
		Medicamento medicamento2 = new Medicamento("Paracetamol", 20, 10.00); // instanciando medicamento2

		Funcionario funcionario1 = new Funcionario("Cleide"); // instanciando funcionario1
		Funcionario funcionario2 = new Funcionario("Bilbo"); // instanciando funcionario2
		Funcionario funcionario3 = new Funcionario("Bruce"); // instanciando funcionario3
		Funcionario funcionario4 = new Funcionario("Catarina"); // instanciando funcionario4

		ArrayList<Medicamento> medicamentos = new ArrayList<>(); // criando a lista de medicamentos para inserir na farmacia
		medicamentos.add(medicamento1); // adicionando medicamento1 na lista de medicamentos
		medicamentos.add(medicamento2); // adicionando medicamento2 na lista de medicamentos

		ArrayList<Funcionario> funcionarios = new ArrayList<>(); // criando a lista de funcionarios para inserir na farmacia
		funcionarios.add(funcionario1); // adicionando funcionario1 na lista de funcionarios
		funcionarios.add(funcionario2); // adicionando funcionario2 na lista de funcionarios
		funcionarios.add(funcionario3); // adicionando funcionario3 na lista de funcionarios
		funcionarios.add(funcionario4); // adicionando funcionario4 na lista de funcionarios

		Farmacia farmacia = new Farmacia(medicamentos, funcionarios);  // instanciando farmacia

		// Mostrando os retornos
		System.out.println(medicamento1.toString());
		System.out.println(medicamento2.toString());
		System.out.println(funcionario1.toString());
		System.out.println(funcionario2.toString());
		System.out.println(funcionario3.toString());
		System.out.println(funcionario4.toString());
		System.out.println(farmacia.toString());

		// Sistema de compra de medicamentos
		while (!retorno.equalsIgnoreCase("sair")){
			System.out.println("Digite o nome do medicamento que deseja comprar: ");
			String nomeMedicamento = scanner.nextLine();
			System.out.println("Digite o nome do funcionario que deseja receber o atendimento: ");
			String nomeFuncionario = scanner.nextLine();
			System.out.println("Digite a quantidade que deseja comprar: ");
			int quantidade = scanner.nextInt();
			scanner.nextLine();

			System.out.println(farmacia.compraMedicamento(nomeMedicamento, nomeFuncionario, quantidade));

			System.out.println("Tecle ENTER para continuar comprando ou digite 'sair' para finalizar: ");
			retorno = scanner.nextLine();
		}
		System.out.println("Compra finalizada, agradecemos pela preferência!");
		scanner.close();

		// Teste métodos para limpar tudo.
		farmacia.limpaTudo();
		System.out.println(farmacia.toString());
	}
}
