package entidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TesteSimples {

	@Test
	void test() {
		//cenario
		int valor1=-10, valor2=20;
		int resultado;
		//execução
		resultado = valor1+valor2;
		//verificação
		Assert.assertEquals(resultado, 10);
	}

}
