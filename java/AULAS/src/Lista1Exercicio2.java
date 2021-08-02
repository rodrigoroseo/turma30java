import java.util.Scanner;

public class Lista1Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias, totalDias;
		
		System.out.print("Idade em dias: ");
		totalDias = leia.nextInt();
		
		anos = totalDias / 365;
		meses = (totalDias % 365) / 30;
		dias =  (totalDias % 365) % 30;
		 
		System.out.print("Ano(s): "+anos+" | Mese(s): "+meses+" | Dia(s): "+dias);
	}
}
