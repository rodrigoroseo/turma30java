package introducao;

import java.util.*;

public class TesteErro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor;
		int valores[] = new int[4];
		
		try {
			System.out.println("Posição dentro do vetor [0-3]: ");
			valor = leia.nextInt();
			System.out.println("Valor inteiro: ");
			valores[valor] = leia.nextInt();
			System.out.printf("Valor digitado na posição %d foi %d",valor,valores[valor]);
		} catch(Exception erro) {
			System.out.println("Erou!");
		}
		
	}

}
