package lista3Exercicios;

import java.util.Scanner;

public class Lista3Exercicio5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0, soma = 0;

		System.out.printf("Somar número (números negativos não contam)\n\n");
		do {
			System.out.printf("Numero: ");
			numero = leia.nextInt();
			if (numero > 0) {
				soma += numero;
			}
		} while (numero != 0);

		System.out.printf("Soma dos números: %d", soma);
	}

}
