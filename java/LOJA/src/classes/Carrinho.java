package classes;

public class Carrinho extends Produto {
	//ATRIBUTOS ------------------------------------------------------------
	private int quantidade;

	//CONSTRUTOR -----------------------------------------------------------
	public Carrinho(String codigo, String nome, double preco, int estoque, int quantidade) {
		super(codigo, nome, preco, estoque);
		this.quantidade = quantidade;
	}
	
	//METODOS --------------------------------------------------------------
	
	//Getters and Setters --------------------------------------------------
	//QUANTIDADE
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
