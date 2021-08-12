package lista5Exercicios;

public abstract class Animal {
	//ATRIBUTOS
	private String nome;
	private int anoNascimento;
	
	//CONSTRUTOR
	public Animal(String nome, int anoNascimento) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}
	
	//METODOS
	abstract String movimento();
	public int calcularIdade(int ano) {
		return ano - this.anoNascimento;
	}

	//Getters and Setters
	//NOME
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//IDADE
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
}
