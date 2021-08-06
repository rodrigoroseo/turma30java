package lista4Exercicios;

import java.util.Calendar;

public class Cliente {
	public String nome;
	public String cpf;
	public int anoNascimento;
	
	public String validarCPF() {
		if(this.cpf.length() == 11) {
			return this.cpf;
		} else {
			return "CPF INVÁLIDO!";
		}
	}
	
	public int calcularIdade(){
		return (2021-anoNascimento);
	}
}
