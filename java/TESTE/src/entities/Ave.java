package entities;

public class Ave extends Pet {
	//ATRIBUTOS
	private boolean voa;
	
	//CONSTRUTOR
	public Ave(String raca, boolean voa) {
		super(raca);
		this.voa = voa;
	}
	
	public Ave(String raca, int anoNascimento, boolean voa) {
		super(raca, anoNascimento);
		this.voa = voa;
	}

	//METODOS
	
	//Getters and Setters
	//VOA
	public boolean isVoa() {
		return voa;
	}
	public void setVoa(boolean voa) {
		this.voa = voa;
	}
	
	
}
