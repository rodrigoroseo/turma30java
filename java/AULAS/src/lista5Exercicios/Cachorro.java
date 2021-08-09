package lista5Exercicios;

public class Cachorro extends Animal implements Som {
	
	//CONSTRUTOR
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	//METODOS
	@Override
	String movimento() {
		return "~Correndo~";
	}

	@Override
	public String emitirSom() {
		return "Au au au!";
	}

}
