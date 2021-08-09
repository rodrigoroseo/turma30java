package lista5Exercicios;

public abstract class Animal {
	//ATRIBUTOS
	private String nome;
	private int idade;
	
	//CONSTRUTOR
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//METODOS
	abstract String movimento();

	//Getters and Setters
	//NOME
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//IDADE
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
