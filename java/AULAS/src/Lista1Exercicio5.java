import java.util.Scanner;

public class Lista1Exercicio5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int nota1, nota2, nota3, media;
		final int peso1=2, peso2=3, peso3=5;
		
		System.out.print("Nota 1: ");
		nota1 = leia.nextInt();
		System.out.print("Nota 2: ");
		nota2 = leia.nextInt();
		System.out.print("Nota 3: ");
		nota3 = leia.nextInt();
		
		media = (nota1 * peso1 + nota2 * peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
		
		System.out.print("Média aritmética: "+media);
	}
}
