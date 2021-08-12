package programas;

import java.io.IOException;
import java.util.*;

import classes.*;

public class CadLoja {

	public static void main(String[] args) throws IOException {
		Scanner leia = new Scanner(System.in); //SCANNER
		//-----------------------------------------------------------------------------------------------
		//------------------------------------------ VARIÁVEIS ------------------------------------------
		//-----------------------------------------------------------------------------------------------
		//------------ VARIAVEIS DA LOJA
		final String NOME = "Rei do Hamburguer";
		final String SLOGAN = "Matando sua fome para que ela nao mate você!";
		//------------ VARIAVEIS DA COMPRA
		int checarEstoque = 0;
		char comprarSN = 'S';
		char continuarCompra = 'S';
		boolean checarCodigo = false;
		boolean checarQntd = false;
		int qntdTotal = 0;
		double total = 0.0;
		double pagamento = 0.0;
		double parcela = 0.0;
		String codigoDigitado = "";
		int produtoEscolhido = 0;
		int qntdDigitada = 0;
		char opcaoPagamento = ' ';
		
		
		//-----------------------------------------------------------------------------------------------
		//--------------------------------- INSTANCIAMENTO DE LISTAS ------------------------------------
		//-----------------------------------------------------------------------------------------------
		List<Produto> produtos = new ArrayList<>(); //PRODUTOS
		List<Carrinho> carrinho = new ArrayList<>(); //CARRINHO
		
		//-----------------------------------------------------------------------------------------------
		//----------------------------- PREENCHIMENTO DAS OPÇÕES DO MENU --------------------------------
		//-----------------------------------------------------------------------------------------------
		produtos.add(new Produto("G6-1","Royale c/ queijo",15,10));
		produtos.add(new Produto("G6-2","Quarteirão c/ queijo",12.50,10));
		produtos.add(new Produto("G6-3","Mentiroso",15,10));
		produtos.add(new Produto("G6-4","Grande Rei",12.50,10));
		produtos.add(new Produto("G6-5","Empilhador",15,10));
		produtos.add(new Produto("G6-6","Cheddar",12.50,10));
		produtos.add(new Produto("G6-7","Vegetariano",15,10));
		produtos.add(new Produto("G6-8","Frango",12.50,10));
		produtos.add(new Produto("G6-9","Abacaxi c/ barbecue",15,10));
		produtos.add(new Produto("G6-10","Lanche feliz",12.50,10));
		
		//-----------------------------------------------------------------------------------------------
		//--------------------------------------  COMEÇAR COMPRA ----------------------------------------
		//-----------------------------------------------------------------------------------------------
		System.out.print("╔═══════════════════╗\n║ "+NOME.toUpperCase()+" ║ "+SLOGAN.toUpperCase()+"\n╚═══════════════════╝ ════════════════════════════════════════════\n");
		System.out.print("\n Deseja comprar [S/N]: ");
		comprarSN = leia.next().toUpperCase().charAt(0);
		
		while(comprarSN == 'S'){
			//-----------------------------------------------------------------------------------------------
			//-------------------------------------  COMEÇAR CARRINHO ---------------------------------------
			//-----------------------------------------------------------------------------------------------
			
			//ZERA VARIÁVEIS DE COMPRA
			carrinho.clear();
			total = 0.0;
			qntdTotal = 0;
			pagamento = 0.0;
			parcela = 0.0;
			continuarCompra = 'S';
			
			//CHECA O ESTOQUE TOTAL
			checarEstoque = 0;
			for(Produto item : produtos) {
				checarEstoque += item.getEstoque();
			}
			//AVISA SE ESTAMOS SEM ESTOQUE
			if(checarEstoque <= 0){
				System.out.print("\nSEM PRODUTOS NO ESTOQUE!\n");
			}
			
			while(continuarCompra == 'S' && checarEstoque > 0) {
				//-----------------------------------------------------------------------------------------------
				//------------------------------------  CÓDIGO PARA COMPRA --------------------------------------
				//-----------------------------------------------------------------------------------------------
				do {
					//-----------------------------------------------------------------------------------------------
					//--------------------------------------- MENU DE OPÇÕES ----------------------------------------
					//-----------------------------------------------------------------------------------------------
					
					//CABEÇALHO MENU
					System.out.printf("\n ───────┬───────┬─────────┬──────────────────────");
					System.out.print("\n  COD\t│ VALOR\t│ ESTOQUE │ PRODUTO\n");
					
					//ITENS MENU
					for (Produto lanche : produtos) {
						System.out.print(" ───────┼───────┼─────────┼──────────────────────\n  ");
						System.out.print(lanche.getCodigo()+"\t│ "+lanche.getValor()+"\t│ "+lanche.getEstoque()+"\t  │ "+lanche.getNome()+"\n");
					}
					
					//IMPRIME O CARRINHO
					System.out.print("\n╔════════════════════════════════════════════════╗");
					System.out.print("\n║                    Carrinho                    ║");
					System.out.print("\n╚════════════════════════════════════════════════╝");
					//SE TIVER ALGO NO CARRINHO: CABEÇALHO CARRINHO
					if(carrinho.size() > 0){
						System.out.print("\n  QNTD\t│ NOME\n");
					}
					//SE TIVER ALGO NO CARRINHO: ITENS CARRINHO
					for(Carrinho item : carrinho) {
						System.out.print(" ───────┼────────────────────────────────────────\n  ");
						System.out.print(item.getQuantidade()+"\t│ "+item.getNomeProduto()+"\n");
					}
					
					//LÊ CÓDIGO
					System.out.print("\n╔═════════════════════════");
					System.out.print("\n║ Código do produto: ");
					codigoDigitado = leia.next().toUpperCase();
					
					//CHECA SE CÓDIGO EXISTE
					for(Produto item : produtos) {
						if(codigoDigitado.equals(item.getCodigo()) ) {
							checarCodigo = false;
							produtoEscolhido = produtos.indexOf(item);
							break;
						} else {
							checarCodigo = true;
						}
					}
					
					if(checarCodigo == true) {
						System.out.print("\nEste lanche não existe! Digite um código válido.\nEnter para continuar...");
						System.in.read();
					}
					
				} while(checarCodigo); //FIM MENU ----------------------------------------------------------
				//-----------------------------------------------------------------------------------------------
				//---------------------------------  TIRAR COMPRAS DO ESTOQUE -----------------------------------
				//-----------------------------------------------------------------------------------------------
				do {
					System.out.print("╠-------------------------\n");
					System.out.print("║ Quantidade: ");
					qntdDigitada = leia.nextInt();
					if(produtos.get(produtoEscolhido).retirarEstoque(qntdDigitada)) {
						carrinho.add(new Carrinho(qntdDigitada,produtoEscolhido,produtos.get(produtoEscolhido).getNome()));
						checarQntd = false;
						System.out.println("Adicionado no carrinho! :D");
						System.out.print("╚═════════════════════════");
						qntdTotal += qntdDigitada;
					} else {
						System.out.println("Quantidade inválida! :(\n");
						checarQntd = true;
					}
				} while(checarQntd);
				
				
				System.out.println("\nContinuar comprando [S/N]: ");
				continuarCompra = leia.next().toUpperCase().charAt(0);
				
			} //FIM COMPRA ---------------------------------------------------
			
			//CALCULA O TOTAL COM BASE NO CARRINHO
			for(Carrinho item : carrinho) {
				total += item.getQuantidade() * produtos.get(item.getIdProduto()).getValor();
			}
			
			//-----------------------------------------------------------------------------------------------
			//-------------------------------  ESCOLHER FORMA DE PAGAMENTO ----------------------------------
			//-----------------------------------------------------------------------------------------------
			//CABEÇALHO CARRINHO
			System.out.print("\n  QNTD\t│ NOME\n");
			//ITENS CARRINHO
			for(Carrinho item : carrinho) {
				System.out.print(" ───────┼────────────────────────────────────────\n  ");
				System.out.print(item.getQuantidade()+"\t│ "+item.getNomeProduto()+"\n");
			}
			
			System.out.print ("-----------------------------------------------------\n");
			System.out.print ("Total: R$"+total);
			System.out.print ("\n"+ "Imposto: R$"+ (Math.ceil (total * 0.09)));
			System.out.print ("\nOpção 1: A vista, 10% de desconto");
			System.out.print ("\nOpção 2: 1x no cartão, 10% de acrescimo");
			System.out.print ("\nOpção 3: 2x no cartão, 15% de acrescimo");
			System.out.print ("\nSelecione a opção de pagamento: ");
			
			do {
				opcaoPagamento = leia.next().charAt(0);
				if(opcaoPagamento != '1' & opcaoPagamento != '2' & opcaoPagamento != '3') {
					System.out.printf ("\nDIGITE UMA OPÇÃO VÁLIDA!: ");
				}
			} while(opcaoPagamento != '1' & opcaoPagamento != '2' & opcaoPagamento != '3');
			
			if (opcaoPagamento == '1') {
				pagamento = total - (total*0.1);
			} 
			else if (opcaoPagamento == '2'){
				pagamento = total + (total*0.1);
			} 
			else if (opcaoPagamento == '3') {
				pagamento = total + (total*0.15);
				parcela = pagamento / 2; 
			}
			
			//-----------------------------------------------------------------------------------------------
			//------------------------------------  EMITIR NOTA FISCAL --------------------------------------
			//-----------------------------------------------------------------------------------------------
			
			System.out.print ("---------- NOTA FISCAL -----------------\n");
			System.out.print("╔═══════════════════╗\n║ "+NOME.toUpperCase()+" ║ \n╚═══════════════════╝\n");
			//CABEÇALHO CARRINHO
			System.out.print("\n  QNTD\t│ NOME\n");
			//ITENS CARRINHO
			for(Carrinho item : carrinho) {
				System.out.print(" ───────┼────────────────────────────────────────\n  ");
				System.out.print(item.getQuantidade()+"\t│ "+item.getNomeProduto()+"\n");
			}
			
			 System.out.print("-----------------------------------------------------\n");

	         System.out.print ("\nQuantidade: "+ qntdTotal);
	         System.out.print ("\nValor final: R$"+ pagamento);
	         System.out.print ("\nOpção de pagamento utilizada: ");
	            
	         if (opcaoPagamento == '1') {
	        	 System.out.print ("A vista");
	         } 
	         else if (opcaoPagamento == '2') {
	        	 System.out.print ("1x no cartão");
	         }
	         else if (opcaoPagamento == '3'){
	        	 System.out.print ("2x no cartão\nValor da parcela: "+parcela);
	         }
	         
	         System.out.print ("\n----------------------------------------");
	         System.out.print ("\nEnter para continuar...");
	         System.in.read();
			
			System.out.print("\n Deseja comprar? [S/N]: ");
			comprarSN = leia.next().toUpperCase().charAt(0);
		} //FIM CARRINHO --------------------------------------------------------------------------------
		
		System.out.print("\n Até breve!!\n");
		
		leia.close();
		//FIM DO PROGRAMA
		
		/*
		String auxCodigo = "G6-6";
		int x;
		x = produtos.indexOf(auxCodigo);
		System.out.print("\n\n"+x);
		*/
	}

}
