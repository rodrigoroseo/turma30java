package entidades;

public class Funcionario {
	//ATRIBUTOS
	protected String matricula;
	protected int horasTrabalhadas;
	protected double valorPorHora;
	
	//CONSTRUTOR
	public Funcionario(String matricula, int horasTrabalhadas, double valorPorHora) {
		super();
		this.matricula = matricula;
		if(horasTrabalhadas < 0) {
			this.horasTrabalhadas = 0;
		} else {
			this.horasTrabalhadas = horasTrabalhadas;
		}
		if(valorPorHora < 0) {
			this.valorPorHora = 0;
		} else {
			this.valorPorHora = valorPorHora;
		}
		
	}

	//METODOS
	public double calcularSalario() {
		return this.horasTrabalhadas * this.valorPorHora;
	}
	
	//Getters an Setters
	//MATRICULA
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	//HORAS TRABALHADAS
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	//VALOR POR HORA
	public double getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
}
