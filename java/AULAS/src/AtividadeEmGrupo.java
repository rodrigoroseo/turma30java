import java.util.Scanner;

public class AtividadeEmGrupo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome="";
		char pronome;
		double salario=0, comImposto=0;
		
		System.out.printf("Digite seu nome completo: ");
		nome = leia.nextLine();
		
		System.out.printf("Digite seu pronome o/a/e: ");
		pronome = leia.next().charAt(0);
		
		System.out.printf("Digite seu salário bruto: ");
		salario = leia.nextDouble();
		
		if(salario <= 0) {
			System.out.println("Salário inválido");
		} else if(salario <= 2000) {
			System.out.print("Sr."+pronome+" Isent"+pronome+"");
		} else if(salario <= 5000) {
			comImposto = salario - (salario * 0.15);
			System.out.printf("Sr.%c %s | Salario bruto: %.2f | Salario com imposto: %.2f",pronome,nome,salario, comImposto);
		} else {
			comImposto = salario * 0.25;
			System.out.printf("Sr.%c %s | Salario bruto: %.2f | Salario com imposto: %.2f",pronome,nome,salario, comImposto);
		}
	}

}
