package br.com.fiap.empresa.model;

public class Vendedor extends Funcionario {

	double commissao, meta;
	public Vendedor(){}
	

	public Vendedor(double commissao, double meta) {
		super();
		this.commissao = commissao;
		this.meta = meta;
	}

	public Vendedor(String id, String nome, String cpf, String nivel, double salario, double commissao, double meta) {
		super(id, nome, cpf, nivel, salario);
		this.commissao = commissao;
		this.meta = meta;
	}

	public double getCommissao() {
		return commissao;
	}

	public void setCommissao(double commissao) {
		this.commissao = commissao;
	}

	public double getMeta() {
		return meta;
	}

	public void setMeta(double meta) {
		this.meta = meta;
	}
	
	


}
