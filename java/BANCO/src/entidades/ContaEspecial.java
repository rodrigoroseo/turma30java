package entidades;

public final class ContaEspecial extends Conta {
	private Double limite;

	public ContaEspecial(int numero, String nomeCliente, Double limite) {
		super(numero, nomeCliente);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	//metodo
	public void usarLimite(double valor) {
		    double auxValor=0;
			if(valor>super.getSaldo()+this.limite) {
				System.out.println("Impossivel realizar");
			}
			else if(valor>super.getSaldo()) {
				auxValor =valor-super.getSaldo();
				super.credito(auxValor);
				this.limite =limite-auxValor;
				System.out.println("Novo limite:"+limite);
			}
			
	}

}
