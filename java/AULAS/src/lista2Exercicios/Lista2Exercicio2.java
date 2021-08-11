package lista2Exercicios;

import java.util.Scanner;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor[], ordem[],maior=0, menor=0,posicaoMaior=0;
		//se você mudar a quantidade de valores ele continua funcionando
		//testa colocar 20 numeros que ele vai colocar os 20 na ordem crescente
		final int qntdValores=3;
		//vetor para valores digitados
		valor = new int[qntdValores];
		//vetor com a ordem crescente
		ordem = new int[qntdValores];
		
		//pede para digitar valores até encher o vetor
		for(int i=0;i<qntdValores;i++) {
			//do while pra impedir que digite 0 ou números negativos
			do {
				System.out.printf("Valor %d: ",i+1);
				valor[i] = leia.nextInt();
				if(valor[i] <= 0) {
					System.out.println("0 e números negativos não são aceitos!");
				}
			} while(valor[i] <= 0);
		}
		
		for(int x=0;x<qntdValores;x++) { //laço para salvar o maior valor atual na posição certa do ordem[]
			for(int y=0;y<qntdValores;y++) { //laço para procurar o maior valor disponível dos valores digitados
				if(valor[y] > maior) {
					maior = valor[y];
					posicaoMaior=y;
				}
			}
			valor[posicaoMaior] = 0; //após utilizar o maior valor disponível, eu zero ele para que ele não seja repetido
			ordem[qntdValores-(x+1)] = maior;
			maior = 0; //também zero qual o maior valor atual depois de já ter salvo ele no ordem[]
		}
		
		for(int i=0;i<qntdValores;i++) {
			System.out.println(ordem[i]);
		}

	}

}
