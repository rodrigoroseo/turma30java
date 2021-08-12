package programas;

import java.util.*;

import entidades.*;

public class CadFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Funcionario> folha = new ArrayList<>();
		
		char op = 'S';
		char tipoFuncionario = 'F';
		String matricula = "";
		int horasTrabalhadas = 0;
		double valorHora = 0;
		double adicional = 0;
		while(op == 'S') {
			do {
				System.out.printf("Funcionario ou Terceiro [F/T]: ");
				tipoFuncionario = leia.next().toUpperCase().charAt(0);
				if(tipoFuncionario != 'F' && tipoFuncionario != 'T'){
					System.out.println("Tipo inválido! Digite F ou T");
				}
			} while(tipoFuncionario != 'F' && tipoFuncionario != 'T');
			
			System.out.printf("Matrícula: ");
			matricula = leia.next();
			
			System.out.printf("Horas trabalhadas: ");
			horasTrabalhadas = leia.nextInt();
			
			System.out.printf("Valor por hora: R$");
			valorHora = leia.nextDouble();
			
			if(tipoFuncionario == 'T') {
				System.out.printf("Adicional: R$");
				adicional = leia.nextDouble();
				folha.add(new Terceiro(matricula,horasTrabalhadas,valorHora,adicional));
			} else if(tipoFuncionario == 'F') {
				folha.add(new Funcionario(matricula,horasTrabalhadas,valorHora));
			}
			System.out.printf("Continuar [S/N]: ");
			op = leia.next().toUpperCase().charAt(0);
		}
		
		System.out.printf("COD\t| SALARIO");
		for(Funcionario func : folha) {
			System.out.printf("%s\t| R$ %.2f\n",func.getMatricula(),func.calcularSalario());
		}

	}

}
