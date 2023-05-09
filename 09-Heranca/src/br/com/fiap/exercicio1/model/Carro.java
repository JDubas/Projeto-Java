package br.com.fiap.exercicio1.model;

public class Carro extends Veiculo{
	private String  placa;
	
	private int quantidadePorta;
	
	private float motor = 1;

	public Carro(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, Cor cor, String placa, int quantidadePorta, float motor) {
		super(modelo, quantidadeLugares, anoFabricacao, comprimento, cor);
		this.quantidadePorta = quantidadePorta;
		this.placa = placa;
		this.motor = motor;
		// TODO Auto-generated constructor stub
	}
	
}
