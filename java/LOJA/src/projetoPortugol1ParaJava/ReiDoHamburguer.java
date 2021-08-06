package projetoPortugol1ParaJava;

import java.util.Scanner;

public class ReiDoHamburguer {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//-----------------------------------------------------------------------------------------------
		//------------------------------------------ VARIÁVEIS ------------------------------------------
		//-----------------------------------------------------------------------------------------------
				
		//------------ variáveis da loja
		final String NOME = "Rei do Hamburguer";
		final String SLOGAN = "Matando sua fome para que ela nao mate você!";
		final int qntdProdutos = 10;
		String codigo[] = new String[qntdProdutos];
		final String PRODUTO[] = {"Royale","Quarteirão","Mentiroso","Grande Rei","Empilhador","Cheddar","Vegetariano","Frango","Abacaxi","Lanche feliz"};
		double valor[] = new double[qntdProdutos];
		int estoque[] = new int[qntdProdutos];
		//------------ variáveis da compra
		int produtoEscolhido = 0;
		String codigoDigitado = "";
		int qntdDigitada = 0;
		int qntdTotal = 0;
		double total = 0.0;
		int carrinho[] = new int[qntdProdutos];
		char comprarSN = 'S';
		char continuarCompra = 'S';
		int checarEstoque = 0;
		char opcaoPagamento = ' ';
		double pagamento = 0.0;
		double parcela = 0.0;
		int checarCodigo = 0;
		
		//-----------------------------------------------------------------------------------------------
		//------------------------ PREENCHIMENTO AUTOMÁTICO DAS OPÇÕES DO MENU --------------------------
		//-----------------------------------------------------------------------------------------------
				
		for(int i=0;i<qntdProdutos;i++){
			//Autopreenche o código de todos por G6-i
			codigo[i] = "G6-"+(i+1);
			//Autopreenche o valor de todos como 15.00 ou 12.50, intercalando entre um e outro
			if(i % 2 == 0){
				valor[i] = 15.00;
			} else {
				valor[i] = 12.50;
			}
			//Autopreenche o estoque de todos como 10
			estoque[i] = 10;
			carrinho[i] = 0;
		}
		
		//-----------------------------------------------------------------------------------------------
		//--------------------------------------  COMEÇAR COMPRA ----------------------------------------
		//-----------------------------------------------------------------------------------------------
		System.out.print(NOME+"\n"+SLOGAN+"\n");
		System.out.print("\nDeseja comprar? [S/N]: ");
		comprarSN = leia.next().toUpperCase().charAt(0);

		//CHECA O ESTOQUE TOTAL
		checarEstoque = 0;
		for(int i=0;i<qntdProdutos;i++){
			checarEstoque += estoque[i];
		}
		
