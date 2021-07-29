programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		const inteiro lancamentos = 10
		inteiro valor[lancamentos], maior = 0, qntdMaior = 0
		real media = 0.0

		//rola o dado e salva os resultados no vetor
		para(inteiro i=0;i<lancamentos;i++){
			valor[i] = u.sorteia(1, 6)
			//soma todos os valores para fazer a média depois
			media += valor[i]
			//salva qual o maior valor
			se(valor[i] > maior){
				maior = valor[i]
				//se entrar aqui, o maior valor mudou, então reseta a quantidade de aparições do maior valor
				qntdMaior = 0
			}
			se(valor[i] == maior){
				//toda vez que o maior valor salvo aparecer, acrescenta +1 na quantidade de aparições
				qntdMaior++
			}
		}
		//calcula a média
		media = media / lancamentos
		
		para(inteiro i=0;i<lancamentos;i++){
			escreva("Lançamento ",i+1,": ",valor[i],"\n")
		}
		escreva("\nMédia dos lançamentos: ",media,"\n\nQntd de vezes da maior: ",qntdMaior,"\n")
	//fim
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 111; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valor, 8, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */