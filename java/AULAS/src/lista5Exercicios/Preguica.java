package lista5Exercicios;

public class Preguica extends Animal implements Som {
	
	//CONSTRUTOR
	public Preguica(String nome, int anoNascimento) {
		super(nome, anoNascimento);
	}
	
	//METODOS
	@Override
	String movimento() {
		return "~Subindo árvore~";
	}

	@Override
	public String emitirSom() {
		return "*Aahn! Aaaahhn!*";
	}

}
