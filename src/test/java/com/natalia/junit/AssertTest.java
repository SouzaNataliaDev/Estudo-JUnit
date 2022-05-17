package com.natalia.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.jupiter.api.Test;

public class AssertTest {
	@Test
	public void testAssertArrayEqual() { // método que está comparando os dois dados recebidos.
		byte[] esperado = "teste".getBytes();
		byte[] atual = "teste".getBytes();

		assertArrayEquals(esperado, atual);

	}

	@Test
	public void testAssertEquals() {
		assertEquals("text", "text");

	}

	@Test
	public void testAssertFalse() {
		assertFalse(false);

	}

	@Test
	public void testAssertNotNull() { // garante que o objeto não esta retornando um valor nulo
		assertNotNull(new Object());
	}
	@Test 
	public void testAssertNotSame () { // verifica se os objetos não sao os mesmos.
		assertNotSame (new Object(), new Object());
	}
	@Test 
	public void testAssertNull () {
		assertNull (null);
}
	@Test 
	public void testAssertSame () {
		Integer aNumber = Integer.valueOf(768);
		assertSame (aNumber, aNumber);
}
}