package lista5Exercicios;

public class Preguica extends Animal implements Som {
	
	//CONSTRUTOR
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	//METODOS
	@Override
	String movimento() {
		return "~Subindo árvore~";
	}

	@Override
	public String emitirSom() {
		return "Aahn! Aaaahhn!";
	}

}
