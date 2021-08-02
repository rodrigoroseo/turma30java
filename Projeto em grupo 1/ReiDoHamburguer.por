programa
{
	inclua biblioteca Texto --> txt
	inclua biblioteca Tipos --> tp
	
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
		const cadeia PRODUTO[qntdProdutos] = {"Royale c/ queijo","Quarteirão c/ queijo","Mentiroso","Grande Rei","Empilhador","Cheddar","Vegetariano","Frango","Abacaxi com barbecue","Lanche feliz"}
		real valor[qntdProdutos]
		inteiro estoque[qntdProdutos]
		//------------ variáveis da compra
		inteiro produtoEscolhido = 0
		cadeia codigoDigitado = ""
		inteiro qntdDigitada = 0
		real total = 0.0
		inteiro carrinho[qntdProdutos]
		//------------ variaveis do menu
		//-------- indice do menu
		const cadeia CARDAPIO = "CARDÁPIO"
		const cadeia MENUCOD = "COD"
		const cadeia MENUPRODUTO = "PRODUTO"
		const cadeia MENUVALOR = "VALOR"
		const cadeia MENUESTOQUE = "ESTOQUE"
		//-------- variáveis para deixar o menu responsivo
		cadeia espacoTitulo = ""
		cadeia espacoMenu = ""
		cadeia divisoria= ""
		cadeia subDivisoria = ""
		
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
		//----------------------------------------- CABEÇALHO -------------------------------------------
		//-----------------------------------------------------------------------------------------------
		
		//Nome e slogan
		escreva("╔═══════════════════╗\n║ ",txt.caixa_alta(NOME)," ║ ",txt.caixa_alta(SLOGAN),"\n╚═══════════════════╝ ════════════════════════════════════════════\n")

		//Calcula o taqmanho da divisoria
		divisoria = calcularTamanhoMenu(divisoria,qntdProdutos, "═", 0, codigo, MENUCOD, PRODUTO, MENUPRODUTO, valor, MENUVALOR, estoque, MENUESTOQUE)
		espacoTitulo = (calcularTamanhoMenu(espacoTitulo,qntdProdutos, " ", 2, codigo, MENUCOD, PRODUTO, MENUPRODUTO, valor, MENUVALOR, estoque, MENUESTOQUE))
		divisoria+="═════════"
		//Calcula o tamanho da subDivisoria comn base na divisoria
		enquanto(txt.numero_caracteres(subDivisoria) < txt.numero_caracteres(divisoria)){
			subDivisoria += "-"
		}

		//Cabeçalho do menu de Opções
		escreva("\n",divisoria)
		escreva("\n║",espacoTitulo,CARDAPIO,espacoTitulo,"║")
		escreva("\n",divisoria)

		//-----------------------------------------------------------------------------------------------
		//--------------------------------------- MENU DE OPÇÕES ----------------------------------------
		//-----------------------------------------------------------------------------------------------
		
		///Conserta espaçamento do cabeçalho do código
		espacoMenu = consertarEspacamento(MENUCOD,tamanhoDesejado(maiorOpcaoCadeia(codigo,qntdProdutos),MENUCOD))
		escreva("\n",MENUCOD,espacoMenu," ║ ")
		///Conserta espaçamento do cabeçalho do produto
		espacoMenu = consertarEspacamento(MENUPRODUTO,tamanhoDesejado(maiorOpcaoCadeia(PRODUTO,qntdProdutos),MENUPRODUTO))
		escreva(MENUPRODUTO,espacoMenu," ║ ")
		///Conserta espaçamento do cabeçalho do valor
		espacoMenu = consertarEspacamento(MENUVALOR,tamanhoDesejado(maiorOpcaoReal(valor,qntdProdutos),MENUVALOR))
		escreva(MENUVALOR,espacoMenu," ║ ")
		///Conserta espaçamento do cabeçalho do estoque
		espacoMenu = consertarEspacamento(MENUESTOQUE,tamanhoDesejado(maiorOpcaoInteiro(estoque,qntdProdutos),MENUESTOQUE))
		escreva(MENUESTOQUE,espacoMenu,"\n")
		escreva(divisoria,"\n")

		para(inteiro i=0;i<qntdProdutos;i++){
			//escreve na tela o [ código | nome | valor | estoque ] da opção atual
			
			///Conserta espaçamento do código
			espacoMenu = consertarEspacamento(codigo[i],tamanhoDesejado(maiorOpcaoCadeia(codigo,qntdProdutos),MENUCOD))
			escreva(codigo[i],espacoMenu," ║ ")
			
			///Conserta espaçamento do produto
			espacoMenu = consertarEspacamento(PRODUTO[i],tamanhoDesejado(maiorOpcaoCadeia(PRODUTO,qntdProdutos),MENUPRODUTO))
			escreva(PRODUTO[i],espacoMenu," ║ ")
			
			///Conserta espaçamento do valor
			espacoMenu = consertarEspacamento(tp.real_para_cadeia(valor[i]),tamanhoDesejado(maiorOpcaoReal(valor,qntdProdutos),MENUVALOR))
			escreva(valor[i],espacoMenu," ║ ")
			
			///Conserta espaçamento do estoque
			espacoMenu = consertarEspacamento(tp.inteiro_para_cadeia(estoque[i],10),tamanhoDesejado(maiorOpcaoInteiro(estoque,qntdProdutos),MENUESTOQUE))
			escreva(estoque[i],espacoMenu,"\n")

			//DIVISÓRIA RESPONSIVA
			escreva(divisoria,"\n")
		}

		//-----------------------------------------------------------------------------------------------
		//------------------------------------  CÓDIGO PARA COMPRA --------------------------------------
		//-----------------------------------------------------------------------------------------------
		
		escreva("\n",divisoria)
		escreva("\n║",espacoTitulo,"Carrinho",espacoTitulo,"║")
		escreva("\n",divisoria)
		
		escreva("\n╔═════════════════════════")
		escreva("\n║ Código do produto: ")
		leia(codigoDigitado)
		escreva("╠",divisoria,"\n")
		
		para(produtoEscolhido=0;produtoEscolhido<qntdProdutos;produtoEscolhido++){
			se(codigoDigitado ==  codigo[produtoEscolhido]){
				escreva("║ ",codigo[produtoEscolhido]," ║ ",PRODUTO[produtoEscolhido]," ║ ",valor[produtoEscolhido]," ║ ",estoque[produtoEscolhido],"\n")
				pare
			}
		}
		escreva("║",subDivisoria,"\n")
		
		escreva("║ Quantidade: ")
		leia(qntdDigitada)
		escreva("║",subDivisoria,"\n")

		carrinho[produtoEscolhido] = qntdDigitada

		
		para(inteiro i=0;i<qntdProdutos;i++){
			se(carrinho[i] > 0){
				total += carrinho[i] * valor[i]
			}
		}
		escreva("║ Total: R$",total)
		escreva("\n╚",divisoria,"\n")
		
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
	funcao cadeia consertarEspacamento(cadeia texto, inteiro tamanhoFinal){
		cadeia espaco = ""
		inteiro tamanhoTexto = txt.numero_caracteres(texto)
		enquanto(tamanhoTexto < tamanhoFinal){
			espaco += " "
			tamanhoTexto++
		}
		retorne espaco
	}


	//Calcula o tamanho de todo o menu para retornar uma adição de caracteres que oculpem ele todo
	funcao cadeia calcularTamanhoMenu(cadeia item,inteiro qntdProdutos, cadeia simbolo, inteiro dividir, cadeia codigo[], cadeia MENUCOD, cadeia PRODUTO[], cadeia MENUPRODUTO, real valor[], cadeia MENUVALOR, inteiro estoque[], cadeia MENUESTOQUE){
		inteiro tamanho = 0
		cadeia tamanhoFinal = item
		tamanho = tamanhoDesejado(maiorOpcaoCadeia(codigo,qntdProdutos),MENUCOD)
		///Conserta espaçamento do cabeçalho do produto
		tamanho += tamanhoDesejado(maiorOpcaoCadeia(PRODUTO,qntdProdutos),MENUPRODUTO)
		///Conserta espaçamento do cabeçalho do valor
		tamanho += tamanhoDesejado(maiorOpcaoReal(valor,qntdProdutos),MENUVALOR)
		///Conserta espaçamento do cabeçalho do estoque
		tamanho += tamanhoDesejado(maiorOpcaoInteiro(estoque,qntdProdutos),MENUESTOQUE)
		
		se(dividir == 2){
			tamanho = tamanho / 2
		}
		
		enquanto(txt.numero_caracteres(tamanhoFinal) < tamanho){
			tamanhoFinal += simbolo
		}
		
		retorne tamanhoFinal
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5817; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */