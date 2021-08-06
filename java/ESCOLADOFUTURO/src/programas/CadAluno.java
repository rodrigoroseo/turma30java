package programas;

import java.util.Scanner;

public class CadAluno {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final String NOME[] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa","Andrei Felipe Corrêa de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu","Caio Saldanha Motta","Cássia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento","Fábio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Flávio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes","João Pedro Cruz Gomes","José Paulo de Matos Ferreira Neto","Letícia Porto Martins","Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani","Natália Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa","Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima","Thiago da Silva Machado","Vinícios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};
		String matricula[] = new String[NOME.length];
		int nota[] = new int[NOME.length];
		boolean ativo[] = new boolean[NOME.length];
		String matriculaDigitada="";
		char op='S';
		String mensagemAtivo;
		String mensagemNota;
		
		//AUTOPREENCHIMENTO DE MATRICULA E ATIVO
		for(int i=0;i<NOME.length;i++) {
			if(i >= 9) {
				matricula[i] = "MAT-"+(i+1);
			}else {
				matricula[i] = "MAT-0"+(i+1);
			}
			ativo[i] = true;
			nota[i] = 0;
		}
		
		//LISTA OS ALUNOS
		System.out.printf("\n MAT    | NOME");
		System.out.printf("\n %s\n",linha(52,"─"));
		for(int i=0;i<NOME.length;i++) {
			System.out.printf(" %s │ %s ",matricula[i],NOME[i]);
			System.out.printf("\n %s\n",linha(52,"─"));
		}
		
		System.out.printf("\n -------------- ATUALIZAR ALUNE(S) ------------------\n");
		
		//LAÇO CONTINUA ENQUANTO USUÁRIO QUISER OU SE DIGITAR UMA MATRÍCULA INEXISTENTE
		while(op == 'S') {
			System.out.printf("\n %s\n",linha(17,"─"));
			System.out.printf(" MATRÍCULA: ");
			matriculaDigitada = leia.next().toUpperCase();
			
			//CONSERTA ALGUNS ERROS DE DIGITAÇÃO NA PESQUISA DA MATRÍCULA
			if(matriculaDigitada.length() == 1) {
				matriculaDigitada = "0"+matriculaDigitada;
			}
			if(matriculaDigitada.length() == 2) {
				matriculaDigitada = "MAT-"+matriculaDigitada;
			}
			//PESQUISA MATRÍCULA
			for(int i=0;i<NOME.length;i++) {
				//ENTRA QUANDO ACHA A MATRÍCULA
				if(matriculaDigitada.equals(matricula[i])) {
					System.out.printf("\n MAT    | NOTA\t | ESTADO\t| NOME");
					System.out.printf("\n %s\n",linha(76,"─"));
					//MOSTRA OS DADOS DE ALUNE SELECIONADE
					System.out.printf(" %s | %s\t | %s\t| %s",matricula[i],(nota[i] < 1)?"X":nota[i],(ativo[i])?"ATIVO":"INATIVO",NOME[i]);
					System.out.printf("\n %s\n",linha(76,"-"));
					//LÊ UMA NOTA ENTRE 1 E 10
					do {
						System.out.printf(" NOTA: ");
						nota[i] = leia.nextInt();
						if(nota[i] < 1 || nota[i] > 10) {
							System.out.printf(" [ERRO] DIGITE UMA NOTA DE 1 A 10! \n");
						}
					}while(nota[i] < 1 || nota[i] > 10);
					//PERGUNTA SE ESTÁ ATIVO: SÓ ACEITA S OU N
					System.out.printf(" %s\n",linha(76,"-"));
					do {
						System.out.printf(" ATIVO? [S/N]: ");
						op = leia.next().toUpperCase().charAt(0);
						if(op != 'S' && op != 'N') {
							System.out.printf(" [ERRO] DIGITE DIGITE (S) OU (N)\n");
						}
					} while(op != 'S' && op != 'N');
					//S = TRUE ; N = FALSE
					System.out.printf(" %s\n",linha(76,"─")); 
					if(op == 'S') {
						ativo[i] = true;
					} else {
						ativo[i] = false;
					}
						
					
					break; //FINALIZA O LAÇO
				} else if(i == (NOME.length - 1)) {
					//INFORMA SE NÃO ACHAR A MATRÍCULA
					System.out.printf(" [ERRO] MATRÍCULA NÃO ENCONTRADA!\n");
				}
			} //FIM DO LAÇO
			
			//PERGUNTA SE QUER CONTINUAR OU SAIR DO LAÇO
			System.out.printf("\n Continuar? [S/N]: ");
			op = leia.next().toUpperCase().charAt(0);
		}
		
		System.out.printf("\n MAT    | NOTA\t | ESTADO\t| NOME");
		System.out.printf("\n %s",linha(76,"─"));
		//LISTAR ALUNES QUE POSSUEM NOTA JÁ CADASTRADA
		for(int i=0;i<NOME.length;i++) {
			if(nota[i] > 0) {
				System.out.printf("\n %s | %d\t | %s\t| %s",matricula[i],nota[i],(ativo[i])?"ATIVO":"INATIVO",NOME[i]);
				System.out.printf("\n %s",linha(76,"-"));
				System.out.printf("\n DESEMPENHO: %s ",(nota[i] > 5)?"Ótimo, continue assim!":"Estude mais...");
				System.out.printf("\n %s",linha(76,"─"));
			}
		}
		
	}// FIM MAIN
	
	//FUNÇÃO PARA CRIAR UMA LINHA DEDIVISÃO
	public static String linha(int tamanho, String simbolo) {
		String linha="";
		for(int i=0;i<tamanho;i++) {
			linha += simbolo;
		}
		return linha;
	}
}
