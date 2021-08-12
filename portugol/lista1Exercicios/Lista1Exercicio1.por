
programa {
	funcao inicio(){
		
		//1. Faça um sistema que leia a idade de uma pessoa expressa
		//em anos, mesee dias e mostre-a expressa apenas em dias.
		
		inteiro ano
		inteiro mes
		inteiro dia
		inteiro bi
		
		escreva("Digite seu dia de nascimento: ")
		leia(dia)
		escreva("Digite seu mês de nascimento: ")
		leia(mes)
		escreva("Digite seu ano de nascimento: ")
		leia(ano)

		bi = (2020 - ano) / 2
		bi = (bi / 2)+1
		ano = 2021 - ano
		mes = 7 - mes
		dia = 23 - dia
		
		
		ano = ano * 365
		mes = mes * 30

		dia = dia + bi
		mes = mes + dia
		ano = ano + mes
		
		escreva("Você tem " + ano + " dias de vida")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 158; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */