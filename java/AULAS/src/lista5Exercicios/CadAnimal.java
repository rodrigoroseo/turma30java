package lista5Exercicios;

import java.util.*;

public class CadAnimal {

	public static void main(String[] args) {
		final int anoAtual = 2021;
		//Collection do tipo List
		List<Animal> animais = new ArrayList<>();
		//Armazenar dados da List
		animais.add(new Cachorro("Dogão", 2010));
		animais.add(new Cavalo("Pé de pano", 2005));
		animais.add(new Preguica("Dorminhoco", 2016));
		//Remover dados da list
		animais.remove(0);
		//Atualizar dados da list
		animais.set(1, new Preguica("Molezaaa", 2016));
		//Apresentar todos os dados da list
		System.out.println("\n NOME\t\t| IDADE");
		for(Animal animal : animais) {
			System.out.print("------------------------\n");
			System.out.println(" "+animal.getNome()+"\t| "+animal.calcularIdade(anoAtual));
		}
		
	}

}
