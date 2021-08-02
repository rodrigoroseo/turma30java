programa
{
	
	funcao inicio()
	{
		//-----------------------------------------------------------------------------------------------
		//------------------------------------------ VARIÁVEIS ------------------------------------------
		//-----------------------------------------------------------------------------------------------
		
		//------------ variáveis do banco
		const cadeia NOME = "Rei do Hamburguer"
		const cadeia SLOGAN = "Matando sua fome para que ela nao mate você!"
		const inteiro qntdProdutos = 10
		cadeia codigo[qntdProdutos]
		const cadeia PRODUTO[qntdProdutos] = {"Royale","Quarteirão","Mentiroso","Grande Rei","Empilhador","Cheddar","Vegetariano","Frango","Abacaxi","Lanche feliz"}
		real valor[qntdProdutos]
		inteiro estoque[qntdProdutos]
		//------------ variáveis da compra
		inteiro produtoEscolhido = 0
		cadeia codigoDigitado = ""
		inteiro qntdDigitada = 0
		real total = 0.0
		inteiro carrinho[qntdProdutos]
		caracter comprarSN = 'S'
		caracter continuarCompra = 'S'
		inteiro checarEstoque = 0
		cadeia opcaoPagamento = ""
		real pagamento = 0.0
		real parcela = 0.0
		
		
		
		//-----------------------------------------------------------------------------------------------
		//------------------------ PREENCHIMENTO AUTOMÁTICO DAS OPÇÕES DO MENU --------------------------
		//-----------------------------------------------------------------------------------------------
		
		para(inteiro i=0;i<qntdProdutos;i++){
			//Autopreenche o código de todos por G6-i
			codigo[i] = "G6-"+(i+1)
			//Autopreenche o valor de todos como 15.00 ou 12.50, intercalando entre um e outro
			se(i % 2 == 0){
				valor[i] = 15.00
			} senao {
				valor[i] = 12.50
			}
			//Autopreenche o estoque de todos como 10
			estoque[i] = 10
			carrinho[i] = 0
		}

		//-----------------------------------------------------------------------------------------------
		//--------------------------------------  COMEÇAR COMPRA ----------------------------------------
		//-----------------------------------------------------------------------------------------------
		
		escreva(NOME,"\n",SLOGAN,"\n")
		escreva("\nDeseja comprar? [S/N]: ")
		leia(comprarSN)

		para(inteiro i=0;i<qntdProdutos;i++){
			checarEstoque += estoque[i]
		}

		se(checarEstoque < 1){
			escreva("\nSEM PRODUTOS NO ESTOQUE!\n")
		}
		
		enquanto(comprarSN == 'S' ou comprarSN == 's' e checarEstoque > 0){
			limpa()
			//-----------------------------------------------------------------------------------------------
			//-------------------------------------  COMEÇAR CARRINHO ---------------------------------------
			//-----------------------------------------------------------------------------------------------
			faca{
				//-----------------------------------------------------------------------------------------------
				//--------------------------------------- MENU DE OPÇÕES ----------------------------------------
				//-----------------------------------------------------------------------------------------------

				escreva("COD \t PRODUTO \t\t VALOR \t ESTOQUE \n------------------------------------------------\n")
				para(inteiro i=0;i<qntdProdutos;i++){
					escreva(codigo[i],"\t| ",PRODUTO[i],"\t\t| ",valor[i],"\t| ",estoque[i],"\n")
				}
		
				//-----------------------------------------------------------------------------------------------
				//------------------------------------  CÓDIGO PARA COMPRA --------------------------------------
				//-----------------------------------------------------------------------------------------------
		
				escreva("\nCarrinho")
				escreva("\nCódigo do produto: ")
				leia(codigoDigitado)
				
				//-----------------------------------------------------------------------------------------------
				//----------- SE O PRODUTO NÃO TIVER NO ESTOQUE, AVISE O CLIENTE E PEÇA OUTRO PRODUTO -----------
				//-----------------------------------------------------------------------------------------------
		
				para(produtoEscolhido=0;produtoEscolhido<qntdProdutos;produtoEscolhido++){
					se(codigoDigitado ==  codigo[produtoEscolhido]){
						escreva(codigo[produtoEscolhido]," | ",PRODUTO[produtoEscolhido]," | ",valor[produtoEscolhido]," | ",estoque[produtoEscolhido],"\n")
						pare
					}
				}
		
				escreva("Quantidade: ")
				leia(qntdDigitada)
				//-----------------------------------------------------------------------------------------------
				// SE O CLIENTE PEDIR UMA QUANTIDADE MAIOR DO QUE A QUE TEM NO ESTOQUE, AVISE E PEÇA OUTRA QUANTIDADE
				//-----------------------------------------------------------------------------------------------

				carrinho[produtoEscolhido] += qntdDigitada

				se(estoque[produtoEscolhido] - carrinho[produtoEscolhido] < 0){
					escreva("\nATENÇÃO! Quantidade insuficiente no estoque.\nFavor escolher um produto que tenha no estoque, e uma quantidade disponível dele.\n")		//esse laço impede que o cliente peça mais do que tem no estoque
					carrinho[produtoEscolhido] = carrinho[produtoEscolhido] - qntdDigitada	//tive que mudar pra ajustar à logica de atualizar o estoque
				}

				para(inteiro i=0;i<qntdProdutos;i++){
					se(carrinho[i] > 0){
						total += carrinho[i] * valor[i]
					}
				}
				
				//-----------------------------------------------------------------------------------------------
				//---------------------------------  TIRAR COMPRAS DO ESTOQUE -----------------------------------
				//-----------------------------------------------------------------------------------------------
				para(inteiro i=0;i<qntdProdutos;i++){
					se(carrinho[i] > 0){
						estoque[i] = estoque[i] - carrinho[i]
					}
				}
				para(inteiro i=0;i<qntdProdutos;i++){
					carrinho[i] = 0				//zera o carrinho
				}
				
				escreva("\nContinuar comprando? [S/N]: ")
				leia(continuarCompra)
				limpa()
			} enquanto(continuarCompra == 'S' ou continuarCompra == 's')
			
			//-----------------------------------------------------------------------------------------------
			//-------------------------------  ESCOLHER FORMA DE PAGAMENTO ----------------------------------
			//-----------------------------------------------------------------------------------------------
			escreva("\n", NOME, "\n")
			escreva("Total: R$",total)
			escreva("\n", "Imposto: R$", total*0.09)
			escreva("\nOpção 1: a vista, 10% de desconto")
			escreva("\nOpção 2: 1x no cartão, 10% de acrescimo")
			escreva("\nOpção 3: 2x no cartão, 15% de acrescimo")
			escreva("\nSelecione a opção de pagamento: ")
			leia(opcaoPagamento)
			se (opcaoPagamento =="1"){
				pagamento = total - (total*0.1)
				}
			senao se (opcaoPagamento =="2"){
				pagamento = total + (total*0.1)
				}
			senao se (opcaoPagamento =="3"){
				pagamento = total + (total*0.15)
				parcela = pagamento / 2 
				escreva("parcela:", parcela)
				}
			
			
			
			 
			
			
			
			
			
			
			 
			
			
			
			
			
		

			
			//-----------------------------------------------------------------------------------------------
			//------------------------------------  EMITIR NOTA FISCAL --------------------------------------
			//-----------------------------------------------------------------------------------------------
			escreva("\nDigite qualquer coisa para continuar")
			leia(comprarSN)
			
			limpa()
			escreva(NOME,"\n",SLOGAN)
			escreva("\nDeseja comprar? [S/N]: ")
			leia(comprarSN)
		}
		escreva("\nAté breve!!\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4779; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {estoque, 17, 10, 7}-{carrinho, 23, 10, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */