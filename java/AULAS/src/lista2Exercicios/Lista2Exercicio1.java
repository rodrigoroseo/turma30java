package lista2Exercicios;

import java.util.Scanner;

public class Lista2Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor[], maior=0;
		final int qntdValores=3;
		valor = new int[qntdValores];
		
		for(int i=0;i<3;i++) {
			System.out.printf("Valor %d: ",i+1);
			valor[i] = leia.nextInt();
		}
		
		for(int i=0;i<qntdValores;i++) {
			if(valor[i] > maior) {
				maior = valor[i];
			}
		}
		
		System.out.printf("Maior valor: %d",maior);
	}
}
