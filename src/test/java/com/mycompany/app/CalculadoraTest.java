package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculadoraTest {
	private static ICalculadora calculadora;

	@BeforeClass
	public static void iniciaCalculadora() {
		calculadora = new Calculadora();
	}

	@Before
	public void antesDeCadaTeste() {
		System.out.println("Isso é executado antes de cada teste");
	}

	@After
	public void depoisDeCadaTeste() {
		System.out.println("Isso é executado depois de cada teste");
	}

	@Test
	public void testeSoma() {
		int resultado = calculadora.soma(4, 4);

		assertEquals(7, resultado);
	}

	@Test
	public void testeDivisao() {
		try {
			int resultado = calculadora.divisao(10, 0);

			assertEquals(5, resultado);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

}