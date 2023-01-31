package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Operaciones;

class operacionproba {

	@Test
	void testSumar() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 3, numero2 = 5;
		int resultado = operaciones.sumar(numero1, numero2);
		assertEquals(resultado,8);
	}

	@Test
	void testRestar() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 27, numero2 = 13;
		int resultado = operaciones.restar(numero1, numero2);
		assertEquals(resultado,14);
	}

	@Test
	void testMultiplicar() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 20, numero2 = 40;
		int resultado = operaciones.multiplicar(numero1, numero2);
		assertEquals(resultado,800);
	}

	@Test
	void testDividir() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 10, numero2 = 2;
		int resultado = operaciones.dividir(numero1, numero2);
		assertEquals(resultado,5);
	}

	@Test
	void testResto() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 7, numero2 = 5;
		int resultado = operaciones.resto(numero1, numero2);
		assertEquals(resultado,2);
	}

}