		while(comprarSN == 'S' && checarEstoque > 0){
			//-----------------------------------------------------------------------------------------------
			//-------------------------------------  COMEÇAR CARRINHO ---------------------------------------
			//-----------------------------------------------------------------------------------------------
			do{
				//-----------------------------------------------------------------------------------------------
				//------------------------------------  CÓDIGO PARA COMPRA --------------------------------------
				//-----------------------------------------------------------------------------------------------
				do {
					//-----------------------------------------------------------------------------------------------
					//--------------------------------------- MENU DE OPÇÕES ----------------------------------------
					//-----------------------------------------------------------------------------------------------
					System.out.print("\nCOD \t| PRODUTO \t\t| VALOR\t| ESTOQUE \n-------------------------------------------------\n");
					for(int i=0;i<qntdProdutos;i++){
						System.out.printf("%s \t| %s \t\t| %.2f\t| %d\n", codigo[i],PRODUTO[i],valor[i],estoque[i]);
					}
					
					System.out.print("\nCarrinho");
					System.out.print("\nCódigo do lanche: ");
					codigoDigitado = leia.next();
					for(produtoEscolhido=0;produtoEscolhido<qntdProdutos;produtoEscolhido++){
						//PESQUISA E CHECA SE O LANCHE DIGITADO EXISTE
						if(codigoDigitado.equals(codigo[produtoEscolhido])){
							checarCodigo = 1;
							System.out.printf("%s | %s | %.2f | %d\n", codigo[produtoEscolhido],PRODUTO[produtoEscolhido],valor[produtoEscolhido],estoque[produtoEscolhido]);
							break;
						}
					}
					if(checarCodigo != 1){
						System.out.print("\nEste lanche não existe! Digite um código válido.\n\n");
					}
				} while(checarCodigo != 1); //FIM MENU ----------------------------------------------------------
				
				//-----------------------------------------------------------------------------------------------
				//---------------------------------  TIRAR COMPRAS DO ESTOQUE -----------------------------------
				//-----------------------------------------------------------------------------------------------
				System.out.print("Quantidade: ");
				qntdDigitada = leia.nextInt();
				// SE O CLIENTE PEDIR UMA QUANTIDADE MAIOR DO QUE A QUE TEM NO ESTOQUE, AVISE
				if(qntdDigitada <= 0){
					System.out.print("ATENÇÃO! Quantidade Inválida.\nDigite uma quantidade maior que 0\n");
				} else if (estoque[produtoEscolhido] - qntdDigitada  < 0) {
					System.out.print("\nATENÇÃO! Quantidade Inválida.\nFavor escolher um produto que tenha no estoque, e uma quantidade disponível dele.\n");
				} else {
					estoque[produtoEscolhido] = estoque[produtoEscolhido] - qntdDigitada;
					carrinho[produtoEscolhido] += qntdDigitada;
					qntdTotal += qntdDigitada;
				}

				System.out.println("\nContinuar comprando? [S/N]: ");
				continuarCompra = leia.next().toUpperCase().charAt(0);
			} while(continuarCompra == 'S'); //FIM COMPRA ---------------------------------------------------
			
			//CALCULA O TOTAL COM BASE NO CARRINHO
			for (int i = 0; i < qntdProdutos; i++) {
				if (carrinho[i] > 0) {
					total += carrinho[i] * valor[i];
				}
			}
			//-----------------------------------------------------------------------------------------------
			//-------------------------------  ESCOLHER FORMA DE PAGAMENTO ----------------------------------
			//-----------------------------------------------------------------------------------------------
			System.out.print ("\n"+ NOME +"\n");
			System.out.print("\nCOD \t| PRODUTO \t\t| VALOR\t| QUANTIDADE \n----------------------------------------------------\n");
			
			for (int i=0; i<qntdProdutos; i++) {
				if (carrinho[i] !=0){
					System.out.printf("%s \t| %s \t\t| %.2f\t| %d\n", codigo[i],PRODUTO[i],valor[i],carrinho[i]);
				} 
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
				System.out.print ("parcela:"+ parcela);
			}
			
			//-----------------------------------------------------------------------------------------------
			//------------------------------------  EMITIR NOTA FISCAL --------------------------------------
			//-----------------------------------------------------------------------------------------------
			System.out.print ("----------NOTA FISCAL-----------------\n");
            System.out.print (NOME);
            System.out.print("\nCOD \t| PRODUTO \t\t| VALOR\t| QUANTIDADE \n----------------------------------------------------\n");
            
            for (int i=0; i<qntdProdutos; i++) {
                if (carrinho[i] !=0){
                	System.out.printf("%s \t| %s \t\t| %.2f\t| %d\n", codigo[i],PRODUTO[i],valor[i],carrinho[i]);
                }
                
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
            System.out.print ("\nDigite qualquer coisa para continuar... ");
            comprarSN = leia.next().charAt(0);
			
			//ZERAR COISAS ----------------------------------------------------------------------------------
			//ZERA VARIÁVEIS DE COMPRA
			for(int i=0;i<qntdProdutos;i++){
				carrinho[i] = 0;
			}
			total = 0.0;
			qntdTotal = 0;
			pagamento = 0.0;
			parcela = 0.0;
			
			//ZERA E CHECA O TOTAL
			checarEstoque = 0;
			for(int i=0;i<qntdProdutos;i++){
				checarEstoque += estoque[i];
			}
			
			System.out.print(NOME+"\n"+SLOGAN);
			System.out.print("\nDeseja comprar? [S/N]: ");
			comprarSN = leia.next().toUpperCase().charAt(0);
		} //FIM CARRINHO --------------------------------------------------------------------------------
		
		if(checarEstoque < 1){
			System.out.print("\nSEM PRODUTOS NO ESTOQUE!\n");
		}
		System.out.print("\nAté breve!!\n");
		
		//FIM DO PROGRAMA
	}
}
