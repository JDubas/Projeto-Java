package exercicio2.br.com.fiap.model.eletronico;
import exercicio2.br.com.fiap.tds.model.produto.Produto;
public class Smartphone extends Produto {

	String modelo, fabricante;
	int memoria;
	
	public Smartphone(int codigo, String modelo) {
		super(codigo);
		this.modelo = modelo;
		}
	
	public Smartphone(int codigo, String modelo, String fabricante) {
		super(codigo);
		this.modelo = modelo;
		this.fabricante = fabricante;
		}
	

	
	
}
