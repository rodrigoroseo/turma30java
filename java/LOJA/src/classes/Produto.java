package classes;

public class Produto {
	//ATRIBUTOS ------------------------------------------------------------
	private String codigo;
	private String nome;
	private double preco;
	private int estoque;
	
	//CONSTRUTOR -----------------------------------------------------------
	public Produto(String codigo, String nome, double preco, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	//METODOS --------------------------------------------------------------
	public boolean comprar(String codigo, int quantidade) {
		if(quantidade <= 0) {
			return false;
		} else if(quantidade > this.estoque) {
			return false;
		} else {
			this.estoque -= quantidade;
			return true;
		}
	}
	
	//Getters and Setters --------------------------------------------------
	//CODIGO
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	//NOME
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//PRECO
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	//ESTOQUE
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	
}
