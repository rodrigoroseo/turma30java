programa
{
	inclua biblioteca Texto --> txt
	inclua biblioteca Tipos --> tp
	
	funcao inicio()
	{
		//-----------------------------------------------------------------------------------------------
		//------------------------------------------ VARIÁVEIS ------------------------------------------
		//-----------------------------------------------------------------------------------------------
		
		//[1] ------------ variáveis essenciais
		const cadeia NOME = "Rei do Hamburguer"
		const cadeia SLOGAN = "Matando sua fome para que ela nao mate você!"
		const inteiro qntdProdutos = 10
		cadeia codigo[qntdProdutos]
		const cadeia PRODUTO[qntdProdutos] = {"Royale c/ queijo","Quarteirão c/ queijo","Mentiroso","Grande Rei","Empilhador","Cheddar","Vegetariano","Frango","Abacaxi","Salada"}
		real valor[qntdProdutos]
		inteiro estoque[qntdProdutos]
		//[1] ------------ variaveis do menu
		//[2] -------- indice do menu
		const cadeia CARDAPIO = "CARDÁPIO"
		const cadeia MENUCOD = "COD"
		const cadeia MENUPRODUTO = "PRODUTO"
		const cadeia MENUVALOR = "VALOR"
		const cadeia MENUESTOQUE = "ESTOQUE"
		//[2] -------- variáveis para consertar o espaço do menu
		//[3] ---- cabecçalho
		cadeia espacoCardapio = ""
		cadeia espacoCabecalhoCodigo = ""
		cadeia espacoCabecalhoProduto = ""
		cadeia espacoCabecalhoValor = ""
		cadeia espacoCabecalhoEstoque = ""
		//[3] ---- itens
		cadeia espacoCodigo = ""
		cadeia espacoProduto = ""
		cadeia espacoValor = ""
		cadeia espacoEstoque =""
		//[3] ---- divisória
		cadeia divisoria= ""
		cadeia tamanhoDivisoria= ""
		
		//-----------------------------------------------------------------------------------------------
		//------------------------ PREENCHIMENTO AUTOMÁTICO DAS OPÇÕES DO MENU --------------------------
		//-----------------------------------------------------------------------------------------------
		
		//Autopreenche o código de todos por G6-i
		para(inteiro i=0;i<qntdProdutos;i++){
			codigo[i] = "G6-"+(i+1)
			
		}
		//Autopreenche o valor de todos como 15.00
		para(inteiro i=0;i<qntdProdutos;i++){
			se(i % 2 == 0){
				valor[i] = 15.00
			} senao {
				valor[i] = 12.50
			}
		}
		//Autopreenche o estoque de todos como 10
		para(inteiro i=0;i<qntdProdutos;i++){
			estoque[i] = 10
		}

		//-----------------------------------------------------------------------------------------------
		//----------------------------------------- CABEÇALHO -------------------------------------------
		//-----------------------------------------------------------------------------------------------
		
		//Nome e slogan
		escreva("---------------------\n| ",txt.caixa_alta(NOME)," |\n------------------------------------------------\n")
		escreva("| ",SLOGAN," |\n------------------------------------------------\n")
		
		///Conserta espaçamento do cabeçalho do código
		espacoCabecalhoCodigo = consertarEspacamento(txt.numero_caracteres(MENUCOD),tamanhoDesejado(maiorOpcaoCadeia(codigo,qntdProdutos),MENUCOD))
		///Conserta espaçamento do cabeçalho do produto
		espacoCabecalhoProduto = consertarEspacamento(txt.numero_caracteres(MENUPRODUTO),tamanhoDesejado(maiorOpcaoCadeia(PRODUTO,qntdProdutos),MENUPRODUTO))
		///Conserta espaçamento do cabeçalho do valor
		espacoCabecalhoValor = consertarEspacamento(txt.numero_caracteres(MENUVALOR),tamanhoDesejado(maiorOpcaoReal(valor,qntdProdutos),MENUVALOR))
		///Conserta espaçamento do cabeçalho do estoque
		espacoCabecalhoEstoque = consertarEspacamento(txt.numero_caracteres(MENUESTOQUE),tamanhoDesejado(maiorOpcaoInteiro(estoque,qntdProdutos),MENUESTOQUE))
		
		//Calcula o tamanho da divisória(------) com base no tamanho final da tabela
		tamanhoDivisoria = espacoCabecalhoCodigo+MENUCOD + espacoCabecalhoProduto+MENUPRODUTO + espacoCabecalhoValor+MENUVALOR + espacoCabecalhoEstoque+MENUESTOQUE
		enquanto(txt.numero_caracteres(divisoria) < txt.numero_caracteres(tamanhoDivisoria)){
			divisoria += "-"
		}
		enquanto(txt.numero_caracteres(espacoCardapio) < (txt.numero_caracteres(tamanhoDivisoria) / 2)){
			espacoCardapio += " "
		}
		divisoria+="---------"

		
		escreva("\n",divisoria)
		escreva("\n|",espacoCardapio,CARDAPIO,espacoCardapio,"|")
		escreva("\n",divisoria)

		//-----------------------------------------------------------------------------------------------
		//--------------------------------------- MENU DE OPÇÕES ----------------------------------------
		//-----------------------------------------------------------------------------------------------
		
		//Escreve o cabeçalho do menu de opções
		escreva("\n",MENUCOD,espacoCabecalhoCodigo," | ",MENUPRODUTO,espacoCabecalhoProduto," | ",MENUVALOR,espacoCabecalhoValor," | ",MENUESTOQUE,espacoCabecalhoEstoque,"\n")

		para(inteiro i=0;i<qntdProdutos;i++){
			
			///Conserta espaçamento do código
			espacoCodigo = consertarEspacamento(txt.numero_caracteres(codigo[i]),tamanhoDesejado(maiorOpcaoCadeia(codigo,qntdProdutos),MENUCOD))
			///Conserta espaçamento do produto
			espacoProduto = consertarEspacamento(txt.numero_caracteres(PRODUTO[i]),tamanhoDesejado(maiorOpcaoCadeia(PRODUTO,qntdProdutos),MENUPRODUTO))
			///Conserta espaçamento do valor
			espacoValor = consertarEspacamento(txt.numero_caracteres(tp.real_para_cadeia(valor[i])),tamanhoDesejado(maiorOpcaoReal(valor,qntdProdutos),MENUVALOR))
			///Conserta espaçamento do estoque
			espacoEstoque = consertarEspacamento(txt.numero_caracteres(tp.inteiro_para_cadeia(estoque[i],10)),tamanhoDesejado(maiorOpcaoInteiro(estoque,qntdProdutos),MENUESTOQUE))
		
			//escreve na tela o [ código | nome | valor | estoque ] da opção atual
			escreva(divisoria,"\n")
			escreva(codigo[i],espacoCodigo," | ",PRODUTO[i],espacoProduto," | ",valor[i],espacoValor," | ",estoque[i],espacoEstoque,"\n")
			
			//zera os espaços de codigo e produto
			espacoCodigo = ""
			espacoProduto = ""
		}
		inteiro a
		a = maiorOpcaoReal(valor,qntdProdutos)

		//-----------------------------------------------------------------------------------------------
		//---------------------------------- FAZER CÓDIGO PARA COMPRA -----------------------------------
		//-----------------------------------------------------------------------------------------------
		
	//------------------------------------------------------------------------------------------------
	// FIM DO INÍCIO | FIM DO INÍCIO | FIM DO INÍCIO | FIM DO INÍCIO | FIM DO INÍCIO | FIM DO INÍCIO |
	//-----------------------------------------------------------------------------------------------
	}

		//-------------------------------------------------------------------------------------------------------------------
		//---------------------------------------------------- FUNÇÕES ------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------------

	//-----------------------------------------------------------------------------------------------
	//------------------------------------- TABELA RESPONSIVA ---------------------------------------
	//-----------------------------------------------------------------------------------------------

	//Checa qual dos valores salvos na coluna do vetor é maior(pra vetores em tipo real)
	funcao inteiro maiorOpcaoReal(real vetor[], inteiro qntdProdutos){
		inteiro maior = 0
		cadeia texto
		inteiro tamanho
		para(inteiro i=0;i<qntdProdutos;i++){
			texto = tp.real_para_cadeia(vetor[i])
			tamanho = txt.numero_caracteres(texto)
			se(tamanho > maior){
				maior = tamanho
			}
		}
		retorne maior
	}

	//Checa qual dos valores salvos na coluna do vetor é maior(pra vetores em tipo inteiro)
	funcao inteiro maiorOpcaoInteiro(inteiro vetor[], inteiro qntdProdutos){
		inteiro maior = 0
		cadeia texto
		inteiro tamanho
		para(inteiro i=0;i<qntdProdutos;i++){
			texto = ""+vetor[i]
			tamanho = txt.numero_caracteres(texto)
			se(tamanho > maior){
				maior = tamanho
			}
		}
		retorne maior
	}
	
	//Checa qual dos valores salvos na coluna do vetor é maior(pra vetores em tipo cadeia)
	funcao inteiro maiorOpcaoCadeia(cadeia vetor[], inteiro qntdProdutos){
		inteiro maior = 0
		inteiro tamanho
		para(inteiro i=0;i<qntdProdutos;i++){
			tamanho = txt.numero_caracteres(vetor[i])
			se(tamanho > maior){
				maior = tamanho
			}
		}
		retorne maior
	}

	//Procura qual o maior valor da coluna (se é  o cabecalho da coluna ou o maior vetor da coluna)
	funcao inteiro tamanhoDesejado(inteiro maiorOpcao, cadeia cabecalho){
		inteiro tamanhoFinal = 0
		inteiro tamanhoC = txt.numero_caracteres(cabecalho)
		se(maiorOpcao < tamanhoC){
			tamanhoFinal = tamanhoC
		} senao {
			tamanhoFinal = maiorOpcao
		}
		retorne tamanhoFinal
	}
	
	//adiciona espaço(s) depois dos valores dos itens com os menores tamanhos da coluna
	//(com base no maior item da coluna)
	//pra tudo ter o mesmo tamanho na hora de mostrar na tela
	funcao cadeia consertarEspacamento(inteiro tamanhoTexto, inteiro tamanhoFinal){
		cadeia espaco = ""
		enquanto(tamanhoTexto < tamanhoFinal){
			espaco += " "
			tamanhoTexto++
		}
		retorne espaco
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4170; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {espacoCabecalhoCodigo, 30, 9, 21};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */