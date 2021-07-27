programa
{
	
	funcao inicio()
	{
		real salario=0, mediaSalario=0, maiorSalario=0
		real numeroFilhos=0, mediaFilhos=0
		real percentual=0
		inteiro amostra = 0
		
		escreva("- - - - - - - - - - - - - - - - -\n PESQUISA SOBRE RENDA E FAMÍLIA\n")
		escreva(" Amostra: ")
		leia(amostra)
		para (inteiro i=1;i<=amostra;i++){
			escreva("- - - - - - - - - - - - - - -\n")
			escreva("Digite o salário: R$ ")
			leia(salario)
			escreva("Digite o número de filhos: ")
			leia(numeroFilhos)
			
			mediaSalario += salario
			mediaFilhos += numeroFilhos
			
			se(salario > maiorSalario){
				maiorSalario = salario
			}
			
			se(salario <= 100){
				percentual++
			}
		}
		
		mediaSalario = mediaSalario / amostra
		mediaFilhos = mediaFilhos / amostra
		percentual = percentual / amostra * 100
		escreva("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n")
		escreva(" MÉDIA DOS ENTREVISTADOS (AMOSTRA: ",amostra,")")
		escreva("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n")
		escreva("* A média dos salários é: R$",mediaSalario)
		escreva("\n* A média da quantidade de filhos é: ",mediaFilhos)
		escreva("\n* O maior salário é: R$",maiorSalario)
		escreva("\n* O percentual de pessoa com salário até R$100,00: ",percentual,"%")
		escreva("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 926; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */