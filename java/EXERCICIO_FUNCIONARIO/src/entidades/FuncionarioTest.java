package entidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class FuncionarioTest {

	@Test
	void testCalcularSalario() {
		//cenario
		Funcionario func1 = new Terceiro("001",10,10.00,1);
		double salario;
		//execução
		salario = func1.calcularSalario();
		//verificação
		Assert.assertEquals(salario, 101.00);
	}
	
	@Test
	void testCalcularSalarioNegativo() {
		//cenario
		Funcionario func1 = new Terceiro("001",10,-10.00,1);
		double salario;
		//execução
		salario = func1.calcularSalario();
		//verificação
		Assert.assertEquals(salario, 1.0);
	}

}
