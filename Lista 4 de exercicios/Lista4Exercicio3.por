programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6]

		//preenche a matriz n1
		para(inteiro x=0;x<4;x++){
			para(inteiro y=0;y<6;y++){
				n1[x][y] = u.sorteia(1,9)
			}
		}
		
		//preencea  matriz n2
		para(inteiro x=0;x<4;x++){
			para(inteiro y=0;y<6;y++){
				n2[x][y] = u.sorteia(1,9)
			}
		}
		
		//salva a soma de n1 e n2 em m1
		para(inteiro x=0;x<4;x++){
			para(inteiro y=0;y<6;y++){
				m1[x][y] = n1[x][y] + n2[x][y]
			}
		}
		
		//salva a diferença de n1 e n2 em m2
		para(inteiro x=0;x<4;x++){
			para(inteiro y=0;y<6;y++){
				m2[x][y] = n1[x][y] - n2[x][y]
				//concerta resultados negativos para positivos
				se(m2[x][y] < 0){
					m2[x][y] = m2[x][y] * -1
				}
			}
		}


		//escreve as matrizes lado a lado
		escreva("   MATRIZ 1                    MATRIZ 2")
		para(inteiro x=0;x<4;x++){
			escreva("\n -------------------------   -------------------------\n |")
			//escreve a linha do n1
			para(inteiro y=0;y<6;y++){
				escreva(" ",n1[x][y]," |")
			}
			escreva(" X |")
			//escreve a linha do n2
			para(inteiro y=0;y<6;y++){
				escreva(" ",n2[x][y]," |")
			}
		}
		escreva("\n -------------------------   -------------------------\n")
		
		
		escreva("\n   SOMA                              DIFERENÇA")
		para(inteiro x=0;x<4;x++){
			escreva("\n -------------------------------   -------------------------\n| ")
			para(inteiro y=0;y<6;y++){
				// um se pra adicionar um 0 nos numeros menores que dois digitos, só para alinhar a tabela
				se(m1[x][y] >= 10){
					escreva(" ",m1[x][y]," |")
				} senao {
					escreva(" 0",m1[x][y]," |")
				}
			}
			escreva(" X |")
			para(inteiro y=0;y<6;y++){
				escreva(" ",m2[x][y]," |")
			}
		}
		escreva("\n -------------------------------   -------------------------\n")
	//fim
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1743; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 7, 10, 2}-{n2, 7, 20, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */