package br.com.fiap.empresa.model;

public class Gerente extends Funcionario{


	String beneficios;
	double bonus;
	
	
	
	public Gerente(String id, String nome, String cpf, String nivel, double salario, String beneficios, double bonus) {
		super(id, nome, cpf, nivel, salario);
		this.beneficios = beneficios;
		this.bonus = bonus;
	}
	
	
	public Gerente(String beneficios, double bonus) {
		super();
		this.beneficios = beneficios;
		this.bonus = bonus;
	}


	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
