package lista2Exercicios;

import java.util.Scanner;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor[], ordem[],maior=0, menor=0,posicaoMaior=0;
		//se voc� mudar a quantidade de valores ele continua funcionando
		//testa colocar 20 numeros que ele vai colocar os 20 na ordem crescente
		final int qntdValores=3;
		//vetor para valores digitados
		valor = new int[qntdValores];
		//vetor com a ordem crescente
		ordem = new int[qntdValores];
		
		//pede para digitar valores at� encher o vetor
		for(int i=0;i<qntdValores;i++) {
			//do while pra impedir que digite 0 ou n�meros negativos
			do {
				System.out.printf("Valor %d: ",i+1);
				valor[i] = leia.nextInt();
				if(valor[i] <= 0) {
					System.out.println("0 e n�meros negativos n�o s�o aceitos!");
				}
			} while(valor[i] <= 0);
		}
		
		for(int x=0;x<qntdValores;x++) { //la�o para salvar o maior valor atual na posi��o certa do ordem[]
			for(int y=0;y<qntdValores;y++) { //la�o para procurar o maior valor dispon�vel dos valores digitados
				if(valor[y] > maior) {
					maior = valor[y];
					posicaoMaior=y;
				}
			}
			valor[posicaoMaior] = 0; //ap�s utilizar o maior valor dispon�vel, eu zero ele para que ele n�o seja repetido
			ordem[qntdValores-(x+1)] = maior;
			maior = 0; //tamb�m zero qual o maior valor atual depois de j� ter salvo ele no ordem[]
		}
		
		for(int i=0;i<qntdValores;i++) {
			System.out.println(ordem[i]);
		}

	}

}
