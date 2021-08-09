package lista5Exercicios;

public class Cavalo extends Animal implements Som {
	
	//CONSTRUTOR
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	//METODOS
	@Override
	String movimento() {
		return "~Correndo~";
	}

	@Override
	public String emitirSom() {
		return "Hiin in in hinir!";
	}

}
