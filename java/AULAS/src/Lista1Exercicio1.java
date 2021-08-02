import java.util.Scanner;

public class Lista1Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias, totalDias;
		
		System.out.print("Ano(s): ");
		anos = leia.nextInt();
		System.out.print("Mese(s): ");
		meses = leia.nextInt();
		System.out.print("Dia(s): ");
		dias = leia.nextInt();
		
		totalDias = (anos * 365) + (meses * 30) + dias;
		 
		System.out.print("Idade em dias: "+totalDias);
	}
}
