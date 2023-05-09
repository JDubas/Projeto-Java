package br.com.fiap.exercicio1.model;

public class Aviao extends Veiculo{

private String prefixo;
	
	private int quantidadeTurbinas;
	
	

	Aviao(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, Cor cor,String prefixo, int quantidadeTurbinas) {
		super(modelo, quantidadeLugares, anoFabricacao, comprimento, cor);
		this.quantidadeTurbinas = quantidadeTurbinas;
		this.prefixo = prefixo;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public int getQuantidadeTurbinas() {
		return quantidadeTurbinas;
	}

	public void setQuantidadeTurbinas(int quantidadeTurbinas) {
		this.quantidadeTurbinas = quantidadeTurbinas;
	}


	
}
