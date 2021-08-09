package entidades;

public abstract class Conta {
	//ATRIBUTOS
	private int numero;
	private String nomeCliente;
	private double saldo;
	
	//CONSTRUTOR
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}
	
	//METODOS
	public void debito(double valor) {
		if(valor > this.saldo) {
			System.out.printf("Saldo insuficiente para retirada do valor!");
		} else if(valor <= 0) {
			System.out.printf("Valor inválido!");
		} else {
			this.saldo = this.saldo - valor;
		}
	}
	
	public void credito(double valor) {
		if(valor <= 0) {
			System.out.printf("Valor inválido!");
		} else {
			this.saldo = this.saldo + valor;
		}
	}

	//Getters and Setters
	//NUMERO
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	//NOME CLIENTE
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	//SALDO
	public double getSaldo() {
		return saldo;
	}
	
}
