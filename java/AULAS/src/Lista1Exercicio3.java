import java.util.Scanner;

public class Lista1Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int horas, minutos, segundos, totalSegundos;
		
		System.out.print("Tempo em segundos: ");
		totalSegundos = leia.nextInt();
		
		horas = totalSegundos / 3600;
		minutos = (totalSegundos % 3600) / 60;
		segundos =  (totalSegundos % 3600) % 60;
		
		System.out.print("Hora(s): "+horas+" | Minuto(s): "+minutos+" | Segundo(s): "+segundos);
	}
}
