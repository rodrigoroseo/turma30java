package lista4Exercicios;

public class Aviao {
	public String modelo;
	public int anoFabricao;
	public String tipo;
	public int numeroAssentos;
	
	public String checarAssentoDisponivel(int ocupados) {
		if(ocupados >= this.numeroAssentos) {
			return "ASSENTOS ESGOTADOS!";
		} else {
			return (this.numeroAssentos - ocupados)+" assentos restantes";
		}
	}
	
}
