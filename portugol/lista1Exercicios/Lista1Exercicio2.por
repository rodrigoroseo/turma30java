
programa {
	funcao inicio(){
		
		//2. Faça um sistema que leia a idade de uma pessoa expressa
		//em dias e mostre-a expressa em anos, meses e dias.
		
		inteiro idade
		inteiro ano
		inteiro mes
		inteiro dia
		
		escreva("Digite sua idade em dias: ")
		leia(idade)
		ano = idade / 365
		dia = idade % 365
		mes = dia / 30
		dia = dia % 30
		escreva("Você tem "+ano+" anos, "+mes+" meses, "+dia+" dias de vida")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 32; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */