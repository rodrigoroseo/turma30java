package programas;

import java.util.*;
import classes.*;

public class LojaReiDoHamburguer {
	public static void main(String[] args) {
		List <Produto> produtos = new ArrayList<>();
		List <Carrinho> carrinho = new ArrayList<>();
		
		produtos.add(new Produto("G6-1","Royale",15,10));
		produtos.add(new Produto("G6-2","Quarteirão",12.50,10));
		produtos.add(new Produto("G6-3","Mentiroso",15,10));
		produtos.add(new Produto("G6-4","Grande Rei",12.50,10));
		produtos.add(new Produto("G6-5","Empilhador",15,10));
		produtos.add(new Produto("G6-6","Cheddar",12.50,10));
		produtos.add(new Produto("G6-7","Vegetariano",15,10));
		produtos.add(new Produto("G6-8","Frango",12.50,10));
		produtos.add(new Produto("G6-9","Abacaxi",15,10));
		produtos.add(new Produto("G6-10","Lanche feliz",12.50,10));
		
	}
}
