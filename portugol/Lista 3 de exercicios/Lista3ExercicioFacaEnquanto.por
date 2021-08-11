programa
{
	
	funcao inicio()
	{
		inteiro numero=0, contador=0, soma=0

		escreva("- - - - - - - - - - -\n CONTADOR SEQUENCIAL\n- - - - - - - - - - -\n")
		
		escreva("Digite um número: ")
		leia(numero)
		
		faca {
			contador++
			soma += contador
		} enquanto (contador < numero)
		
		escreva("\n A soma de todos os números de 1 até ",numero," é: [ ",soma," ] \n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */