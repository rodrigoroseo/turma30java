package lista4Exercicios;

public class CadAviao {
	
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		aviao1.modelo = "A380";
		aviao1.anoFabricao = 2007;
		aviao1.tipo = "Comercial";
		aviao1.numeroAssentos = 50;
		
		Aviao aviao2 = new Aviao();
		aviao2.modelo = "A320";
		aviao2.anoFabricao = 2012;
		aviao2.tipo = "Particular";
		aviao2.numeroAssentos = 10;
		
		System.out.printf("MODELO\t| ANO\t| TIPO\t\t| ASSENTOS");
		System.out.printf("\n------------------------------------------------------");
		System.out.printf("\n%s\t| %d\t| %s\t| %s",aviao1.modelo,aviao1.anoFabricao,aviao1.tipo,aviao1.checarAssentoDisponivel(50));
		System.out.printf("\n------------------------------------------------------");
		System.out.printf("\n%s\t| %d\t| %s\t| %s",aviao2.modelo,aviao2.anoFabricao,aviao2.tipo,aviao2.checarAssentoDisponivel(2));
	}
	
}
