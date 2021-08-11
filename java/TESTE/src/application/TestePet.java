package application;

import entities.Pet;

public class TestePet {
	public static void main (String[] args) {
		Pet animal1 = new Pet("ANGORRA", 2019);
		animal1.setPorte('M');
		animal1.emiteSom();
	}
}
