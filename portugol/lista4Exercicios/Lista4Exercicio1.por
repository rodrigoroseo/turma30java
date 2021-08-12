programa
{
	
	funcao inicio()
	{
		inteiro pontuacao[] = {5,9,4,7,2}, maior=0

		//sorteia valores e os salva no vetor
		para(inteiro i=0;i<5;i++){
			escreva("P",i+1,": ",pontuacao[i],"\n")
			//toda vez que sorteia, checa se deve mudar qual o maior valor
			se(pontuacao[i]>maior){
				maior = pontuacao[i]
			}
		}
		escreva("Maior pontuação: ",maior)
	//fim
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */