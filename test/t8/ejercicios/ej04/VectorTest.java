package t8.ejercicios.ej04;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import t8.ejercicios.ej04.exception.InputDataException;

public class VectorTest {
	
	private int[] crearVector(int numElementos) {
		int[] v = new int[numElementos];
		for (int i=0;i<numElementos;i++) {
			v[i] = 1;
		}
		return v;
	}
	
	@Test
	@DisplayName("{3,2,1} => {1,2,3}")
	public void ordenar01Test() throws InputDataException {
		int[] vectorInicial = { 3,2,1 };
		int[] vectorEsperado = { 1,2,3 };
		assertArrayEquals(vectorEsperado, Vector.ordenar(vectorInicial));
	}
	
	@Test
	@DisplayName("{-3,-2,-1} => {-3,-2,-1}")
	public void ordenar02Test() throws InputDataException {
		int[] vectorInicial = { -3,-2,-1 };
		int[] vectorEsperado = { -3, -2, -1 };
		assertArrayEquals(vectorEsperado, Vector.ordenar(vectorInicial));
	}
	
	@Test
	@DisplayName("{3,2,1} => {1,2,3}")
	public void ordenar03Test() throws InputDataException {
		int[] vectorInicial = { 1,2,1 };
		int[] vectorEsperado = { 1,1,2 };
		assertArrayEquals(vectorEsperado, Vector.ordenar(vectorInicial));
	}
	
	@Test
	@DisplayName("null => XInputData")
	public void ordenar04Test() throws InputDataException {
		int[] vectorInicial = null;
		assertThrows(InputDataException.class, ()->Vector.ordenar(vectorInicial), "null => XInputData");
	}

	@Test
	@DisplayName("[1,1..(4999)...,1] => [1,1..(4999)...,1]")
	public void ordenar05Test() throws InputDataException {
		int[] vectorInicial = crearVector(4999);
		int[] vectorEsperado = crearVector(4999);
		assertArrayEquals(vectorEsperado, Vector.ordenar(vectorInicial));
	}

	@Test
	@DisplayName("[1,1..(5000)...,1] => [1,1..(5000)...,1]")
	public void ordenar06Test() throws InputDataException {
		int[] vectorInicial = crearVector(5000);
		int[] vectorEsperado = crearVector(5000);
		assertArrayEquals(vectorEsperado, Vector.ordenar(vectorInicial));
	}

	@Test
	@DisplayName("[1,1..(5001)...,1] => XInputData")
	public void ordenar07Test() throws InputDataException {
		int[] vectorInicial = crearVector(5001);
		assertThrows(InputDataException.class, ()-> Vector.ordenar(vectorInicial) , "[1,1..(5001)...,1] => XInputData" );
	}

}
