package entidades;

import java.util.Scanner;

public final class ContaEmpresa extends Conta{
	Scanner leia = new Scanner (System.in);
	private double emprestimoEmpresa = 10000;
	
	public ContaEmpresa(int numero, String nomeCliente, double emprestimoEmpresa) {
		super(numero, nomeCliente);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	//(+) pedirEmprestimo (soma no saldo e tira do empresitmo)
	
	public void pedirEmprestimo () {
		double emprestimo=0;
		System.out.print("Insira o valor que você deseja para o empréstimo? R$");
		emprestimo = leia.nextDouble();
		if (emprestimo > emprestimoEmpresa) {
			System.out.println("Sua empresa não tem crédito o suficiente para um empréstimo tão grande :( ");
		}
		else {
		super.credito(getSaldo() + emprestimo);
		emprestimoEmpresa -= emprestimo;
		}
	}
}
