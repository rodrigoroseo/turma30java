package entities;

public class Pet {
	//ATRIBUTOS
	private String raca;
	private char porte;
	private int anoNascimento;
	
	//CONSTRUTOR
	public Pet(String raca) {
		super();
		this.raca = raca;
	}
	
	public Pet(String raca, int anoNascimento) {
		super();
		this.raca = raca;
		this.anoNascimento = anoNascimento;
	}
	
	//METODOS
	public void emiteSom() {
		System.out.println("Emitindo o som do bicho...");
	}
	
	public int idade() {
		return (2021 - anoNascimento);
	}
	
	//Getters and Setters
	//RACA
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	//PORTE
	public char getPorte() {
		return porte;
	}
	public void setPorte(char porte) {
		this.porte = porte;
	}
	//IDADE
	public int getanoNascimento() {
		return anoNascimento;
	}
	public void setanoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
}
