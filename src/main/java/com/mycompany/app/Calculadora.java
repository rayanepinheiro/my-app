package com.mycompany.app;

public class Calculadora implements ICalculadora {

	@Override
	public int soma(int a, int b) {
		return a + b;
	}

	@Override
	public int subtracao(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplicacao(int a, int b) {
		return a * b;
	}

	@Override
	public int divisao(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divisor não pode ser zero");
		}

		return a / b;
	}
}
