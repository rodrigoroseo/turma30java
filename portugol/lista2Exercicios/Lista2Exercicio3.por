programa
{
	
	funcao inicio()
	{
		
		//3) Desenvolva um sistema em que:
		//Leia 4 (quatro) números;
		//Calcule o quadrado de cada um;
		//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		//Caso contrário, imprima os valores lidos e seus respectivos quadrados.

		inteiro n1, n2, n3, n4
		inteiro pot1, pot2, pot3, pot4
		 
		escreva("Digite o 1º número: ")
		leia(n1)
		escreva("Digite o 2º número: ")
		leia(n2)
		escreva("Digite o 3º número: ")
		leia(n3)
		escreva("Digite o 4º número: ")
		leia(n4)

		pot1 = n1*n1
		pot2 = n2*n2
		pot3 = n3*n3
		pot4 = n4*n4
		
		escreva("- - - - - - - - - - -\n")
		
		se(pot3 >= 1000){
			escreva("O quadrado do terceiro numero digitado(", n3,") é ",pot3)
		 	escreva("\nO resultado ",pot3," é maior que 999. Por tanto, o programa será finalizado!")
		} senao {
			escreva("1º - O quadrado de ",n1," é ",pot1)
		 	escreva("\n2º - O quadrado de ",n2," é ",pot2)
		 	escreva("\n3º - O quadrado de ",n3," é ",pot3)
		 	escreva("\n4º - O quadrado de ",n4," é ",pot4)
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */