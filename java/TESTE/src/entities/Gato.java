package entities;

public class Gato extends Pet {
	//ATRIBUTOS
	private boolean miadoAlto;
	
	//CONSTRUTOR
	public Gato(String raca, boolean miadoAlto) {
		super(raca);
		this.miadoAlto = miadoAlto;
	}
	
	public Gato(String raca, int anoNascimento, boolean miadoAlto) {
		super(raca, anoNascimento);
		this.miadoAlto = miadoAlto;
	}

	//METODOS
	
	//Getters and Setters
	//MIADO ALTO
	public boolean isMiadoAlto() {
		return miadoAlto;
	}
	public void setMiadoAlto(boolean miadoAlto) {
		this.miadoAlto = miadoAlto;
	}
	
	
}
