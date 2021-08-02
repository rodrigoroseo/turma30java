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

				carrinho[produtoEscolhido] = qntdDigitada

				para(inteiro i=0;i<qntdProdutos;i++){
					se(carrinho[i] > 0){
						total += carrinho[i] * valor[i]
					}
				}

				escreva("\nContinuar comprando? [S/N]: ")
				leia(continuarCompra)
				limpa()
			} enquanto(continuarCompra == 'S' ou continuarCompra == 's')
			
			escreva("Total: R$",total)

			//-----------------------------------------------------------------------------------------------
			//---------------------------------  TIRAR COMPRAS DO ESTOQUE -----------------------------------
			//-----------------------------------------------------------------------------------------------
			
			//-----------------------------------------------------------------------------------------------
			//-------------------------------  ESCOLHER FORMA DE PAGAMENTO ----------------------------------
			//-----------------------------------------------------------------------------------------------
			
			//-----------------------------------------------------------------------------------------------
			//------------------------------------  EMITIR NOTA FISCAL --------------------------------------
			//-----------------------------------------------------------------------------------------------
			escreva("\nDigite qualquer coisa para continuar")
			leia(comprarSN)
			
			para(inteiro i=0;i<qntdProdutos;i++){
				carrinho[i] = 0
			}
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
 * @POSICAO-CURSOR = 4459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {codigo, 14, 9, 6}-{PRODUTO, 15, 15, 7}-{valor, 16, 7, 5}-{estoque, 17, 10, 7}-{total, 22, 7, 5}-{carrinho, 23, 10, 8}-{checarEstoque, 26, 10, 13};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */