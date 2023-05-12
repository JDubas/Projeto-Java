package br.com.fiap.empresa.model;

public class Funcionario {
	private String id, nome, cpf, nivel;
	private double salario;
	
	
	public Funcionario() {
		super();
	}

	public Funcionario(String id, String nome, String cpf, String nivel, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.nivel = nivel;
		this.salario = salario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//aumentar salario em 2%
	public void aumentarSalario() {
		this.salario = this.salario * 1.02;
	}
	
	public void aumentarSalario(double porcentagem) {
		this.salario = this.salario * (1 + (porcentagem / 100));
	}
	
	public String aumentarSalario(String nivel) {
		if (nivel == "Junior"){
			if (salario > 2000) {
				return "Funcionario recebe mais que um Junior";
			}else {
			this.salario = 2000;
				return "Aumento de salario";
			}
		}else if(nivel == "Pleno") {
			if (salario > 5000) {
				return "Funcionario recebe mais que um Pleno";
			}else {
			this.salario = 5000;
				return "Aumento de salario";
			}
		}else if(nivel == "Senior") {
			if (salario > 8000) {
				return "Funcionario recebe mais que um Senior";
			}else {
			this.salario = 8000;
				return "Aumento de salario";
			}
		}
			
			return "Opção invalida";
	}
}
