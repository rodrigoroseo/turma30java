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
		int numeroPedido = 0;
		String nomeCliente = "";
		
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
		System.out.print("╔═══════════════════╗\n");
		System.out.print("║ "+NOME.toUpperCase()+" ║ "+SLOGAN.toUpperCase()+"\n");
		System.out.print("╚═══════════════════╝ ════════════════════════════════════════════\n");
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
			nomeCliente = "";
			
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
				
				//-----------------------------------------------------------------------------------------------
				//--------------------------------------- MENU DE OPÇÕES ----------------------------------------
				//-----------------------------------------------------------------------------------------------
				
				//CABEÇALHO MENU
				System.out.print("\n╔════════════════════════════════════════════════╗");
				System.out.print("\n║                    CARDÁPIO                    ║");
				System.out.print("\n╚════════════════════════════════════════════════╝");
				System.out.print("\n ───────┬───────┬─────────┬──────────────────────");
				System.out.print("\n  COD\t│ VALOR\t│ ESTOQUE │ PRODUTO\n");
				
				//ITENS MENU
				for (Produto lanche : produtos) {
					System.out.print(" ───────┼───────┼─────────┼──────────────────────\n  ");
					System.out.printf("%s\t│ %.2f\t│  %d\t  │  %s\n",lanche.getCodigo(),lanche.getValor(),lanche.getEstoque(),lanche.getNome());
				}
				
				//IMPRIME O CARRINHO
				System.out.print("\n╔════════════════════════════════════════════════╗");
				System.out.print("\n║                    CARRINHO                    ║");
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
				do {
					
					//LÊ CÓDIGO
					System.out.print("\n╔════════════════════════");
					System.out.print("\n║ Código do produto: ");
					codigoDigitado = leia.next().toUpperCase();
					
					//CONSERTA ERRO DE DIGITAÇÃO DO CÓDIGO (SEM G6-)
					if(codigoDigitado.length() <= 2) {
						codigoDigitado = "G6-"+codigoDigitado;
					}
					
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
						System.out.print("\n╔═══ ALERTA ═══════════════════════════════════════╗");
						System.out.print("\n║ Este lanche não existe! Digite um código válido. ║\n║ » Pressione enter para continuar...              ║");
						System.out.print("\n╚══════════════════════════════════════════════════╝");
						System.in.read();
					} else if(produtos.get(produtoEscolhido).getEstoque() <= 0) {
						System.out.print("\n╔═══ ALERTA ═════════════════╗");
						System.out.print("\n║ Este lanche já se esgotou! ║\n║ » Enter para continuar...  ║");
						System.out.print("\n╚════════════════════════════╝");
						System.in.read();
						checarCodigo = true;
					}
					
				} while(checarCodigo); //FIM MENU ----------------------------------------------------------
				//-----------------------------------------------------------------------------------------------
				//---------------------------------  TIRAR COMPRAS DO ESTOQUE -----------------------------------
				//-----------------------------------------------------------------------------------------------
				System.out.print("╠───────┬─────────┬──────────────────────");
				System.out.print("\n║ VALOR\t│ ESTOQUE │ PRODUTO\n");
				System.out.print("╠───────┼─────────┼──────────────────────\n");
				System.out.print("║ "+produtos.get(produtoEscolhido).getValor());
				System.out.print("\t│ "+produtos.get(produtoEscolhido).getEstoque());
				System.out.print("\t  │ "+produtos.get(produtoEscolhido).getNome()+"\n");
				
				do {
					System.out.print("╠----------------------------------------\n");
					System.out.print("║ Quantidade: ");
					qntdDigitada = leia.nextInt();
					if(produtos.get(produtoEscolhido).retirarEstoque(qntdDigitada)) {
						carrinho.add(new Carrinho(qntdDigitada,produtoEscolhido,produtos.get(produtoEscolhido).getNome()));
						checarQntd = false;
						System.out.print("╚════════════════════════════════════════");
						qntdTotal += qntdDigitada;
					} else {
						System.out.println("║ Quantidade inválida!");
						checarQntd = true;
					}
				} while(checarQntd);
				
				
				System.out.print("\n\n Continuar comprando [S/N]: ");
				continuarCompra = leia.next().toUpperCase().charAt(0);
				
			} //FIM COMPRA ---------------------------------------------------
			
			//CALCULA O TOTAL COM BASE NO CARRINHO
			for(Carrinho item : carrinho) {
				total += item.getQuantidade() * produtos.get(item.getIdProduto()).getValor();
			}
			
			//-----------------------------------------------------------------------------------------------
			//-------------------------------  ESCOLHER FORMA DE PAGAMENTO ----------------------------------
			//-----------------------------------------------------------------------------------------------
			//IMPRIME O CARRINHO
			System.out.print("\n╔════════════════════════════════════════════════╗");
			System.out.print("\n║                    CARRINHO                    ║");
			System.out.print("\n╚════════════════════════════════════════════════╝");
			//CABEÇALHO CARRINHO
			System.out.print("\n  QNTD\t│ NOME\n");
			//ITENS CARRINHO
			for(Carrinho item : carrinho) {
				System.out.print(" ───────┼────────────────────────────────────────\n  ");
				System.out.print(item.getQuantidade()+"\t│ "+item.getNomeProduto()+"\n");
			}
			
			System.out.printf("\n╔═════════════════════╗");
			System.out.printf("\n║ OPÇÕES DE PAGAMENTO ║");
			System.out.printf("\n╚═════════════════════╝");
			System.out.printf("\n ────────┬───────────────────────────────────────");
			System.out.printf("\n TOTAL   │ R$%.2f",total);
			System.out.printf("\n IMPOSTO │ R$%.2f",(Math.ceil (total * 0.09)));
			System.out.printf("\n ────────┴─────────────────┬─────────────────────");
			System.out.printf("\n » Opção [1]: A vista      │ 10%% de desconto");
			System.out.printf("\n » Opção [2]: 1× no cartão │ 10%% de acrescimo");
			System.out.printf("\n » Opção [3]: 2× no cartão │ 15%% de acrescimo\n");
			
			do {
				System.out.print("\n Opção [1/2/3]: ");
				opcaoPagamento = leia.next().charAt(0);
				if(opcaoPagamento != '1' & opcaoPagamento != '2' & opcaoPagamento != '3') {
					System.out.print("\n╔═══ ALERTA ═══════════════════════╗");
					System.out.print("\n║ Digite uma opção válida! [1/2/3] ║\n║ » Enter para continuar...        ║");
					System.out.print("\n╚══════════════════════════════════╝");
					System.in.read();
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
			
			System.out.print("\n Seu nome: ");
			nomeCliente = leia.next();
			
			System.out.print("\n------------------------------------------------------");
			System.out.print("\n                 "+NOME.toUpperCase()+"®");
			System.out.print("\n         Rua FullStack nº30 Bairo Generation");
			System.out.print("\n------------------------------------------------------");
			System.out.print("\n          CPF do consumidor: XXX.XXX.XXX-XX");
			System.out.print("\n------------------------------------------------------");
			//CABEÇALHO CARRINHO
			System.out.print("\n  COD\t VALOR\t QNTD\t TOTAL\t PRODUTO\n");
			//ITENS CARRINHO
			for(Carrinho item : carrinho) {
				System.out.print("  "+produtos.get(item.getIdProduto()).getCodigo()+"\t ");
				System.out.print(produtos.get(item.getIdProduto()).getValor()+"\t ");
				System.out.print(item.getQuantidade()+"\t ");
				System.out.print( ( item.getQuantidade()*produtos.get(item.getIdProduto()).getValor() ) + "\t ");
				System.out.print(produtos.get(item.getIdProduto()).getNome()+"\n");
			}
			
			 System.out.print("------------------------------------------------------\n");

	         System.out.print("\nQNTD TOTAL DE ITENS\t\t\t    "+ qntdTotal);
	         System.out.printf("\nVALOR TOTAL\t\t\t\t    R$ %.2f", total);
	         
	         if (opcaoPagamento == '1') {
	        	 System.out.printf("\nDESCONTO\t\t\t\t    %.2f",(total*0.1));
	         } 
	         else if (opcaoPagamento == '2') {
	        	 System.out.printf("\nACRESCIMO\t\t\t\t    %.2f",(total*0.1));
	         }
	         else if (opcaoPagamento == '3'){
	        	 System.out.printf("\nACRESCIMO\t\t\t\t    %.2f",(total*0.15));
	         }
	         
	         System.out.printf("\nVALOR A PAGAR\t\t\t\t    R$ %.2f", pagamento);
	         System.out.print("\nFORMA DE PAGAMENTO\t\t\t    ");
	            
	         if (opcaoPagamento == '1') {
	        	 System.out.print("A VISTA");
	         } 
	         else if (opcaoPagamento == '2') {
	        	 System.out.print("1× CARTAO");
	         }
	         else if (opcaoPagamento == '3'){
	        	 System.out.printf("2× CARTAO\nVALOR DA PARCELA\t\t\t    %.2f",parcela);
	         }
	         
	         numeroPedido++;
	         System.out.print("\n\nNUMERO DO PEDIDO: "+numeroPedido+" CLIENTE: "+nomeCliente.toUpperCase());
	         
	         System.out.print("\n------------------------------------------------------\n");
	         System.out.print("\n » Enter para continuar...");
	         System.in.read();
			
	         System.out.print("\n╔═══════════════════╗\n");
	         System.out.print("║ "+NOME.toUpperCase()+" ║ "+SLOGAN.toUpperCase()+"\n");
	         System.out.print("╚═══════════════════╝ ════════════════════════════════════════════\n");
	         System.out.print("\n Deseja comprar? [S/N]: ");
			comprarSN = leia.next().toUpperCase().charAt(0);
		} //FIM CARRINHO --------------------------------------------------------------------------------
		
		System.out.print("\n Até breve!!\n");
		
		leia.close();
		//FIM DO PROGRAMA
	}

}
