package entidades;

public final class ContaCorrente extends Conta {
	//ATRIBUTOS
	private int contadorTalao;

	//CONSTRUTOR
	public ContaCorrente(int numero, String nomeCliente, int contadorTalao) {
		super(numero, nomeCliente);
		this.contadorTalao = contadorTalao;
	}
	
	//Getters and Setters
	public int getContadorTalao() {
		return contadorTalao;
	}
	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
	
	//METODO
	//Verfica no main se já foram feitos 10 movimentos ou se a pessoa clicou em sair.
	//Só nesse caso pergunta se ela desej retirar cheque e ai entra o métdo "pediTalao"
	public void pediTalao() {
		int restante = 3;
		if(this.contadorTalao < 3) {
			restante -= this.contadorTalao;
			this.contadorTalao += 1;
			super.debito(30);
			System.out.println("Cheque resgistrado. Você tem direito a mais "+restante+" cheques.");
		}
		else if(this.contadorTalao == 3 ) {
			super.debito(30);
			System.out.println("Cheque resgistrado. Não há mais cheques disponíveis.");
		}
	}

}


