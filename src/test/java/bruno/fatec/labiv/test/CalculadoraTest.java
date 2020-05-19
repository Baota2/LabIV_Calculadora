package bruno.fatec.labiv.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bruno.fatec.labiv.core.Calculadora;

public class CalculadoraTest {
	
	private Calculadora page = new Calculadora();	

	@Test
	public void adicaoDeValores() {
		double resultado = page.adicao(2, 2);
		assertEquals(4, resultado, 0);
	}
	
	@Test
	public void subtracaoDeValores() {
		double resultado = page.subtracao(5, 4);
		assertEquals(1, resultado, 0);
	}
	
	@Test
	public void multiplicacoDeValores() {
		double resultado = page.multiplicacao(1.5, 2);
		assertEquals(3, resultado, 0);
	}
	
	@Test
	public void divisaoDeValores() {
		double resultado = page.divisao(3, 2);
		assertEquals(1.5, resultado, 0);
	}
	
	@Test
	public void porcentagemDeValor() {
		double resultado = page.porcentagem(25, 48);
		assertEquals(12, resultado, 0);
	}
}
