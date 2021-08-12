programa
{
	
	funcao inicio()
	{
		real valor=0, total=0, media=0
		inteiro quantidade=0
		
		escreva("- - - - - - - - - - -\n SOMA SUCESSIVA \n- - - - - - - - - - -\n")
		
		enquanto(valor >= 0){
			escreva("Digite um número: ")
			leia(valor)
			total += valor
			quantidade++
		}
		media = total / quantidade
		escreva("- - - - - - - - - - - - - - - -\n")
		escreva("* A soma dos valores é: ",total)
		escreva("\n* A média dos valores é: ",media)
		escreva("\n* A quantidade digitada foi: ",quantidade)
		escreva("\n- - - - - - - - - - - - - - - -\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 170; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */