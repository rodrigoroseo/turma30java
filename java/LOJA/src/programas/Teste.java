package programas;

import classes.Produto;

public class Teste {

	public static void main(String[] args) {
		//-----------------------------------------------------------------------------------------------
		//------------------------------------------ VARIÁVEIS ------------------------------------------
		//-----------------------------------------------------------------------------------------------
				
		//------------ variáveis da loja
		final String NOME = "Rei do Hamburguer";
		final String SLOGAN = "Matando sua fome para que ela nao mate você!";
		int qntdProdutos = 10;
		//------------ variáveis da compra
		int carrinho[] = new int[qntdProdutos]; //CLASSE??
		int produtoEscolhido = 0;
		String codigoDigitado = "";
		int qntdDigitada = 0;
		int qntdTotal = 0;
		double total = 0.0;
		char comprarSN = 'S';
		char continuarCompra = 'S';
		int checarEstoque = 0;
		char opcaoPagamento = ' ';
		double pagamento = 0.0;
		double parcela = 0.0;
		int checarCodigo = 0;
		
		//-----------------------------------------------------------------------------------------------
		//---------------------------- INSTANCIAMENTO DE PRODUTO NUM VETOR ------------------------------
		//-----------------------------------------------------------------------------------------------
		
		Produto produtos[] = new Produto[qntdProdutos];
		
		//-----------------------------------------------------------------------------------------------
		//------------------------ PREENCHIMENTO AUTOMÁTICO DAS OPÇÕES DO MENU --------------------------
		//-----------------------------------------------------------------------------------------------
		
		produtos[0].setNome("Royale");
		produtos[1].setNome("Quarteirão");
		produtos[2].setNome("Mentiroso");
		produtos[3].setNome("Grande Rei");
		produtos[4].setNome("Empilhador");
		produtos[5].setNome("Cheddar");
		produtos[6].setNome("Vegetariano");
		produtos[7].setNome("Frango");
		produtos[8].setNome("Abacaxi");
		produtos[9].setNome("Lanche feliz");
		
		for(int i=0;i<qntdProdutos;i++) {
			produtos[i].setCodigo("G6-"+(i+1));
			if(i % 2 == 0){
				produtos[i].setPreco(15);
			} else {
				produtos[i].setPreco(12.50);
			}
			produtos[i].setEstoque(10);
		}
		
		//-----------------------------------------------------------------------------------------------
		//--------------------------------------  COMEÇAR COMPRA ----------------------------------------
		//-----------------------------------------------------------------------------------------------
		
		

	}

}
