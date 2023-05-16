package br.com.fiap.empresa.model;

public class Terminal {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Funcionario funcionario = new Funcionario();
		gerente.setSalario(30000);
		funcionario.setSalario(1000);

		System.out.println(funcionario.aumentarSalario("senior"));
		gerente.aumentarSalario(5);
		System.out.println("Gerente: " + gerente.getSalario());
		System.out.println("Funcionario: " + funcionario.getSalario());

	}
}
