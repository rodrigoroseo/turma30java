
programa {
	funcao inicio(){
		
		//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
		//respectivamente.
		 
		inteiro n1
		inteiro n2
		inteiro n3
		inteiro media
		const inteiro p1 = 2
		const inteiro p2 = 3
		const inteiro p3 = 5
		
		escreva("Nota 1: ")
		leia(n1)
		escreva("Nota 2: ")
		leia(n2)
		escreva("Nota 3: ")
		leia(n3)
		
		n1 = n1 * p1
		n2 = n2 * p2
		n3 = n3 * p3
		media = (n1 + n2 + n3) / (p1+p2+p3)
		
		escreva("Média final(ponderada): " + media)
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */