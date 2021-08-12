package entidades;

public class Terceiro extends Funcionario {
	//ATRIBUTOS
	private double adicional;
	
	//COINSTRUTOR
	public Terceiro(String matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}

	//METODO
	@Override
	public double calcularSalario() {
		return this.horasTrabalhadas * this.valorPorHora + this.adicional;
	}

	//Getters and Setters
	//ADICIONAL
	public double getAdicional() {
		return adicional;
	}
	
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
}
