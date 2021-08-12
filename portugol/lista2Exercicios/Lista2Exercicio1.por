programa
{
	
	funcao inicio()
	{
		
		//1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
		//Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo
		//(50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que
		//leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na
		//variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		
		real peso
		real excesso
		real multa
		
		escreva("Digite o peso comprado de tomate: ")
		leia(peso)

		se(peso > 50.0){
			excesso = peso - 50.0
			multa = 4.00 * excesso
			escreva("Os ",peso," quilos de tomate ultrapassam o permitido")
		}senao{
			excesso = 0.0
			multa = 0.0
			escreva("Os ",peso," quilos de tomate estão dentro do permitido")
		}
		
		escreva("\nExcesso: ",excesso," k | Multa: R$ ",multa)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 604; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */