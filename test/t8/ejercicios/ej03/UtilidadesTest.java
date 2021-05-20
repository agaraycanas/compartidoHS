package t8.ejercicios.ej03;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import t8.ejercicios.ej03.exception.NumeroException;

public class UtilidadesTest {
	
	private Utilidades utilidades;
	
	@BeforeEach
	public void setUp() {
		this.utilidades = new Utilidades();
	}
	
	@Test
	@DisplayName("-1 hace saltar NumeroException")
	public void esPrimoTest01() {
		assertThrows(NumeroException.class, ()->utilidades.esPrimo(-1), "");
	}
	
	@Test
	@DisplayName("0 no es primo")
	public void esPrimoTest02() throws NumeroException {
		assertFalse(utilidades.esPrimo(0));
	}

	@Test
	@DisplayName("1 no es primo")
	public void esPrimoTest03() throws NumeroException {
		assertFalse(utilidades.esPrimo(1));
	}
	
	@Test
	@DisplayName("13 sí es primo")
	public void esPrimoTest04() throws NumeroException {
		assertTrue(utilidades.esPrimo(13));
	}

	@Test
	@DisplayName("999.999 no es primo")
	public void esPrimoTest05() throws NumeroException {
		assertFalse(utilidades.esPrimo(999999));
	}

	@Test
	@DisplayName("1.000.000 no es primo")
	public void esPrimoTest06() throws NumeroException {
		assertFalse(utilidades.esPrimo(1000000));
	}

	@Test
	@DisplayName("1.000.001 hace saltar NumeroException")
	public void esPrimoTest07() {
		assertThrows(NumeroException.class, ()->utilidades.esPrimo(1000001), "");
	}

	
}
