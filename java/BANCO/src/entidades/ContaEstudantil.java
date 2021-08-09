package entidades;

public final class ContaEstudantil extends Conta {

	private double limiteEstudantil;

	// CONSTRUTOR
	public ContaEstudantil(int numero, String nomeCliente, double limiteEstudantil) {
		super(numero, nomeCliente);
		this.limiteEstudantil = limiteEstudantil;
	}

	// GETTER AND SETTERS
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}

	// METODO
	public void usarEstudantil(double valor) {
		double auxValor = 0.0;

		if (valor > super.getSaldo() + this.limiteEstudantil) {
			System.out.println("Valor fora do limite.");
		} else if (valor > super.getSaldo()) {
			auxValor = valor - super.getSaldo();
			super.credito(auxValor);
			limiteEstudantil = limiteEstudantil - auxValor;
			System.out.printf("Novo limite estudantil: %.2f", limiteEstudantil);
		}
	}
}
