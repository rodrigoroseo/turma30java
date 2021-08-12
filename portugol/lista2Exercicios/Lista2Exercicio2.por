programa
{
	
	funcao inicio()
	{
		
		//2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de
		//um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas 
		//exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A 
		//hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário 
		//excedente.
		
		inteiro codigo
		inteiro horas, excesso
		real salario

		escreva("Código: ")
		leia(codigo)
		escreva("Horas trabalhadas: ")
		leia(horas)
		
		se(horas <= 50){
			salario = 10.0 * horas
			excesso = 0
		}senao{
			excesso = horas - 50
			horas = horas - excesso
			salario = 10.0 * horas
			horas = horas + excesso
			excesso = excesso * 20
		}
		
		escreva("O funcionário ",codigo," trabalhou ",horas," horas")
		escreva("\nSalário final: R$ ",salario," | Salario excedente: R$ ",excesso)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 499; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */