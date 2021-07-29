programa
{
	inclua biblioteca Util
 --> u
	
	funcao inicio()
	{
		inteiro matriz[3][3], soma=0, somaDiagonal=0

		//para que le os valores digitados para preencher a matriz
		para(inteiro x=0;x<3;x++){
			para(inteiro y=0;y<3;y++){
				escreva("Linha ",x+1," | Coluna ",y+1,": ")
				leia(matriz[x][y])
				//soma todos os valores digitados para dar o resultado da soma da matriz inteira
				soma += matriz[x][y]
				//se, para somar somente a diagonal principal
				se(x == y){
					somaDiagonal += matriz[x][y]
				}
			}
		}
		
		limpa()

		//mostra a matriz montada em forma de tabela
		escreva("  MATRIZ \n")
		para(inteiro x=0;x<3;x++){
			escreva(" -------------\n | ")
			para(inteiro y=0;y<3;y++){
				escreva(matriz[x][y]," | ")
			}
			escreva("\n")
		}
		escreva(" -------------\n")

		//A soma de tudo, e a soma da diagonal principal
		escreva("\nSoma da matriz toda: ",soma)
		escreva("\n\nSoma da diagonal principal: ",somaDiagonal,"\n")
	//fim do programa
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 824; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 8, 10, 6}-{soma, 8, 24, 4}-{somaDiagonal, 8, 32, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */