package lista5Exercicios;

public class Cachorro extends Animal implements Som {
	
	//CONSTRUTOR
	public Cachorro(String nome, int anoNascimento) {
		super(nome, anoNascimento);
	}
	
	//METODOS
	@Override
	String movimento() {
		return "~Correndo~";
	}

	@Override
	public String emitirSom() {
		return "*Au au au!*";
	}

}
