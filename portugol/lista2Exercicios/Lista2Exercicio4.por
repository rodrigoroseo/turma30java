programa
{
	
	funcao inicio()
	{
		
		//4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
		//é par ou ímpar, e se é positivo ou negativo.

		inteiro numero

		escreva("Digite um número: ")
		leia(numero)

		se(numero == 0){
			escreva("0 é um número neutro")
		} senao se(numero < 0){
			se((numero % 2) == 0){
		 		escreva("O número negativo ",numero," é par")
		 	} senao {
		 		escreva("O número negativo ",numero," é impar")
		 	}
		} senao se((numero % 2) == 0){
		 	escreva("O número positivo ",numero," é par")
		} senao {
		 	escreva("O número positivo ",numero," é impar")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */