package lista4Exercicios;

public class CadCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Rodrigo";
		cliente1.cpf = "11122233345";
		cliente1.anoNascimento = 1998;
		
		Cliente cliente2 = new Cliente();
		cliente2.nome = "Roseo";
		cliente2.cpf = "111222333";
		cliente2.anoNascimento = 1990;
		
		System.out.printf("NOME\t| CPF\t\t| IDADE");
		System.out.printf("\n-------------------------------");
		System.out.printf("\n%s\t| %s\t| %d",cliente1.nome,cliente1.validarCPF(),cliente1.calcularIdade());
		System.out.printf("\n-------------------------------");
		System.out.printf("\n%s\t| %s\t| %d",cliente2.nome,cliente2.validarCPF(),cliente2.calcularIdade());
	}

}
