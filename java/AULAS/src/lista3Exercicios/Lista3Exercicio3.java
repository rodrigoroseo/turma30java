package lista3Exercicios;

import java.util.Scanner;

public class Lista3Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade=0, menos21=0, mais50=0;
		
		while(idade != -99) {
			System.out.printf("Idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0) {
				menos21++;
			}
			
			if(idade > 50) {
				mais50++;
			}
		}
		
		System.out.printf("%d pessoa(s) abaixo de 21 | %d pessoa(s) acima de 50",menos21,mais50);
	}

}
