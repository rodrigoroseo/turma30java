package entities;

public class Cachorro extends Pet {
	//ATRIBUTOS
	private boolean latidoAlto;

	//CONSTRUTOR
	public Cachorro(String raca, boolean latidoAlto) {
		super(raca);
		this.latidoAlto = latidoAlto;
	}
	
	public Cachorro(String raca, int anoNascimento, boolean latidoAlto) {
		super(raca, anoNascimento);
		this.latidoAlto = latidoAlto;
	}

	//METODOS
	
	//Getters and Setters
	//LATIDO ALTO
	public boolean isLatidoAlto() {
		return latidoAlto;
	}
	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}
	
	
}
