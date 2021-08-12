programa {
	funcao inicio(){
		
		//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		 
		inteiro seg
		inteiro min
		inteiro hor
		escreva("Digite o tempo em segundos: ")
		leia(seg)
		min = seg/60
		seg = seg%60
		hor = min/60
		min = min%60
		escreva(hor+" hora(s)\n")
		escreva(min+" minuto(s)\n")
		escreva(seg+" segundo(s)\n")
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 36; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */