package classes;

public class Produto {
	//ATRIBUTOS ------------------------------------------------------------
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;
	
	//CONSTRUTOR -----------------------------------------------------------
	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}

	//METODOS --------------------------------------------------------------
	public boolean retirarEstoque(int quantidade) {
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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	//ESTOQUE
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	
}
