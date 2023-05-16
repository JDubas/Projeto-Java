package br.com.fiap.empresa.model;

public class Gerente extends Funcionario{


	String beneficios;
	double bonus;
	public Gerente(){}
	
	public String aumentarSalario(String nivel){
		
		if (nivel.equalsIgnoreCase("junior")){
			if (super.getSalario() > 10000) {
				return "Funcionario recebe mais que um Junior";
			}else {
			super.setSalario(10000);
				return "Aumento de salario";
			}
		}else if(nivel.equalsIgnoreCase("pleno")) {
			if (super.getSalario() > 14000) {
				return "Funcionario recebe mais que um Pleno";
			}else {
				super.setSalario(14000);
				return "Aumento de salario";
			}
		}else if(nivel.equalsIgnoreCase("senior")) {
			if (super.getSalario() > 30000) {
				return "Funcionario recebe mais que um Senior";
			}else {
				super.setSalario(30000);
				return "Aumento de salario";
			}
		}
			
			return "Opção invalida";
	}
	
	
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
