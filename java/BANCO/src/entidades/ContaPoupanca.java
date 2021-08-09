package entidades;

public final class ContaPoupanca extends Conta {
	//ATRIBUTOS
	private int diaAniversarioPoupanca;

	//CONSTRUTOR
	public ContaPoupanca(int numero, String nomeCliente, int diaAniversarioPoupanca) {
		super(numero, nomeCliente);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	//METODOS
	public void correcao(int diaAtual) {
		if(diaAtual == this.diaAniversarioPoupanca) {
			super.credito(super.getSaldo()*0.05);
		}
	}
	
	//Getters and Setters
	//DIA ANIVERSARIO POUPANCA
	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}
	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
}
