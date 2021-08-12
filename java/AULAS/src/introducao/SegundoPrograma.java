package introducao;

import java.util.Locale;
import java.util.Scanner;

public class SegundoPrograma {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String nome;
		double celsius;
		double fahrenheit;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		nome = leia.nextLine();
		
		System.out.print("Digite os celsius: ");
		celsius = leia.nextDouble();
		
		fahrenheit = (celsius*1.8) + 32;
		
		System.out.println("Oi "+nome+". "+celsius+" celsius em fahrenheit é: "+fahrenheit);
	}
}
