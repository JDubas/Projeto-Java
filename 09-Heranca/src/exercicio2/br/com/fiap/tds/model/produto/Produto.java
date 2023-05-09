package exercicio2.br.com.fiap.tds.model.produto;

public class Produto {
int codigo, preco;

public Produto(int codigo) {
	this.codigo=codigo;
}
public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public int getPreco() {
	return preco;
}

public void setPreco(int preco) {
	this.preco = preco;
}

}
